package com.webservicedemo.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservicedemo.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
