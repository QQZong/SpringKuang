package com.qin.main;

import com.qin.config.QinConfig;
import com.qin.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(QinConfig.class);
        User user = context.getBean("user",User.class);
        System.out.println(user.getName());
    }
}
