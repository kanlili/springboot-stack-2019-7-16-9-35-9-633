package com.tw.apistackbase.controller;

import com.tw.apistackbase.model.Employees;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/employees")
public class EmployeesController {
    @GetMapping
    public List<Employees> getEmployees() {

        return Employees.createEmployees();
    }
    @GetMapping("/{id}")
    public Employees getEmployees(@PathVariable int id) {
        List<Employees>employee=Employees.createEmployees();
        return employee.stream().filter(e -> e.getId() == id).collect(Collectors.toList()).get(1);
    }
    @PostMapping
    public  List<Employees>  postEmployee(@RequestBody Employees employees){
        List<Employees>employee=Employees.createEmployees();
        employee.add(employees);
        return employee;
    }
    @PutMapping
    public List<Employees> putEmployees(@RequestBody Employees employees){
        List<Employees>employee=Employees.createEmployees();
        employee.set(employees.getId(),employees);
        return  employee;
    }
    
}

