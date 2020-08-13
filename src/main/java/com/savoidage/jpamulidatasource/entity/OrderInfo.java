package com.savoidage.jpamulidatasource.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Author: created by savoidage
 * CreateTime: 2020-08-13 16:12
 * Description: 订单实体类
 */
@Data
@Entity(name = "OrderInfo")
public class OrderInfo implements Serializable {

    /**
     * 订单id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    /**
     * 顾客id
     */
    @Column(name = "consumer_id")
    private Integer consumerId;

    /**
     * 购买产品id
     */
    @Column(name = "product_id")
    private Integer productId;

    /**
     * 订单总价
     */
    @Column(name = "order_price")
    private BigDecimal orderPrice;

    /**
     * 订单备注
     */
    @Column(name = "order_remark")
    private String orderRemark;

    /**
     * 订单状态
     */
    @Column(name = "status")
    private Boolean status;

    /**
     * 下单时间
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 更新时间
     */
    @Column(name = "update_date")
    private Date updateDate;

}
