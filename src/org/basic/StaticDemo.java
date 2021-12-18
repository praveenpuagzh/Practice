package org.basic;

public class StaticDemo {

	private void show() {
		System.out.println("pondicherry is beatuiful city");

	}

	static void display() {
		System.out.println("this is static method");

	}

	static {
		System.out.println("im first");

	}

	public static void main(String[] args) {
		StaticDemo sd = new StaticDemo();
		sd.show();
		display();

	}

}
