package com.jonathanpaskalis.Spring.Boot.CRUD.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonathanpaskalis.Spring.Boot.CRUD.model.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
  Optional<User> findByEmail(String email);
}
