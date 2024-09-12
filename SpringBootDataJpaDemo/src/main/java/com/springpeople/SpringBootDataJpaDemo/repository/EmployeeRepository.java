package com.springpeople.SpringBootDataJpaDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.springpeople.SpringBootDataJpaDemo.entity.Employee;

import jakarta.transaction.Transactional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	public Employee findByEmpId(int id);
	public Employee findByEmail(String email);
	public List<Employee> findAllByDeptId(int id);
	
//	@Modifying
//	@Transactional
//	@Query("UPDATE Employee e set e.deptId = ?2 where e.empId = ?1")
//	public int updateDeptId(int id, int dept);
	
	@Modifying
	@Transactional
	@Query("UPDATE Employee e set e.deptId = :dept where e.empId = :id")
	public int updateDeptId(@Param("id") int id, @Param("dept") int dept);
	
	//returns the last record
	@Query("select e from Employee e Order By e.empId desc limit 1")
	public Employee findLastEmployee();
	
	public Employee findTopByOrderByEmpIdDesc();
	
	public List<Employee> findAllBySalaryBetween(double min, double max);
	
	public int countByDeptId(int id);
}
