package org.heiraricalinhert;

public class Axis extends Bank {

	private void display() {
	System.out.println("axis bank"); 

	}
	public void deposti() {
		System.out.println("10000");

	}
	public void withdraw() {
		System.out.println("1000");

	}
	
	public static void main(String[] args) {
		Axis q = new Axis();
		q.display();
		q.deposti();
		q.withdraw();
	}
	
	
}
