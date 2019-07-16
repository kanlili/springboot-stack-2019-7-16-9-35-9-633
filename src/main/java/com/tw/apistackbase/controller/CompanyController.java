package com.tw.apistackbase.controller;

import com.tw.apistackbase.model.Company;
import com.tw.apistackbase.model.Employees;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/company")
public class CompanyController {
    @GetMapping
    public List<Company> getCompany() {
        List<Employees>employee=new ArrayList<>();
        return Company.createCompany();
    }
    @GetMapping("/{id}")
    public Company getCompany(@PathVariable int id) {
        List<Company>complany=Company.createCompany();
        return complany.stream().filter(e -> e.getId() == id).collect(Collectors.toList()).get(0);
    }
    @GetMapping("/{id}/employeesList")
    public List<Employees> getEmployees(@PathVariable int id) {
        List<Company>complany=Company.createCompany();
        return complany.stream().filter(e -> e.getId() == id).collect(Collectors.toList()).get(0).getEmployeesList();
    }
    @PostMapping
    public  List<Company>  postCompany(@RequestBody Company company){
        List<Company> companies=Company.createCompany();
        companies.add(company);
        return companies;
    }

}
