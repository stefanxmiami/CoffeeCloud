package com.siv.coffeecloud.service;

import com.siv.coffeecloud.model.Coffee;
import com.siv.coffeecloud.repository.CoffeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CoffeeService {

    private final CoffeeRepository coffeeRepository;

    public CoffeeService(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }

    public List<Coffee> findAll() {
        return coffeeRepository.findAll();
    }
    public Coffee findById(Long id) {
        Optional<Coffee> optionalCoffee = coffeeRepository.findById(id);
        return optionalCoffee.orElse(null);
    }

    public Coffee save(Coffee coffee) {
        return coffeeRepository.save(coffee);
    }

    public Coffee update(Long id, Coffee coffeeDetails) {
        Optional<Coffee> optionalCoffee = coffeeRepository.findById(id);
        if (optionalCoffee.isPresent()) {
            Coffee coffee = optionalCoffee.get();
            coffee.setName(coffeeDetails.getName());
            coffee.setPrice(coffeeDetails.getPrice());
            return coffeeRepository.save(coffee);
        } else {
            return null;
        }
    }

    public void delete(Long id) {
        coffeeRepository.deleteById(id);
    }
}
