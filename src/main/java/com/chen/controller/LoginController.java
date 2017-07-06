package com.chen.controller;

import com.chen.pojo.User;
import com.chen.util.DigestUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/6/26 0026.
 */

@Controller
public class LoginController {
    protected Logger logger = LogManager.getLogger(LoginController.class);

    @RequestMapping("/login")
    @ResponseBody
    public String loginPost(@RequestBody User loginUser, HttpServletRequest request) throws Exception {
        logger.info("login ");
        if (StringUtils.isEmpty(loginUser.getLoginName())) {
            throw new Exception("user name is null");
        }
        if (StringUtils.isEmpty(loginUser.getPassword())) {
            throw new Exception("pwd is null");
        }
        Subject user = SecurityUtils.getSubject();
//        UsernamePasswordToken token = new UsernamePasswordToken(loginUser.getLoginName(), loginUser.getPassword());
        UsernamePasswordToken token = new UsernamePasswordToken(loginUser.getLoginName(), "202cb962ac59075b964b07152d234b70");
        token.setRememberMe(true);
        try {
            user.login(token);
            request.getSession().setAttribute("user",loginUser);
            logger.info("============================login success==================================================");
//            return "forward:/jsp/admin.jsp";
            return "success";
//            return "redirect:/admin"
        } catch (UnknownAccountException e) {
            throw new RuntimeException("the count not exit", e);
        } catch (DisabledAccountException e) {
            throw new RuntimeException("account can't use", e);
        } catch (IncorrectCredentialsException e) {
            throw new RuntimeException("pwd is wrong", e);
        } catch (Throwable e) {
            throw new RuntimeException("other exception", e);
        }
    }

//    public Object renderError(String msg) {
//        return null;
//    }

//    @RequestMapping("/rr")
//    public String userTest() {
//        return "login";
//    }
}
