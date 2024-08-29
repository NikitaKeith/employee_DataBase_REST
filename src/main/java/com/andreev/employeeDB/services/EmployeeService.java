package com.andreev.employeeDB.services;

import com.andreev.employeeDB.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> findAllEmployees();
    Employee saveEmployee(Employee employee);
    Optional<Employee> findById(Long id);
    void deleteById(Long id);

    Optional<Employee> findByName(String username);
}