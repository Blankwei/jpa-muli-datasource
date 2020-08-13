package com.savoidage.jpamulidatasource.datasource;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Author: created by savoidage
 * CreateTime: 2020-08-13 17:34
 * Description: 数据源配置
 */
@ConfigurationProperties(prefix = "spring.datasource.database2")
@Component
@Data
public class DataBase2Properties {

    private String url;

    private String username;

    private String password;

    private String driverClassName;
}
