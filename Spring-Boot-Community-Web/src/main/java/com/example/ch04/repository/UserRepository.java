package com.example.ch04.repository;

import com.example.ch04.domain.User;

public interface UserRepository extends org.springframework.data.jpa.repository.JpaRepository<User, Long> {
    User findByEmail(String email);
}
