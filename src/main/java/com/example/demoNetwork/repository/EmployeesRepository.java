package com.example.demoNetwork.repository;

import com.example.demoNetwork.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesRepository extends JpaRepository<Employees, Long> {
    // JpaRepository already contains built-in methods like findAll(), save(), findById(), etc.
}