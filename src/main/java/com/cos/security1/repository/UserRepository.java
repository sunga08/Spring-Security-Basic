package com.cos.security1.repository;

import com.cos.security1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.ResponseBody;

//JpaRepository를 상속했기 때문에 @Repository 없어도 IoC가 됨
public interface UserRepository extends JpaRepository<User, Integer> {

    public User findByUsername(String username);

}
