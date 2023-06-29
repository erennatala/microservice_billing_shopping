package com.ecommerce.billing.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

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
}
