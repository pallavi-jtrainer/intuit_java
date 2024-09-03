package inheritance_pack;

public class Employee {

	private int employeeId;
	private String empName;
	private double salary;
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Employee(int employeeId, String empName, double salary, Address address) {
		this.employeeId = employeeId;
		this.empName = empName;
		this.salary = salary;
		this.address = address;
	}
	
	public Employee(int employeeId, String empName, double salary) {
		this.employeeId = employeeId;
		this.empName = empName;
		this.salary = salary;
	}
	
	public Employee() {
	}

	public int getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", empName=" + empName 
				+ ", salary=" + salary + ", address="
				+ address + "]";
	}
	
	public void showEmployeeDetails() {
		System.out.println("Id: " + employeeId + ", Name: " + empName
				+ ", Salary: " + salary);
	}
		
}
