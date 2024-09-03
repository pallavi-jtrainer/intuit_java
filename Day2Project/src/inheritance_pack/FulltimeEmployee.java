package inheritance_pack;

public class FulltimeEmployee extends Employee {
	@Override
	public void showEmployeeDetails() {
//		// TODO Auto-generated method stub
		super.showEmployeeDetails();
		System.out.println("I am a full time employee.");
		System.out.println("My address is: " + getAddress());
	}

	@Override
	public void sampleMethod() {
		System.out.println("Abstract method implementation in derived class");
		
	}
	
	public void myMethod() {
		finalMethod();
	}
	
	

}
