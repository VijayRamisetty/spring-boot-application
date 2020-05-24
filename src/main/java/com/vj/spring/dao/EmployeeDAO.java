package com.vj.spring.dao;

import com.vj.spring.dto.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> getAllEmployees();
    Employee getEmployeeById(int emp_id);
    void saveEmployee(Employee employee);
    void deleteEmployee (int emp_id);

}
