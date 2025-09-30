package com.jonathanpaskalis.Spring.Boot.CRUD.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jonathanpaskalis.Spring.Boot.CRUD.model.entity.User;
import com.jonathanpaskalis.Spring.Boot.CRUD.repository.UserRepository;

@Service
@Transactional
public class UserService {
  private final UserRepository repo;
  public UserService(UserRepository repo) { this.repo = repo; }
  

}
