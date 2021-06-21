package com.techmaster.demo.service;

import com.techmaster.demo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImp implements EmployeeService{
    @Override
    public List<Employee> findAll() {
        return null;
    }

    @Override
    public Employee findById(long id) {
        return null;
    }

    @Override
    public void addOrUpdate(Employee employee) {

    }

    @Override
    public void deleteById(long id) {

    }
}
