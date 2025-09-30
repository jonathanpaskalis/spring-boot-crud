package com.jonathanpaskalis.Spring.Boot.CRUD.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class UpdateUserRequest {
  @NotBlank public String name;
  @Email @NotBlank public String email;
}
