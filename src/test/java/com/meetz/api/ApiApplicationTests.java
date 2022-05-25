package com.meetz.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.meetz.api.model.Employee;
import com.meetz.api.service.EmployeeService;

@SpringBootTest
class ApiApplicationTests {
	
	@Autowired
	private EmployeeService employeeService;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testSaveEmployee() {
		Employee employee =  new Employee();
		employee.setFirstName("Lama");
		employee.setLastName("BALDE");
		employee.setMail("balde@gmail.com");
		employee.setPassword("euoereroei");
		
		employeeService.saveEmployee(employee);
		
	}

}
