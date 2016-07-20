package com.demo.springjpademo.service;

import com.demo.springjpademo.entity.EmployeeEntity;

public interface EmployeeService {
    EmployeeEntity getEmployee(Long id);
    EmployeeEntity createEmployee(EmployeeEntity employeeEntity);
}
