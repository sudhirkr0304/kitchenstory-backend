package com.kitchenstory.kitchenstorybackend.controller;

import com.kitchenstory.kitchenstorybackend.entity.Order;
import com.kitchenstory.kitchenstorybackend.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/all")
    public List<Order> getAllOrders() {
        return orderService.getAllOrder();
    }

    @PostMapping("/add")
    public void addOrder(@RequestBody Order order) {
        orderService.addOrder(order);
    }
}
