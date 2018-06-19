package com.liumapp.demo.mybatis.complex.api.controller;

import com.alibaba.fastjson.JSON;
import com.liumapp.demo.mybatis.complex.api.testb.domain.Order;
import com.liumapp.demo.mybatis.complex.api.testb.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liumapp
 * @file OrderController.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/19/18
 */
@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/add")
    public String addOrder (@RequestBody Order order) {
        orderService.insert(order);
        return JSON.toJSONString("success");
    }

    @RequestMapping("/detail")
    public String getOrderDetail (@RequestBody Order order) {
        return JSON.toJSONString("success");
    }

}
