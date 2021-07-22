package com.example.user.controller;

import com.example.user.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/all")
    public User all() {
        System.out.println("-------dedeudheuhdue------");

        User user = new User();
        user.setId("11111111111111");
        user.setName("liming");
        user.setAge(23);
        return user;
    }
}
