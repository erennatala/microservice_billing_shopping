package com.ecommerce.billing.service.Impl;

import com.ecommerce.billing.model.Order;
import com.ecommerce.billing.repository.OrderRepository;
import com.ecommerce.billing.service.OrderService;

import java.util.List;

public class OrderServiceImpl implements OrderService {
   private final OrderRepository orderRepository;
    public OrderServiceImpl(OrderRepository orderRepository) {
         this.orderRepository = orderRepository;
    }
    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
    @Override
    public Order getOrderById(Long orderId) {
        return orderRepository.findById(orderId).orElse(null);
    }
    @Override
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }
    @Override
    public Order updateOrder(Order order) {
        return orderRepository.save(order);
    }
    @Override
    public void deleteOrder(Long orderId) {
        orderRepository.deleteById(orderId);
    }
    @Override
    public String getOrder() {
        return "Order";
    }

}
