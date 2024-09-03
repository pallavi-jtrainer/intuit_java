package mainpkg;

import inheritance_pack.Address;
import inheritance_pack.Employee;
import inheritance_pack.FulltimeEmployee;

public class MainClass {

	public static void main(String[] args) {
//		FulltimeEmployee emp = new FulltimeEmployee();
//		emp.setEmployeeId(2);
//		emp.setAddress(new Address(129, "1st cross", "jayanagar", "bangalore", "KA", 560011));
////		System.out.println(emp.toString());
//		emp.showEmployeeDetails();
		
		//Employee e = new Employee();
		FulltimeEmployee e = new FulltimeEmployee();
		e.setEmployeeId(1);
		e.setEmpName("Something");
		e.setSalary(6373.00);
		
		FulltimeEmployee.setManager("EmployeeX");
		
		e.showEmployeeDetails();
		
		
		
		FulltimeEmployee e1 = new FulltimeEmployee();
		e1.setEmployeeId(1);
		e1.setEmpName("Something");
		e1.setSalary(6373.00);
		e1.showEmployeeDetails();
		
		e1.setManager("Employee Z");
		e.showEmployeeDetails();
		
		e1.showEmployeeDetails();
		
		
		//e.sampleMethod();
	}

}
