package com.couture;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.couture.mapper")
@SpringBootApplication
public class CommentApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommentApplication.class, args);
    }

}
