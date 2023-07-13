package com.siv.coffeecloud.event;

import com.siv.coffeecloud.model.Order;
import com.siv.coffeecloud.service.OrderService;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class OrderEventListener implements ApplicationListener<ContextRefreshedEvent> {

    private final OrderService orderService;

    public OrderEventListener(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        // This method will be called when the application context is started or refreshed.
        // You can do anything you need with your Orders here.
        // Here's an example of printing all the Orders to the console:

        for (Order order : orderService.findAll()) {
            System.out.println(order);
        }
    }
}
