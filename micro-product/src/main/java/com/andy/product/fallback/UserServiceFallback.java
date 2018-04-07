package com.andy.product.fallback;

import com.andy.core.entity.primary.User;
import com.andy.product.service.UserService;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author: Mr.ruolin
 * @createBy: 2018-03-31 21:44
 **/
@Slf4j
@Component
public class UserServiceFallback implements FallbackFactory<UserService> {

    @Override
    public UserService create(Throwable throwable) {
        return new UserService() {
            @Override
            public User user(String userId) {
                log.warn("进入fallback方法！");
                User user = new User();
                user.setUsername("default name");
                return user;
            }
        };
    }
}
