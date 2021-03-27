package com.ex.smartcamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
// 扫描mybatis mapper包路径
@MapperScan(basePackages="com.ex.smartcamp.mapper")
// 扫描所有需要的包，包含一些自用的工具类包
@ComponentScan(basePackages={"com.ex.smartcamp", "org.n3r.idworker"})
public class SmartcampApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartcampApplication.class, args);
    }

}
