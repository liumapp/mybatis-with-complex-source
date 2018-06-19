package com.liumapp.demo.mybatis.complex.api.testb.service.impl;

import com.liumapp.demo.mybatis.complex.api.testb.domain.Order;
import com.liumapp.demo.mybatis.complex.api.testb.mapper.OrderMapper;
import com.liumapp.demo.mybatis.complex.api.testb.service.OrderService;
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

    @Override
    public int insert(Order order) {
        return orderMapper.insert(order);
    }
}
