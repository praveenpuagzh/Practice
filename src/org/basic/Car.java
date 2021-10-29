package org.basic; //package name

public class Car { // class name

	// Methods
	public void brand() {
		System.out.println("Brand:Audi");

	}

	public void model() {
		System.out.println("Model:AU517X75");

	}

	public void color() {
		System.out.println("Color:Black");

	}

	public static void main(String[] args) { // Main method
		Car q = new Car(); // creating objects [classname objrefname = new class name();]
		q.brand();
		q.model();
		q.color();
	}

}
