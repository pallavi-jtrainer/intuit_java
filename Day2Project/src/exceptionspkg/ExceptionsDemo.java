package exceptionspkg;

public class ExceptionsDemo {
	public void divide(int a, int b) {
		if(b <= 0) {
			throw new ArithmeticException("Denominator cannot be Zero");
		}
		double ans = a / b;
		System.out.println(ans);
	}
	
	public void checkAge(int age) throws InvalidAgeException, ClassNotFoundException {
		if (age < 18) {
			throw new InvalidAgeException("Age is less than 18. Not suitable");
		}
		
		System.out.println("Suitable and Eligible to Vote");
	}
}
