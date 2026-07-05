package com.amigoscode.springbootlearning.nextjsbasics.repository;

import com.amigoscode.springbootlearning.nextjsbasics.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}