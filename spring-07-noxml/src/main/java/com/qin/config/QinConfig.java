package com.qin.config;

import com.qin.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.qin.pojo")
public class QinConfig {
    @Bean
    public User user(){
        return new User();
    }
}
