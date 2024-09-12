package com.springpeople.SpringBootDataJpaDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.springpeople.SpringBootDataJpaDemo.entity.Employee;

import jakarta.transaction.Transactional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	public Employee findByEmpId(int id);
	public Employee findByEmail(String email);
	public List<Employee> findAllByDeptId(int id); 
	
	@Modifying
	@Transactional
	@Query("UPDATE Employee e set e.deptId = ?2 where e.empId = ?1")
	public int updateDeptId(int id, int dept);
}
