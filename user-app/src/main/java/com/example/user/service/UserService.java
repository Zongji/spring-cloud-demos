package com.example.user.service;

import com.example.user.model.resp.Product;
import com.example.user.service.remote.ProductFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private ProductFacade productFacade;

    public List<Product> getFavorProducts(String userId) {
        return productFacade.getFavorProductsByUserId(userId);
    }
}
