package com.chen.service;

import com.chen.pojo.User;
import org.junit.Rule;

import java.security.Principal;
import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 2017/6/25 0025.
 */
public interface IUserService {
    List<User> selectByLoginName(User userVo);

    List<User> selectByLoginName(String LoginName);

    void insertByVo(User userVo);

    User selectVoById(Long id);

    void updateByVo(User userVo);

    void updatePwdByUserId(Long userId, String md5Hex);

    void selectDataGrid(User pageInfo);

    void deleteUserById(Long id);

    User getUserByName(String name);

    Set<String> selectRulesByUserName(String username);

    Set<String> selectPrincipalByUserName(String username);
}
