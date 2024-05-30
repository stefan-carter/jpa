package com.carter.spring_data_jpa;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    private List<Employee> employeeList = new ArrayList<>();

    public Employee addEmployee(Employee employee) {
        employeeList.add(employee);
        return employee;
    }
}
