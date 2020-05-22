package com.vj.spring.controller;

import com.vj.spring.dao.EmployeeDAO;
import com.vj.spring.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Qualifier("employeeDAOImpl")
    @Autowired
    EmployeeDAO employeeDAO;

    @RequestMapping(value = "/list")
    public List<Employee> listPersons() {
        return employeeDAO.getAllEmployees();
    }

}
