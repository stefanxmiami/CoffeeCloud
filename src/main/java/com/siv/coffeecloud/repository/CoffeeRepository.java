package com.siv.coffeecloud.repository;

import com.siv.coffeecloud.model.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CoffeeRepository extends JpaRepository<Coffee, Long> {
    List<Coffee> findByNameContaining(String name);
}
