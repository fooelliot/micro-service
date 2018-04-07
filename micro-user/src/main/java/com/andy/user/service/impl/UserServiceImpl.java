package com.andy.user.service.impl;

import com.andy.core.entity.primary.User;
import com.andy.user.dto.UserDto;
import com.andy.user.repository.primary.UserRepository;
import com.andy.user.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Mr.ruolin
 * @createBy: 2018-03-31 19:22
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User user(String userId) {
        return userRepository.findUserById(userId);
    }

    @Override
    public void save(UserDto userDto) {
        User user = new User();
        BeanUtils.copyProperties(userDto, user);
        userRepository.save(user);
    }
}
