package com.springpeople.SpringBootDataJpaDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springpeople.SpringBootDataJpaDemo.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>{
	public Department findByDeptId(int id);
	public Department findByDeptName(String name);
}
