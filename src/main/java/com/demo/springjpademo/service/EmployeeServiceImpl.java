package com.demo.springjpademo.service;

import com.demo.springjpademo.entity.EmployeeEntity;
import com.demo.springjpademo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeEntity getEmployee(Long id) {
        return employeeRepository.findOne(id);
    }

    @Override
    public EmployeeEntity createEmployee(EmployeeEntity employeeEntity) {
        return employeeRepository.save(employeeEntity);
    }
}
