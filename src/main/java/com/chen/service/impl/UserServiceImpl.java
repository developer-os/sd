package com.chen.service.impl;

import com.chen.dao.mapper.UserMapper;
import com.chen.pojo.User;
import com.chen.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Administrator on 2017/6/25 0025.
 */
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> selectByLoginName(User userVo) {
       List<User> users = userMapper.selectByLoginName(userVo.getName());
        return users;
    }

    @Override
    public void insertByVo(User userVo) {

    }

    @Override
    public User selectVoById(Long id) {
        return null;
    }

    @Override
    public void updateByVo(User userVo) {

    }

    @Override
    public void updatePwdByUserId(Long userId, String md5Hex) {

    }

    @Override
    public void selectDataGrid(User pageInfo) {

    }

    @Override
    public void deleteUserById(Long id) {

    }
}
