package com.liumapp.demo.mybatis.complex.api.testb.service;

import com.liumapp.demo.mybatis.complex.api.entity.OrderDetail;
import com.liumapp.demo.mybatis.complex.api.testb.domain.Order;

/**
 * @author liumapp
 * @file OrderService.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/19/18
 */
public interface OrderService {

    int insert (Order order);

    OrderDetail selectOrderDetail (Order order);

}
