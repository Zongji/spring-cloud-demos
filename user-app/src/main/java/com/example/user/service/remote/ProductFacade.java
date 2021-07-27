package com.example.user.service.remote;


import com.example.user.model.resp.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("product-app")
public interface ProductFacade {

    @GetMapping("/product/get-favor-products")
    public List<Product> getFavorProductsByUserId(@RequestParam("userId") String userId);
}
