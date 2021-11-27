package sampleprgs;

public class Typecast {
	
	
	public static void main(String[] args) {
		
		//automatic type casting done when change in lower to higher datatype
		
		int salary = 3000;
		double newsalary = salary;
		System.out.println(newsalary);
		
		// narrow type casting
		double balance = 5000.45;
		int newbalance = (int) balance;
		System.out.println(newbalance);
	
	}
	
	

}
