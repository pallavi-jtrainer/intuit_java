package inheritance_pack;

public class ContractEmployee extends Employee implements EmployeeInterface, EmployeeInterface2{

	// declare and assign
//	private final String EMPLOYEE_TYPE = "Contract";
	
	private final String EMPLOYEE_TYPE;
	//default constructor
//	public ContractEmployee() {
//		EMPLOYEE_TYPE = "Contract";
//	}
	
	{
		EMPLOYEE_TYPE = "Contract";
	}
	
	public String getEMPLOYEE_TYPE() {
		return EMPLOYEE_TYPE;
	}
	
	@Override
	public void eatLunch() {
		super.eatLunch();
		
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sampleMethod() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
	}

}
