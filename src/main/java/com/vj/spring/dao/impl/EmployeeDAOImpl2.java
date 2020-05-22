package com.vj.spring.dao.impl;

import com.vj.spring.dao.EmployeeDAO;
import com.vj.spring.dto.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeDAOImpl2  implements EmployeeDAO {

    //list is working as a database
    private List<Employee> employeeList;

    public EmployeeDAOImpl2() {
        employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "Ram" ,24));
        employeeList.add(new Employee(2, "Adam",35));
        employeeList.add(new Employee(3, "Robert",33));
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    @Override
    public Employee getEmployeeById(int user_id) {
        return null;
    }

    @Override
    public void saveEmployee(Employee employee) {

    }

    @Override
    public void deleteEmployee(Employee Employee) {

    }
}
