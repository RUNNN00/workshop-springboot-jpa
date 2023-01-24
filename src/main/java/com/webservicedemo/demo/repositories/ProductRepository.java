package com.webservicedemo.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservicedemo.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {}