package com.miracle.api;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author miracle
 * @create 2020/04/01
 * @description 启动类
 */
@SpringBootApplication
@MapperScan("com.miracle.api.mapper")
@EnableDubbo
public class MiracleApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiracleApiApplication.class, args);
    }

}
