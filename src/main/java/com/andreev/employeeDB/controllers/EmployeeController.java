package com.andreev.employeeDB.controllers;

import com.andreev.employeeDB.entity.Employee;
import com.andreev.employeeDB.exception_handling.NoSuchEmployeeException;
import com.andreev.employeeDB.services.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
@AllArgsConstructor(onConstructor_ = {@Autowired})
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping() //get all
    List<Employee> all() {
        return employeeService.findAllEmployees();
    }

    @GetMapping("/{id}") //get one
    Employee one(@PathVariable Long id) {
        return employeeService.findById(id)
                .orElseThrow(() -> new NoSuchEmployeeException(id+" was not found"));
    }

    @PostMapping() //add a new one
    //todo
    Employee newEmployee(@RequestBody Employee newEmployee) {
        return employeeService.saveEmployee(newEmployee);
    }
    
    @PutMapping("/{id}") //edit
    Employee editEmployee(@RequestBody Employee newEmployee) {
        return employeeService.saveEmployee(newEmployee);
    }

    @DeleteMapping("/{id}")//delete
    void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteById(id);
    }
}