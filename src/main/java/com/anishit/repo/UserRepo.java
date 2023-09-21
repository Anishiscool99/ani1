package com.anishit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anishit.binding.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
-