package com.kttkpm_th_15_09.service;



import com.kttkpm_th_15_09.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAll();
    Employee addEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    void deleteEmployee(int id);
}
