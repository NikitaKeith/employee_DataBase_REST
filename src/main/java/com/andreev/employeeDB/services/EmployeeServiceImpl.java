package com.andreev.employeeDB.services;

import com.andreev.employeeDB.entity.Employee;
import com.andreev.employeeDB.repositories.EmployeeRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor(onConstructor_ = {@Autowired})
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAllEmployees() {
    log.info("Getting all employees");
        return employeeRepository.findAll();
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        log.info("{} was saved", employee.getName());
        employeeRepository.save(employee);
        return employee;
    }

    @Override
    public Optional<Employee> findById(Long id) {
        log.info("employee {} was got", id);
        return employeeRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        log.info("employee {} was deleted", id);
        employeeRepository.deleteById(id);
    }

    @Override
    public Optional<Employee> findByName(String username) {
        log.info("employee {} was found", username);
        return employeeRepository.findByName(username);
    }
}