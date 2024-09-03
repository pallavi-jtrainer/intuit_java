package mainpkg;

import inheritance_pack.Address;
import inheritance_pack.FulltimeEmployee;

public class MainClass {

	public static void main(String[] args) {
		FulltimeEmployee emp = new FulltimeEmployee();
		emp.setEmployeeId(2);
		emp.setAddress(new Address(129, "1st cross", "jayanagar", "bangalore", "KA", 560011));
//		System.out.println(emp.toString());
		emp.showEmployeeDetails();
	}

}
