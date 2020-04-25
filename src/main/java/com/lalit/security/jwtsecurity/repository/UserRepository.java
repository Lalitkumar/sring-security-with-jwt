package com.lalit.security.jwtsecurity.repository;

import com.lalit.security.jwtsecurity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
        public User findByUserName(final String userName);
}
