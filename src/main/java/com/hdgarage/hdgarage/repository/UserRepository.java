package com.hdgarage.hdgarage.repository;

import com.hdgarage.hdgarage.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

}
