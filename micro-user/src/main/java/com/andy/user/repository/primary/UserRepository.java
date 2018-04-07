package com.andy.user.repository.primary;

import com.andy.core.entity.primary.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: Mr.ruolin
 * @createBy: 2018-03-31 19:24
 **/
@Repository
public interface UserRepository extends JpaRepository<User, String> {

    User findUserById(String id);

}
