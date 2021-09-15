package com.kttkpm_th_15_09.rest;

import com.kttkpm_th_15_09.entity.Employee;
import com.kttkpm_th_15_09.service.Impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeRestController {
    @Autowired
    EmployeeServiceImpl employeeService;

    @GetMapping
    public List<Employee> getAll() {
        return employeeService.getAll();
    }
    @PostMapping
    public Employee add(Employee employee){
        employeeService.addEmployee(employee);
        return employee;
    }
    @PutMapping
    public  Employee update(Employee employee){
        employeeService.updateEmployee(employee);
        return  employee;
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        employeeService.deleteEmployee(id);
    }
}
