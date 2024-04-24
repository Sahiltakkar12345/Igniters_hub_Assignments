package com.service;

import java.util.List;

import com.entity.Employee;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);
    void saveEmployee(Employee employee);
    void updateEmployee(Employee employee);
    void deleteEmployee(Long id);
}
