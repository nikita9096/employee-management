package com.example.springboot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.springboot.entity.Employee;
import com.example.springboot.repository.EmployeeRepository;

@SpringBootTest

class EmployeeManagementWebappApplicationTests {
	@Autowired
	EmployeeRepository employeeRepository;
	@Test
	void saveEmployeeTest(){
		Employee employee = new Employee("Nikita","Bhure","bhurenikita@gmail.com");
		employeeRepository.save(employee);
		
		boolean actualResult =  employeeRepository.existsById((long) 1);
		Assertions.assertTrue(actualResult);
	}

}
