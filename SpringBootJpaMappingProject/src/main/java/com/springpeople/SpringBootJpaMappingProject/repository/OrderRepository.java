package com.springpeople.SpringBootJpaMappingProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springpeople.SpringBootJpaMappingProject.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
