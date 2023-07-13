package com.siv.coffeecloud.service;

import com.siv.coffeecloud.model.Order;
import com.siv.coffeecloud.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record OrderService(OrderRepository orderRepository) {

    @Autowired
    public OrderService {
    }

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(Long id) {
        return orderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found"));
    }

    public Order save(Order order) {
        return orderRepository.save(order);
    }

    public Order update(Long id, Order orderDetails) {
        Order order = findById(id);
        // update order details here
        return orderRepository.save(order);
    }

    public void delete(Long id) {
        orderRepository.deleteById(id);
    }
}
