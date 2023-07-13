package com.siv.coffeecloud.controller;

import com.siv.coffeecloud.model.Coffee;
import com.siv.coffeecloud.service.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coffees")
public class CoffeeController {

    private final CoffeeService coffeeService;

    @Autowired
    public CoffeeController(CoffeeService coffeeService) {
        this.coffeeService = coffeeService;
    }

    @GetMapping
    public ResponseEntity<List<Coffee>> getAllCoffees() {
        List<Coffee> coffees = coffeeService.findAll();
        return new ResponseEntity<>(coffees, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Coffee> getCoffeeById(@PathVariable("id") Long id) {
        Coffee coffee = coffeeService.findById(id);
        return new ResponseEntity<>(coffee, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Coffee> createCoffee(@RequestBody Coffee coffee) {
        Coffee newCoffee = coffeeService.save(coffee);
        return new ResponseEntity<>(newCoffee, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Coffee> updateCoffee(@PathVariable("id") Long id, @RequestBody Coffee coffeeDetails) {
        Coffee updatedCoffee = coffeeService.update(id, coffeeDetails);
        return new ResponseEntity<>(updatedCoffee, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCoffee(@PathVariable("id") Long id) {
        coffeeService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
