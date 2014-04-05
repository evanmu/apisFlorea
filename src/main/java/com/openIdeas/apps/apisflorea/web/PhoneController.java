package com.openIdeas.apps.apisflorea.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.openIdeas.apps.apisflorea.dao.PhoneItemDao;
import com.openIdeas.apps.apisflorea.entity.PhoneItem;
import com.openIdeas.apps.apisflorea.result.CollectionResult;

/**
 * 用户手机服务
 * 
 * @author Evan Mu
 */
@Controller
@RequestMapping("/phone")
public class PhoneController {
    // private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private transient PhoneItemDao phoneItemDao;

    /**
     * 发送短信接口
     * 
     * @return
     */
    @RequestMapping(value = "/input")
    public String input() {
        return "/sms/inputPhone";
    }

    @RequestMapping(value = "/list")
    @ResponseBody
    public CollectionResult<List<PhoneItem>> list() {
        List<PhoneItem> list = (List<PhoneItem>) phoneItemDao.findAll();
        CollectionResult<List<PhoneItem>> result = new CollectionResult<List<PhoneItem>>();
        result.setDataSet(list);
        return result;
    }

}
