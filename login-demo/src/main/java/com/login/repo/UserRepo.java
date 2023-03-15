package com.login.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.login.model.User;


@Service
public interface UserRepo extends JpaRepository<User, Integer> {

}
