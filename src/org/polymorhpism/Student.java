package org.polymorhpism;

public class Student extends Employee{

	/*here the student class overrides the employee class methods */
	
	/*The method must have the same name as in the parent class
	The method must have the same parameter as in the parent class.
	There must be an IS-A relationship (inheritance).*/

	@Override
	public void empdetails(String name) {
		System.out.println("student name:"+name);
	}
	
	@Override
	public void empdetails(Integer id, String city) {
		System.out.println("student id:"+id+"\n"+"city:"+city);
	}
	
	@Override
	public void empdetails(long phone) {
		System.out.println("phone:"+phone);
	}
	
	/*this method created for student class*/
	
	private void studentage(Integer age) {
	System.out.println("student age:"+age);

	}
	
	public static void main(String[] args) {
		Student q = new Student();
		
		q.empdetails("praveen");
		q.empdetails(123, "puducherry");
		q.empdetails(54658656);
		q.studentage(20);
	}
}
