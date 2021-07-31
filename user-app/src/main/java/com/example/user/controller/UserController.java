package com.example.user.controller;

import com.example.user.config.UserNacosProperties;
import com.example.user.model.resp.Product;
import com.example.user.model.resp.User;
import com.example.user.service.UserService;
import com.example.user.utils.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
//    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;
    @Autowired
    private UserNacosProperties userNacosProperties;

    public UserController() {
    }

    @GetMapping("/all")
    public User all() {
        Logger.info(this, "-------/all------");

        User user = new User();
        user.setId("11111111111111");
        user.setName(userNacosProperties.getName());
        user.setAge(Integer.valueOf(userNacosProperties.getAge()));
        return user;
    }

    @GetMapping("/get-favor-products")
    public List<Product> getFavorProducts(String userId) {
        Logger.info(this, "-------get-favor-products------");
        List<Product> productList = userService.getFavorProducts(userId);
        Logger.info(this, "getFavorProducts resp:" + productList);
        return productList;
    }
}
