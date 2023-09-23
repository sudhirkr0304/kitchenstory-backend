package com.kitchenstory.kitchenstorybackend.repository;

import com.kitchenstory.kitchenstorybackend.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
