package com.example.product.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@RefreshScope
@Component
public class ProductNacosProperties {

    @Value("${user.age}")
    private String age;

    @Value("${my.name}")
    private String name;

    public String getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
