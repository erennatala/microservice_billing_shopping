package com.ecommerce.billing.service;

import com.ecommerce.billing.model.Order;

import java.util.List;

public interface OrderService {
    List<Order> getAllOrders();
    Order getOrderById(Long orderId);
    Order createOrder(Order order);
    Order updateOrder(Order order);
    void deleteOrder(Long orderId);

    String getOrder();
}
