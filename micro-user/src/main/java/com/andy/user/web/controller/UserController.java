package com.andy.user.web.controller;

import com.andy.core.entity.primary.User;
import com.andy.user.dto.UserDto;
import com.andy.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author: Mr.ruolin
 * @createBy: 2018-03-31 19:20
 **/
@Slf4j
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{userId}")
    public User user(@PathVariable("userId") String userId){
        log.info("请求的是9902服务器！");
        return userService.user(userId);
    }

    @PostMapping("/save")
    public String save(@Valid UserDto userDto, BindingResult errors){
        if (errors.hasErrors()) {
            errors.getAllErrors().stream().forEach(e -> log.error("表单信息有误：{}",e.getDefaultMessage()));
            return "error";
        }
        userService.save(userDto);
        return "success";
    }



}
