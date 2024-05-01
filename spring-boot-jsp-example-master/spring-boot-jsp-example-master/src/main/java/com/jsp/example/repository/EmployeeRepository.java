package com.jsp.example.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.example.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
   
}


