package org.inhertance;

import org.basic.Car;

public class Bike extends Car { // Bike child class extends car parent class

	/*single child class extends the single parent class is single inheritance*/
	
	public void brand() {
		System.out.println("Brand:Yamha");
	}

	public void model() {
		System.out.println("model:r15");
	}

	public void color() {
		System.out.println("color:red");
	}

	public static void main(String[] args) {

		Bike p = new Bike();
		p.brand();
		p.model();
		p.color();

	}

}
