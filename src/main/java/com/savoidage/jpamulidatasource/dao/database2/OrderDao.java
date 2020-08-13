package com.savoidage.jpamulidatasource.dao.database2;

import com.savoidage.jpamulidatasource.entity.OrderInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Author: created by savoidage
 * CreateTime: 2020-08-13 16:47
 * Description: 数据from database2
 */
public interface OrderDao extends JpaRepository<OrderInfo,Integer> {

}
