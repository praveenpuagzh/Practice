package org.polymorhpism;

public class Employee {
	
	/*Method overloading is in same class ,same method name but different in parameters
	1. The method name must be same.
	2. The number of parameters must be different.
	3. The data type of parameters must be different.
	4. The sequence of parameters must be different*/
	
	public void empdetails(String name) {
		System.out.println("name:"+name);
	}
	
	public void empdetails(Integer id,String city) {
	System.out.println("id:"+id+"\n"+"city:"+city);

	}
	
	public void empdetails(long phone) {
	System.out.println("contact:"+phone);

	}
	
	
	public static void main(String[] args) {
		Employee p = new Employee();
		p.empdetails("praveen");
		p.empdetails(120,"puducherry");
		p.empdetails(546487266);
		
		
	}

}
