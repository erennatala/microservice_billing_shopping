package com.ecommerce.billing.repository;

import com.ecommerce.billing.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    // Define custom query methods or use the inherited methods from JpaRepository
    Order save(Order order);
    List<Order> findByCustomerId(Long customerId);
    Optional<Order> findById(Long orderId);
    Order update(Order order);
    void deleteById(Long orderId);





}
