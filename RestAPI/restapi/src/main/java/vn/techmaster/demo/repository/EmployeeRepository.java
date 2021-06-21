package vn.techmaster.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.techmaster.demo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
