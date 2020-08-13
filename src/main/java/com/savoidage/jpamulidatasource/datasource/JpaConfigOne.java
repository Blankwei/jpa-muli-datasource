package com.savoidage.jpamulidatasource.datasource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

/**
 * Author: created by savoidage
 * CreateTime: 2020-08-13 15:59
 * Description: jpa配置数据源1
 */
@Configuration
@EnableJpaRepositories(basePackages = "com.savoidage.jpamulidatasource.dao.database1", // 设置dao所在位置
    entityManagerFactoryRef = "localContainerEntityManagerFactoryBeanOne",// 配置连接工厂
    transactionManagerRef = "platformTransactionManagerOne") // 配置事物管理器
public class JpaConfigOne {

    // 配置数据源
    @Autowired
    @Qualifier("dataBase1DataSource")
    private DataSource dataBase1DataSource;

    @Autowired
    private JpaProperties jpaProperties;

    @Bean
    @Primary
    LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBeanOne(EntityManagerFactoryBuilder builder){
        return builder
                // 设置数据源
                .dataSource(dataBase1DataSource)
                .properties(jpaProperties.getProperties())
                .persistenceUnit("persistenceUnitOne")
                // 设置实体类所在位置.扫描所有带有 @Entity 注解的类
                .packages("com.savoidage.jpamulidatasource.entity")
                .build();
    }

    @Bean
    @Primary
    PlatformTransactionManager platformTransactionManagerOne(EntityManagerFactoryBuilder builder){
        //  配置事物管理器
        return new JpaTransactionManager(localContainerEntityManagerFactoryBeanOne(builder).getObject());
    }
}
