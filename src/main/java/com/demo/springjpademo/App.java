package com.demo.springjpademo;

import com.demo.springjpademo.entity.EmployeeEntity;
import com.demo.springjpademo.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by I076619 on 7/20/2016.
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        EmployeeService employeeService = context.getBean(EmployeeService.class);
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setName("jpa");
        employeeEntity = employeeService.createEmployee(employeeEntity);
        System.out.println(employeeEntity.getId());
    }
}
