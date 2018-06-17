package com.liumapp.demo.mybatis.complex.service.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liumapp
 * @file UserController.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/17/18
 */
@RestController
@RequestMapping("user")
public class UserController {

    @RequestMapping("/")
    public String addUser () {
        return JSON.toJSONString("success");
    }

}
