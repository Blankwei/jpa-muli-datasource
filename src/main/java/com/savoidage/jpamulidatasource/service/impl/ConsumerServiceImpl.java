package com.savoidage.jpamulidatasource.service.impl;

import com.savoidage.jpamulidatasource.dao.database1.ConsumerDao;
import com.savoidage.jpamulidatasource.dao.database2.OrderDao;
import com.savoidage.jpamulidatasource.dao.database2.ProductDao;
import com.savoidage.jpamulidatasource.entity.Consumer;
import com.savoidage.jpamulidatasource.entity.OrderInfo;
import com.savoidage.jpamulidatasource.entity.Product;
import com.savoidage.jpamulidatasource.service.ConsumerService;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Author: created by savoidage
 * CreateTime: 2020-08-13 16:46
 * Description: ConsumerServiceImpl
 */
@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Resource
    private ConsumerDao consumerDao;

    @Resource
    private ProductDao productDao;

    @Resource
    private OrderDao orderDao;

    @Transactional
    @Override
    public Consumer createConsumer(Consumer consumer){
        consumer.setCreateDate(new Date());
        consumer.setUpdateDate(new Date());
        return consumerDao.saveAndFlush(consumer);
    }

    @Transactional
    @Override
    public Product createProduct(Product product){
        product.setDelFlag(false);
        product.setStatus(true);
        product.setCreateDate(new Date());
        product.setUpdateDate(new Date());
        return productDao.saveAndFlush(product);
    }

    @Override
    @Transactional
    public List<OrderInfo> createOrder(List<OrderInfo> orders){
        return orderDao.saveAll(orders);
    }

    @Override
    public List<OrderInfo> findOrderList(Integer consumerId){
        OrderInfo order = new OrderInfo();
        order.setConsumerId(consumerId);
        Example<OrderInfo> example = Example.of(order);
        return orderDao.findAll(example);
    }
}
