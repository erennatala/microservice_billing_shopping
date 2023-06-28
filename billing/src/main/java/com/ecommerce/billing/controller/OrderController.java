package com.ecommerce.billing.controller;

import com.ecommerce.billing.model.Order;
import com.ecommerce.billing.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    private final OrderService orderService;
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }
    @GetMapping("/{orderId}")
    public Order getOrderById(Long orderId) {
        return orderService.getOrderById(orderId);
    }

    @PostMapping
    public Order createOrder(Order order) {
        return orderService.createOrder(order);
    }

    @PutMapping("/{orderId}")
    public Order updateOrder(Order order) {
        return orderService.updateOrder(order);
    }



}
