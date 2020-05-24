package com.vj.spring.controller;

import com.vj.spring.dao.EmployeeDAO;
import com.vj.spring.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Qualifier("employeeDAOImpl")
    @Autowired
    EmployeeDAO employeeDAO;

    @RequestMapping(value = "/employee/list")
    public List<Employee> listPersons() {
        return employeeDAO.getAllEmployees();
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable Integer id) {
        return  employeeDAO.getEmployeeById(id);
    }


    @GetMapping("/employee/drop/{id}")
    public String dropEmployeeById(@PathVariable Integer id) {
        employeeDAO.deleteEmployee(id);
        return "deleted";
    }

    @PostMapping("/employee/save/")
    public String saveEmployee(@RequestBody Employee employee) {
        employeeDAO.saveEmployee(employee);
        return "Saved Employee :"+employee;
    }
}
