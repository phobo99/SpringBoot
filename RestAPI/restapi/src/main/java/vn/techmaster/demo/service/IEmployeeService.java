package vn.techmaster.demo.service;

import vn.techmaster.demo.model.Employee;
import vn.techmaster.demo.model.EmployeePOJO;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService {
    List<Employee> findAll();

    Optional<Employee> findByID(Long id);

    Employee save(EmployeePOJO employee);

    void update(Long id,EmployeePOJO employee);

    void deleteByID(Long id);
}
