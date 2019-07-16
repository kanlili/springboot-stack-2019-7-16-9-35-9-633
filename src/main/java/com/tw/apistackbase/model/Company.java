package com.tw.apistackbase.model;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String companyName;
    private int employeesNumber;
    private List<Employees> employeesList;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(int employeesNumber) {
        this.employeesNumber = employeesNumber;
    }

    public List<Employees> getEmployeesList() {
        return employeesList;
    }

    public void setEmployeesList(List<Employees> employeesList) {
        this.employeesList = employeesList;
    }

    public Company(String companyName, int employeesNumber) {
        this.companyName = companyName;
        this.employeesNumber = employeesNumber;
    }

    public static List<Company> createCompany() {
        List<Company>company=new ArrayList<>();
        company.add(new Company("baidu",10));
        company.add(new Company("google",100));

        return  company;

    }


}
