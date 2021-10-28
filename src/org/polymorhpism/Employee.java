package org.polymorhpism;

public class Employee {
	
	/*Method overloading is same method name but different in parameters
	1. The method name must be same.
	2. The number of parameters must be different.
	3. The data type of parameters must be different.
	4. The sequence of parameters must be different*/
	
	private void empdetails(String name) {
		System.out.println("empname:"+name);
	}
	
	private void empdetails(Integer id,String city) {
	System.out.println("emnpid:"+id+"\n"+"city:"+city);

	}
	
	
	public static void main(String[] args) {
		Employee p = new Employee();
		p.empdetails("praveen");
		p.empdetails(120,"puducherry");
		
		
	}

}
