package com.pcaboor.api.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pcaboor.api.model.Employee;
import com.pcaboor.api.service.EmployeeService;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
     * Read - Get all employees
     * 
     * @return - An Iterable object of Employee full filled
     */
    @GetMapping("/employees") // <--- GET routes accès à la data par un tiers
    public Iterable<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @GetMapping("/employee/{id}")
    public Optional<Employee> getEmployee(@PathVariable Long id) { // <--- PathVariable /!\ important
        return employeeService.getEmployee(id);
    }

    @PostMapping("/employee")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @DeleteMapping("/employee/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }

    // @PutMapping("/employee/{id}")
    // public Employee modifyEmployee(@RequestBody Employee employee) {
    // return employeeService.(employee);
    // }

    // Other methods...

}