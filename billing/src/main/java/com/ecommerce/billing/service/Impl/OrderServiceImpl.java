package com.ecommerce.billing.service.Impl;

import com.ecommerce.billing.model.Order;
import com.ecommerce.billing.repository.OrderRepository;
import com.ecommerce.billing.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    // Inject the OrderRepository dependency
    @Autowired
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
        // Perform validation or any other necessary logic

        // Fetch the existing order from the database
        Order existingOrder = orderRepository.findById(order.getId())
                .orElseThrow(() -> new RuntimeException("Order not found"));

        // Update the properties of the existing order
        existingOrder.setStatus(order.getStatus());

        // Save the updated order back to the database
        return orderRepository.save(existingOrder);
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
