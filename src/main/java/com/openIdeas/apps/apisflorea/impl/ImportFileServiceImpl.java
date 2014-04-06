package com.openIdeas.apps.apisflorea.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openIdeas.apps.apisflorea.dao.PhoneItemDao;
import com.openIdeas.apps.apisflorea.entity.PhoneItem;
import com.openIdeas.apps.apisflorea.enums.InterfaceEm;
import com.openIdeas.apps.apisflorea.intf.ImportFileServiceIntf;
import com.openIdeas.apps.apisflorea.result.FileResult;

@Service("importFile")
public class ImportFileServiceImpl implements ImportFileServiceIntf {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private PhoneItemDao phoneItemDao;
    
    @Override
    public FileResult importCsv(InputStream in) {
        FileResult result = new FileResult();
        // 1. 将临时文件copy到目标路径
        File targetFile = null;
        List<String> phoneNos = null;
        try {
            targetFile = new File(System.getProperty("java.io.tmpdir") + File.separator + System.currentTimeMillis()
                    + ".up");
            OutputStream output = new FileOutputStream(targetFile);
            IOUtils.copy(in, output);

            phoneNos = FileUtils.readLines(targetFile, "utf-8");
            output.close();
        } catch (IOException e) {
            logger.error("上传文件失败");
        }

        // 2. 读取文件到list, 保存记录
        if (null == targetFile || !targetFile.exists() || null == phoneNos) {
            result.fail("FL00000", "上传文件失败");
            return result;
        }

        List<PhoneItem> items = new ArrayList<PhoneItem>();

        PhoneItem item = null;
        for (String phone : phoneNos) {
            item = new PhoneItem();
            item.setPhoneNo(Long.valueOf(phone));
            items.add(item);
        }
        // 先清空，后导入
        phoneItemDao.deleteAll();

        Iterable<PhoneItem> res = phoneItemDao.save(items);
        if (null != res) {
            // 成功个数
            result.setSucdCount(phoneItemDao.count());
        }
        
        //清空smsService phoneList
        InterfaceServcie.getHandler(InterfaceEm.sendSms).clearQueue();

        return result;
    }

}
