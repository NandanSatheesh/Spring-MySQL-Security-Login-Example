package com.gpch.login.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gpch.login.model.User;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User,Long> {


    abstract User findByEmail(String email) ;
}
