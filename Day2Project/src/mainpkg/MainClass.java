package mainpkg;

import exceptionspkg.ExceptionsDemo;
import exceptionspkg.InvalidAgeException;
import inheritance_pack.Address;
import inheritance_pack.Employee;
import inheritance_pack.FulltimeEmployee;
import nestedclassespkg.OuterClass;

public class MainClass {

	public static void main(String[] args) {
		ExceptionsDemo obj = new ExceptionsDemo();
//		try {
//			obj.divide(12, 0);
//		} catch (ArithmeticException ex) {
//			System.out.println(ex.getMessage());
//		} catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		try {
			obj.checkAge(17);
		} catch(InvalidAgeException ex) {
			System.out.println(ex.getMessage());
		} catch(ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		
		System.out.println("After exception");
		
//		OuterClass outer = new OuterClass();
//		OuterClass.InnerClass inner = outer.new InnerClass();
//		inner.showVal();
//		
//		OuterClass.StaticInner s = new OuterClass.StaticInner();
//		s.showVal();
		
		
//		FulltimeEmployee emp = new FulltimeEmployee();
//		emp.setEmployeeId(2);
//		emp.setAddress(new Address(129, "1st cross", "jayanagar", "bangalore", "KA", 560011));
////		System.out.println(emp.toString());
//		emp.showEmployeeDetails();
		
		//Employee e = new Employee();
//		FulltimeEmployee e = new FulltimeEmployee();
//		e.setEmployeeId(1);
//		e.setEmpName("Something");
//		e.setSalary(6373.00);
//		
//		FulltimeEmployee.setManager("EmployeeX");
//		
//		e.showEmployeeDetails();
//		
//		
//		
//		FulltimeEmployee e1 = new FulltimeEmployee();
//		e1.setEmployeeId(1);
//		e1.setEmpName("Something");
//		e1.setSalary(6373.00);
//		e1.showEmployeeDetails();
//		
//		e1.setManager("Employee Z");
//		e.showEmployeeDetails();
//		
//		e1.showEmployeeDetails();
		
		
		//e.sampleMethod();
	}

}
