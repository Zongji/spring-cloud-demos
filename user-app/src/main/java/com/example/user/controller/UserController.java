package com.example.user.controller;

import com.example.user.model.resp.Product;
import com.example.user.model.resp.User;
import com.example.user.service.UserService;
import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public User all() {
        logger.info("-------/all------");

        User user = new User();
        user.setId("11111111111111");
        user.setName("liming");
        user.setAge(23);
        return user;
    }

    @GetMapping("/get-favor-products")
    public List<Product> getFavorProducts(String userId) {
        logger.info("-------get-favor-products------");
        List<Product> productList = userService.getFavorProducts(userId);
        logger.info("getFavorProducts resp:" + productList);
        return productList;
    }
}
