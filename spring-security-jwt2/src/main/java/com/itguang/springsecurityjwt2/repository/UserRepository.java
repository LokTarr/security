package com.itguang.springsecurityjwt2.repository;


import com.itguang.springsecurityjwt2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zhaoxinguo on 2017/9/13.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

}
