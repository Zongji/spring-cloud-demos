package com.example.product.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    public String all() {
        return "all prouct";
    }
}
