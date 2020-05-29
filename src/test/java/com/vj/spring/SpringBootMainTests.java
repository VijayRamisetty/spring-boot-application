package com.vj.spring;

import com.vj.spring.dao.EmployeeDAO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("dev")
class SpringBootMainTests {

	@Autowired
	EmployeeDAO employeeDAO;

	@Test
	void contextLoads() {
		Assertions.assertNotNull(employeeDAO.getAllEmployees());
	}


}
