package com.savoidage.jpamulidatasource.service;

import com.savoidage.jpamulidatasource.entity.Consumer;
import com.savoidage.jpamulidatasource.entity.OrderInfo;
import com.savoidage.jpamulidatasource.entity.Product;

import java.util.List;

/**
 * Author: created by savoidage
 * CreateTime: 2020-08-13 16:46
 * Description: ConsumerService
 */
public interface ConsumerService {

    Consumer createConsumer(Consumer consumer);

    Product createProduct(Product product);

    List<OrderInfo> createOrder(List<OrderInfo> order);

    List<OrderInfo> findOrderList(Integer consumerId);
}
