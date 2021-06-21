package com.techmaster.demo.service;

import com.techmaster.demo.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(long id);

    void addOrUpdate(Employee employee);

    void deleteById(long id);
}
