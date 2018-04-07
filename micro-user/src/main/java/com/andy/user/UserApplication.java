package com.andy.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author: Mr.ruolin
 * @createBy: 2018-03-31 16:34
 **/

/*
@SpringCloudApplication注解包含了一下三个注解
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
*/
@EnableHystrixDashboard
@SpringCloudApplication
@EnableDiscoveryClient
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
