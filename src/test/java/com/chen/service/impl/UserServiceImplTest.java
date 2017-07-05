package com.chen.service.impl;

import com.chen.service.IUserService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by rchen7 on 2017/7/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring.xml"})
public class UserServiceImplTest {
    @Autowired
    private IUserService userService;
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void selectByLoginName() throws Exception {
    }

    @Test
    public void selectByLoginName1() throws Exception {
//        IUserService userService  = new UserServiceImpl();
        System.out.print(userService.selectByLoginName("admin").get(0).getPhone()+"==============================================");
    }

    @Test
    public void insertByVo() throws Exception {
    }

    @Test
    public void selectVoById() throws Exception {
    }

    @Test
    public void updateByVo() throws Exception {
    }

    @Test
    public void updatePwdByUserId() throws Exception {
    }

    @Test
    public void selectDataGrid() throws Exception {
    }

    @Test
    public void deleteUserById() throws Exception {
    }

    @Test
    public void getUserByName() throws Exception {
    }

    @Test
    public void selectRulesByUserName() throws Exception {
    }

    @Test
    public void selectPrincipalByUserName() throws Exception {
    }

}