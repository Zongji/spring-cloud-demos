package com.example.gateway.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@Configurable
public class RouteConfig {
    @Bean
    public RouteLocator getRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/user")
                        .filters(f->f.addResponseHeader("X-header-test", "test1"))
                        .uri("http://USER-APP/"))
                .build();

    }
}
