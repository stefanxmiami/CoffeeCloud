package com.siv.coffeecloud.service;

import com.siv.coffeecloud.model.Order;
import com.siv.coffeecloud.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class OrderService {
    private final OrderRepository orderRepository;


    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
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

    public OrderRepository orderRepository() {
        return orderRepository;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (OrderService) obj;
        return Objects.equals(this.orderRepository, that.orderRepository);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderRepository);
    }

    @Override
    public String toString() {
        return "OrderService[" +
                "orderRepository=" + orderRepository + ']';
    }

}
