package com.chen.service;

import com.chen.pojo.User;

import java.util.List;

/**
 * Created by Administrator on 2017/6/25 0025.
 */
public interface IUserService {
    List<User> selectByLoginName(User userVo);

    void insertByVo(User userVo);

    User selectVoById(Long id);

    void updateByVo(User userVo);

    void updatePwdByUserId(Long userId, String md5Hex);

    void selectDataGrid(User pageInfo);

    void deleteUserById(Long id);
}
