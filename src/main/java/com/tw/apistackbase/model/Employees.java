package com.tw.apistackbase.model;

import java.util.ArrayList;
import java.util.List;

public class Employees {
    private  int id;
    private String name;
    private  int age;
    private String gender;
    private  int salary;

    public Employees(int id, String name, int age, String gender, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public static List<Employees> createEmployees() {
        List<Employees>employee=new ArrayList<>();
        Employees employe=new Employees(4,"alibaba1",20,"Male",6000);
        employee.add(employe);
        employee.add(new Employees(11,"lisi",19,"Female",7000));
        return  employee;

    }
}
