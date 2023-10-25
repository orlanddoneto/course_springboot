package com.devOrlando.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devOrlando.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
