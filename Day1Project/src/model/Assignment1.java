package model;

public class Assignment1 {
	public void assignment(String name, int age, char loc, char gender) { 
//		String name = "Pranav";
//		int age = 23;
//		char loc = 'v';
//		char gender = 'm';
		
		double premium = 0.0;
		
		if(loc == 'v' || loc == 'V') {
			switch(gender) {
			case 'm':
			case 'M':
				if(age >= 18 && age < 30) {
					premium = 2500.00;
				}
				if(age >= 30 && age < 45) {
					premium = 4500.00;
				}
				if(age  >= 45 && age < 60) {
					premium = 5600.00;
				} else {
					premium = 0.0;
				}
				break;
			case 'f':
			case 'F':
				break;
			default:
				break;
			}
		}
	}
}
