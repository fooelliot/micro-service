package com.andy.product.web.controller;

import com.andy.core.entity.primary.User;
import com.andy.product.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Mr.ruolin
 * @createBy: 2018-03-31 19:20
 **/
@Slf4j
@RestController
public class ProductController {

    @Autowired
    private UserService userService;

    @GetMapping("/{userId}")
    public User user(@PathVariable() String userId){
        return userService.user(userId);
    }


}
