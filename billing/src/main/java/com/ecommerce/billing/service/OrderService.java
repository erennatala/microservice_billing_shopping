package com.ecommerce.billing.service;
import com.ecommerce.billing.model.Order;
import org.hibernate.annotations.SecondaryRow;
import org.springframework.stereotype.Service;

import java.util.List;

public interface OrderService {
    Order addOrderItems(Long OrderId, List<String> orderItems);

    List<String > getOrderItems(Long orderId);

    List<Order> getAllOrders();
    Order getOrderById(Long orderId);
    Order createOrder(Order order);
    Order updateOrder(Order order);
    void deleteOrder(Long orderId);

    String getOrder();
}
