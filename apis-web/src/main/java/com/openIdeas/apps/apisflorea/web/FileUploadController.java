package com.openIdeas.apps.apisflorea.web;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.openIdeas.apps.apisflorea.intf.ImportFileServiceIntf;
import com.openIdeas.apps.apisflorea.result.FileResult;

/**
 * 文件上传client
 * 
 * @author Evan Mu
 */
@Controller
@RequestMapping("/file")
public class FileUploadController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    CommonsMultipartResolver multipartResolver;

    @Autowired
    private transient ImportFileServiceIntf importFile;

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    public FileResult fileUpload(HttpServletRequest request) {
        final String methodName = "fileUpload";
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        if (!multipartResolver.isMultipart(multipartRequest)) { // 判断 request 是否有文件上传,即多部分请求...
            throw new RuntimeException("未上传文件");
        }
        // 1. 获取上传文件属性
        // srcfname 是指 文件上传标签的 name=值
        MultiValueMap<String, MultipartFile> multfiles = multipartRequest.getMultiFileMap();
        String fileName = null;
        MultipartFile file = null;
        for (String srcfname : multfiles.keySet()) {
            // 获取文件名和MultipartFile文件对象
            MultipartFile mfile = multfiles.getFirst(srcfname);
            fileName = mfile.getOriginalFilename();
            file = mfile;
        }
        logger.debug(methodName + " 上传文件:{}", fileName);

        // 3. 文件上传业务接口处理
        try {
            return importFile.importCsv(file.getInputStream());
        } catch (IOException e) {
            logger.error(methodName + " 读取文件失败");
        }
        return null;
    }

}
