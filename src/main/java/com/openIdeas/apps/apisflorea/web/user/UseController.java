package com.openIdeas.apps.apisflorea.web.user;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.openIdeas.apps.apisflorea.entity.account.User;
import com.openIdeas.apps.apisflorea.util.UserUtil;

/**
 * 用户相关控制器
 * 
 * @author Evan Mu
 */
@Controller
@RequestMapping("/user")
public class UseController {

    private static Logger logger = LoggerFactory.getLogger(UseController.class);

    /**
     * 登录系统
     * 
     * @param userName
     * @param password
     * @param session
     * @return
     */
    @RequestMapping(value = "/logon")
    public String logon(@RequestParam("username") String userName, @RequestParam("password") String password,
            HttpSession session) {
        logger.debug("logon request: {username={}, password={}}", userName, password);
        if ("admin".equals(userName) && "youare".equals(password)) {
            // read user from database
            User user = new User();
            user.setFirst(userName);
            user.setPassword(password);
            UserUtil.saveUserToSession(session, user);

            // List<Group> groupList = identityService.createGroupQuery().groupMember(userName).list();
            // session.setAttribute("groups", groupList);
            // String[] groupNames = new String[groupList.size()];
            // for (int i = 0; i < groupNames.length; i++) {
            // System.out.println(groupList.get(i).getName());
            // groupNames[i] = groupList.get(i).getName();
            // }
            // session.setAttribute("groupNames", ArrayUtils.toString(groupNames));

            return "redirect:/main/index";
        } else {
            return "redirect:/login?error=true";
        }
    }

    @RequestMapping(value = "/logout")
    public String logout(HttpSession session) {
        session.removeAttribute("user");
        return "/login";
    }
}
