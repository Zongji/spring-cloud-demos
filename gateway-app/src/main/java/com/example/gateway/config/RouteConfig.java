package com.example.gateway.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteConfig {
    @Bean
    public RouteLocator getRouteLocator(RouteLocatorBuilder builder) {
        System.out.println("=============RouteConfig init ===================");

        //配置路由映射
        return builder.routes()
                .route(r -> r.path("/user/**")
                        .filters(f->f.addResponseHeader("X-header-test", "test1 user header"))
                        .uri("lb://user-app"))
                .route(r -> r.path("/product/**")
                        .filters(f->f.addResponseHeader("X-header-test", "product header"))
                        .uri("lb://product-app"))
//                .route(r -> r.path("/httpbin/**")
//                        .filters(f -> f.addResponseHeader("X-header-test", "test2"))
//                        .uri("http://httpbin.org:80/")
//                )
                .build();
    }
}
