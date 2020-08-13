package com.savoidage.jpamulidatasource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaMuliDatasourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaMuliDatasourceApplication.class, args);
        System.out.println("jpa-muli-datasource启动成功...");
    }

}
