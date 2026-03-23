package com.example.demoNetwork.controller;

import com.example.demoNetwork.entity.Employees;
import com.example.demoNetwork.repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeesController {

    @Autowired
    private EmployeesRepository repository;

    // GET request: Teammates will use this to fetch all data from your database
    @GetMapping
    public List<Employees> getAllEmployees() {
        return repository.findAll();
    }

    // POST request: You can use this to easily add dummy data to the table
    @PostMapping
    public Employees addEmployee(@RequestBody Employees employee) {
        return repository.save(employee);
    }
}