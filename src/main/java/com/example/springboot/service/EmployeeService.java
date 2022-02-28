package com.example.springboot.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.springboot.entity.Employee;
import com.example.springboot.exception.EmployeeNotFound;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id) throws EmployeeNotFound;
	void deleteEmployeeById(long id);
	Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
