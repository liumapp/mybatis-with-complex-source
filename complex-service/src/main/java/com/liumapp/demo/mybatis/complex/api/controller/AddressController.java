package com.liumapp.demo.mybatis.complex.api.controller;

import com.alibaba.fastjson.JSON;
import com.liumapp.demo.mybatis.complex.api.testa.domain.ShippingAddress;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liumapp
 * @file AddressController.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/19/18
 */
@RestController
@RequestMapping("address")
public class AddressController {

    @RequestMapping("/add")
    public String addAddress (@RequestBody ShippingAddress shippingAddress) {
        return JSON.toJSONString("success");
    }

}
