package com.qin.config;

import com.qin.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.qin.entity")
public class QinConfig {
    @Bean
    public User user(){
        return new User();
    }
}
