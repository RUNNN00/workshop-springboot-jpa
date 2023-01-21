package com.webservicedemo.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservicedemo.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
