package com.springpeople.SpringBootJpaMappingProject.entity;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

//import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="order_tracking_number", length = 100, nullable = false, unique=true)
	private String orderTrackingNumber;
	
	@Column(name="total_price")
	private double totalPrice;
	
	@Column(name="total_quantity")
	private int totalQuantity;
	
	@Column(name="status")
	private String status;
	
	@Column(name="date_created")
	@CreatedDate
	private LocalDate dateCreated;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "order_id", referencedColumnName = "id")
	private Set<OrderItems> orderItems = new HashSet<OrderItems>();
}