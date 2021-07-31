package com.example.user.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@RefreshScope
@Component
public class UserNacosProperties {

    @Value("${config.age}")
    private String age;

    public String getAge() {
        return age;
    }
}
