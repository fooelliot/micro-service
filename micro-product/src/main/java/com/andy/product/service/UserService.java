package com.andy.product.service;

import com.andy.core.entity.primary.User;
import com.andy.product.fallback.UserServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: Mr.ruolin
 * @createBy: 2018-03-31 19:23
 **/
//, name = "userService", url = "${xxx}"
@FeignClient(value = "micro-user",fallbackFactory = UserServiceFallback.class)
@RequestMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE ,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public interface UserService {

    @GetMapping("/{userId}")
    User user(@PathVariable("userId") String userId);

}
