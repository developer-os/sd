package com.chen.controller;

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
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/6/26 0026.
 */

@Controller
public class LoginController {
    protected Logger logger = LogManager.getLogger(LoginController.class);
    public String index(){
        return "redirect:/index";
    }
    @RequestMapping("/login")
    public Object loginPost(String username,String password) throws Exception {
        logger.info("login ");
        if(StringUtils.isEmpty(username)){
            throw new Exception("user name is null");
        }
        if(StringUtils.isEmpty(password)){
            throw new Exception("pwd is null");
        }
        Subject user = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, DigestUtils.md5Hex(password).toCharArray());
        token.setRememberMe(true);
        try {
            user.login(token);
        }catch (UnknownAccountException e){
            throw new RuntimeException("the count not exit",e);
        }catch (DisabledAccountException e){
            throw new RuntimeException("account can't use",e);
        }catch (IncorrectCredentialsException e){
            throw new RuntimeException("pwd is wrong",e);
        }catch (Throwable e){
            throw new RuntimeException("other exception",e);
        }
        return null;
    }
    public Object renderError(String msg){
        return null;
    }

}
