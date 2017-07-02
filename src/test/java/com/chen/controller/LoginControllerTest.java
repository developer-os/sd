package com.chen.controller;

import org.junit.Test;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2017/7/2 0002.
 */
public class LoginControllerTest {
    @Test
    public void index() throws Exception {
    }

    @Test
    public void login() throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        MultiValueMap<String,String> form = new LinkedMultiValueMap<String,String>();
        form.add("username","root");
        form.add("password","sss");
        restTemplate.postForLocation("http://localhost:9999/sd/login/login.do",form);
    }

    @Test
    public void loginPost() throws Exception {
    }

    @Test
    public void renderError() throws Exception {
    }

}