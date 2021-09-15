package com.kttkpm_th_15_09.repository;


import com.kttkpm_th_15_09.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
