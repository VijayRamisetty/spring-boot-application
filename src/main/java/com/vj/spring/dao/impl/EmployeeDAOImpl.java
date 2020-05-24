package com.vj.spring.dao.impl;

import com.vj.spring.dao.EmployeeDAO;
import com.vj.spring.dto.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class EmployeeDAOImpl  implements EmployeeDAO {

    //Map is working as a database
    private Map<Integer, Employee> employeeMap;

    public EmployeeDAOImpl() {

        employeeMap = new HashMap<>();
        employeeMap.put(1, new Employee(1, "Ram" ,24));
        employeeMap.put(2, new Employee(2, "Adam",35));
        employeeMap.put(3, new Employee(3, "Robert",33));
    }

    @Override
    public List<Employee> getAllEmployees() {

        return new ArrayList<>(employeeMap.values());
    }

    @Override
    public Employee getEmployeeById(int emp_id) {
        return  employeeMap.get(emp_id);
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeMap.put(employee.getId(), employee);
    }

    @Override
    public void deleteEmployee(int emp_id) {
        employeeMap.remove(emp_id);
    }
}
