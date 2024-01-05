package com.kuang.config;

import com.kuang.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.kuang.pojo")
public class MyConfig {
//    @Bean
    public User ABc(){
        return new User();
    }
}
