package com.andy.user.service;

import com.andy.core.entity.primary.User;
import com.andy.user.dto.UserDto;

/**
 * @author: Mr.ruolin
 * @createBy: 2018-03-31 19:23
 **/
public interface UserService {

    User user(String userId);

    void save(UserDto user);

}
