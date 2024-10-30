package com.webmaster.learnspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webmaster.learnspring.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
