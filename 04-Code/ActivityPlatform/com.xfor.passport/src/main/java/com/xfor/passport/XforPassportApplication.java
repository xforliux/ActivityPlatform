package com.xfor.passport;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.neo.mapper")
public class XforPassportApplication {

    public static void main(String[] args) {
        SpringApplication.run(XforPassportApplication.class, args);
    }

}
