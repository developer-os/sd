package com.chen.realm;

import com.chen.pojo.User;
import com.chen.service.impl.UserServiceImpl;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Administrator on 2017/7/4 0004.
 */
public class MyRealm extends AuthorizingRealm{
    @Autowired
    UserServiceImpl userService;
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String primaryPrincipal = (String) principalCollection.getPrimaryPrincipal();
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.setRoles(userService.selectRulesByUserName(primaryPrincipal));
        simpleAuthorizationInfo.setStringPermissions(userService.selectPrincipalByUserName(primaryPrincipal));
        return simpleAuthorizationInfo;
    }

    /**
     *
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String principal = (String) authenticationToken.getPrincipal();
        List<User> users = userService.selectByLoginName(principal);
        if(users !=null && users.size()>0 ){
//            SimpleAuthenticationInfo myRealm = new SimpleAuthenticationInfo(users.get(0).getLoginName(), users.get(0).getPassword(), "myRealm");
            SimpleAuthenticationInfo myRealm = new SimpleAuthenticationInfo(users.get(0).getLoginName(), "202cb962ac59075b964b07152d234b70", "myRealm");
            return myRealm;
        }else{
            return null;
        }
    }
}
