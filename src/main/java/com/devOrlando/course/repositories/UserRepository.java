package com.devOrlando.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devOrlando.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
