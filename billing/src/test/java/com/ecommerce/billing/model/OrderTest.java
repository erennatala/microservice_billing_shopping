package com.ecommerce.billing.model;

import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class OrderTest {

    @Test
    public void testOrderConstructorAndGetters() {
        // Create sample data
        Long customerId = 1234L;
        double totalAmount = 99.99;
        String status = "Pending";
        Date orderDate = new Date();

        Order order = new Order(customerId, totalAmount, status, orderDate);

        Assertions.assertEquals(customerId, order.getCustomerId());
        Assertions.assertEquals(totalAmount, order.getTotalAmount(), 0.001);
        Assertions.assertEquals(status, order.getStatus());
        Assertions.assertEquals(orderDate, order.getOrderDate());

    }
    @Test
    public void testOrderSetters() {

        Order order = new Order();
        Long customerId = 1234L;
        double totalAmount = 99.99;
        String status = "Pending";
        Date orderDate = new Date();


        order.setCustomerId(customerId);
        order.setTotalAmount(totalAmount);
        order.setStatus(status);
        order.setOrderDate(orderDate);


        Assertions.assertEquals(customerId, order.getCustomerId());
        Assertions.assertEquals(totalAmount, order.getTotalAmount(), 0.001);
        Assertions.assertEquals(status, order.getStatus());
        Assertions.assertEquals(orderDate, order.getOrderDate());

    }
    @Test
    @Transactional
    @Rollback(false)
    public void testAddOrderItem() {
        //Create sample data
        Long orderId = 1234L;
        List<String> orderItems = new ArrayList<>();
        orderItems.add("Item 1");
        orderItems.add("Item 2");

        // Create an instance of Order
        Order order = new Order();

        // Add order items to the order
        order.setOrderItems(orderItems);

        // Get the order items from the order
        List<String> retrievedOrderItems = order.getOrderItems();
        // Logging
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Items: " + orderItems);
        System.out.println("Retrieved Order Items: " + retrievedOrderItems);


        // Verify that the order items from the order are the same as the sample data
        Assertions.assertEquals(orderItems.size(), retrievedOrderItems.size());
        Assertions.assertEquals(orderItems.get(0), retrievedOrderItems.get(0));
        Assertions.assertEquals(orderItems.get(1), retrievedOrderItems.get(1));



    }
}
