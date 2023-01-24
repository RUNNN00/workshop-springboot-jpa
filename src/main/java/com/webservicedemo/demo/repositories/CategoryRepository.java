package com.webservicedemo.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservicedemo.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {}