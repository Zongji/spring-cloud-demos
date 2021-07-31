package com.example.product.controller;

import com.example.product.config.ProductNacosProperties;
import com.example.product.model.resp.Product;
import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    private final static Logger logger = LoggerFactory.getLogger(ProductController.class);
    @Autowired
    private ProductNacosProperties productNacosProperties;

    @GetMapping("/all")
    public String all() {
        logger.info("url: /all");
        return "all prouct" + productNacosProperties.getName();
    }

    @GetMapping("/get-favor-products")
    public List<Product> getFavorProducts(String userId) {
        logger.info("/get-favor-products , userId:" + userId);
        List<Product> list = Lists.newArrayList();
        list.add(new Product("p001", "iphone"));
        list.add(new Product("p001", "iMac"));

        logger.info("/get-favor-products resp:" + list);
        return list;
    }
}
