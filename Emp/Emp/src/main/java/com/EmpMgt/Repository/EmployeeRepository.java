package com.EmpMgt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EmpMgt.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee , Long>{

}
