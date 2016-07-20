package com.demo.springjpademo.repository;

import com.demo.springjpademo.entity.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by I076619 on 7/20/2016.
 */
public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Long> {
}
