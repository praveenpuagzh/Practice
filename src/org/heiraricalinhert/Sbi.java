package org.heiraricalinhert;

public class Sbi extends Bank {

	private void dispaly() {
		System.out.println("sbi bank");

	}
	public void deposti() {
		System.out.println("10000");

	}
	public void withdraw() {
		System.out.println("3000");

	}
	
	public static void main(String[] args) {
		
		Sbi p =  new Sbi();
		p.dispaly();
		p.deposti();
		p.withdraw();
	}
}
