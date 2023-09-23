package com.kitchenstory.kitchenstorybackend.service;

import com.kitchenstory.kitchenstorybackend.entity.Order;
import com.kitchenstory.kitchenstorybackend.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }


    public List<Order> getAllOrder() {
        return orderRepository.findAll();
    }

    public void addOrder(Order order) {
        orderRepository.save(order);
    }


}
