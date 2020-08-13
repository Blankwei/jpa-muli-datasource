package com.savoidage.jpamulidatasource;

import com.savoidage.jpamulidatasource.entity.Consumer;
import com.savoidage.jpamulidatasource.entity.OrderInfo;
import com.savoidage.jpamulidatasource.entity.Product;
import com.savoidage.jpamulidatasource.service.ConsumerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
class JpaMuliDatasourceApplicationTests {

    @Autowired
    private ConsumerService consumerService;

    @Test
    void contextLoads() {
    }

    @Test
    public void MainTest1() {
        // 测试往database1 新增数据
        Consumer consumer = new Consumer();
        consumer.setConsumerName("张学友");
        consumer.setConsumerPhone("17612364599");
        Consumer serviceConsumer = consumerService.createConsumer(consumer);
        if (null != serviceConsumer && null != serviceConsumer.getId()) {
            System.out.println("成功往[database1]新增一条[consumer]数据,id：" + serviceConsumer.getId());
        }
    }

    @Test
    public void MainTest2() {
        // 测试往database2 新增数据
        Product product = new Product();
        product.setProductName("法国云臣苏打汽水");
        product.setProductPrice(new BigDecimal("217.98"));
        product.setDescription("新品上市 回馈用户");
        Product serviceProduct = consumerService.createProduct(product);
        if (null != serviceProduct && null != serviceProduct.getId()) {
            System.out.println("成功往[database2]新增一条[product]数据,id：" + serviceProduct.getId());
        }
    }

    @Test
    public void MainTest3() {
        List<OrderInfo> orders = new ArrayList<>();
        // 测试往database2 新增数据
        for (int i = 0; i < 10; i++) {
            OrderInfo order = new OrderInfo();
            order.setConsumerId(1);
            order.setProductId(Integer.parseInt(i+""));
            order.setOrderPrice(new BigDecimal("200.05"));
            order.setOrderRemark("货到付款哦");
            order.setStatus(true);
            order.setCreateDate(new Date());
            order.setUpdateDate(new Date());
            orders.add(order);
        }
        List<OrderInfo> order = consumerService.createOrder(orders);
        if (null != order && order.size() > 0) {
            System.out.println("成功往[database2]新增一条[order]数据,id：" + order.size());
        }
    }

    @Test
    public void MainTest4() {
        // 测试查询一对多
        List<OrderInfo> orderList = consumerService.findOrderList(1);
        if (null != orderList && orderList.size() > 0) {
            System.out.println("查询的数据条数：" + orderList.size());
        }
    }
}
