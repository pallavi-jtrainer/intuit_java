package com.springpeople.SpringBootSpringBootInterThreadCommunication.entity;

public class Account {

	private long accountNumber;
	private long customerId;
	private String customerName;
	private double balance;
	
	public long getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public long getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public Account() {
		balance = 100000;
	}
	
	public synchronized void withdraw(double amount) {
		if(this.balance < amount) {
			System.out.println("Balance insufficient! Waiting for Deposit!");
			
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		this.balance -= amount;
		System.out.println(amount + " withdrawn successfully.");
		System.out.println("Current Balance After withdrawal: " + balance);
	}
	
	public synchronized void deposit(double amount) {
		System.out.println("Depositing.....");
		this.balance += amount;
		System.out.println("Current Balance: " + balance );
		System.out.println("Completed depositing!!!");
		notify();
	}
}
