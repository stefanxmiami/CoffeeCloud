package com.siv.coffeecloud.event;

import com.siv.coffeecloud.model.Order;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class OrderEventPublisher implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void publishOrderCreatedEvent(Order order) {
        OrderCreatedEvent orderCreatedEvent = new OrderCreatedEvent(this, order);
        applicationEventPublisher.publishEvent(orderCreatedEvent);
    }
}
