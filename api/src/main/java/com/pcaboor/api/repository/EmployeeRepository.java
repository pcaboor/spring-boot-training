package com.pcaboor.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pcaboor.api.model.Employee;

@Repository // Bean donc communication avec une source de donnee
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}