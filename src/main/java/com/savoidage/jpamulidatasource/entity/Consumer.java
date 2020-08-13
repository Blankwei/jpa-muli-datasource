package com.savoidage.jpamulidatasource.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Author: created by savoidage
 * CreateTime: 2020-08-13 16:05
 * Description: 顾客实体类
 */
@Data
@Entity
public class Consumer implements Serializable {

    /**
     * 顾客id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    /**
     * 顾客名称
     */
    @Column(name = "consumer_name")
    private String consumerName;

    /**
     * 顾客手机号
     */
    @Column(name = "consumer_phone")
    private String consumerPhone;

    /**
     * 新增时间
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 更新时间
     */
    @Column(name = "update_date")
    private Date updateDate;
}
