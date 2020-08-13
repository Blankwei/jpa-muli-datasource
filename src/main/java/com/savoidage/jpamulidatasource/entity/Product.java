package com.savoidage.jpamulidatasource.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Author: created by savoidage
 * CreateTime: 2020-08-13 16:14
 * Description: 产品实体类
 */
@Entity(name = "product")
@Data
public class Product implements Serializable {

    /**
     * 产品id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    /**
     * 产品名称
     */
    @Column(name = "product_name")
    private String productName;

    /**
     * 产品价格
     */
    @Column(name = "product_price")
    private BigDecimal productPrice;

    /**
     * 产品描述
     */
    @Column(name = "description")
    private String description;

    /**
     * 产品状态（上下架）
     */
    @Column(name = "status")
    private Boolean status;

    /**
     * 是否删除
     */
    @Column(name = "del_flag")
    private Boolean delFlag;

    /**
     * 记录新增时间
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 记录更新时间
     */
    @Column(name = "update_date")
    private Date updateDate;
}
