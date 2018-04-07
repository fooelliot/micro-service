package com.andy.user.fallback;

import com.andy.user.web.controller.UserController;
import feign.hystrix.FallbackFactory;

/**
 * @author: Mr.ruolin
 * @createBy: 2018-03-31 22:06
 **/
public class UserControllerFallback implements FallbackFactory<UserController> {

    @Override
    public UserController create(Throwable throwable) {


        return null;
    }
}
