package com.liumapp.demo.mybatis.complex.api.db.testb.service.impl;

import com.liumapp.demo.mybatis.complex.api.entity.OrderDetail;
import com.liumapp.demo.mybatis.complex.api.db.testa.service.ShippingAddressService;
import com.liumapp.demo.mybatis.complex.api.db.testa.service.UserService;
import com.liumapp.demo.mybatis.complex.api.db.testb.domain.Order;
import com.liumapp.demo.mybatis.complex.api.db.testb.mapper.OrderMapper;
import com.liumapp.demo.mybatis.complex.api.db.testb.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author liumapp
 * @file OrderServiceImpl.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/19/18
 */
@Service
@Transactional
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private UserService userService;

    @Autowired
    private ShippingAddressService shippingAddressService;

    @Override
    public int insert(Order order) {
        return orderMapper.insert(order);
    }

    @Override
    public OrderDetail selectOrderDetail(Order order) {
        OrderDetail orderDetail = new OrderDetail();
//        User user = userService
        return orderDetail;
    }

}
