package com.andy.product.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: Mr.ruolin
 * @createBy: 2018-03-31 20:37
 **/
@Configuration
public class AppConfig {

//    @Autowired
//    private RestTemplateBuilder builder;
//
//    @Bean
//    @LoadBalanced
//    public RestTemplate restTemplate() {
//        return builder.build();
//    }
}
