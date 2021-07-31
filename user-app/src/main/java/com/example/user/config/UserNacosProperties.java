package com.example.user.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@RefreshScope
@Component
public class UserNacosProperties {

    @Value("${user.age}")
    private String age;

    @Value("${user.name}")
    private String name;

    public String getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
