package com.webservicedemo.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservicedemo.demo.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>
{}
