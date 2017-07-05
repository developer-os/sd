package com.chen.service.impl;

import com.chen.dao.mapper.UserMapper;
import com.chen.pojo.User;
import com.chen.pojo.UserExample;
import com.chen.service.IUserService;
import org.junit.Rule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 2017/6/25 0025.
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    UserMapper userMapper;

    public List<User> selectByLoginName(User userVo) {
        return null;
    }

    public List<User> selectByLoginName(String LoginName) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andLoginNameEqualTo(LoginName);
        List<User> users = userMapper.selectByExample(userExample);
        return users;
    }

    public void insertByVo(User userVo) {

    }

    public User selectVoById(Long id) {
        return null;
    }

    public void updateByVo(User userVo) {

    }

    public void updatePwdByUserId(Long userId, String md5Hex) {

    }

    public void selectDataGrid(User pageInfo) {

    }

    public void deleteUserById(Long id) {

    }

    public User getUserByName(String name) {
        return null;
    }

    public Set<String> selectRulesByUserName(String username) {
        return null;
    }

    public Set<String> selectPrincipalByUserName(String username) {
        return null;
    }
}
