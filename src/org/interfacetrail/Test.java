package org.interfacetrail;

import java.net.SocketTimeoutException;

public class Test implements Bike, Car {

	@Override
	public void brand() {
		System.out.println("Royal enfild");

	}

	@Override
	public void model() {
		System.out.println("classic 350");
	}

	@Override
	public void year() {
		System.out.println("2015");

	}

	@Override
	public void engineno() {
		System.out.println("ENG54782");

	}

	@Override
	public void veichlenum() {
		System.out.println("PY-01-5487");
	}

	@Override
	public void Carbrand() {
		System.out.println("Volswagen");

	}

	@Override
	public void Carmodel() {
		System.out.println("Fiat");

	}

	@Override
	public void Caryear() {
		System.out.println("2018");

	}

	@Override
	public void Carengineno() {
		System.out.println("ENG545732");

	}

	@Override
	public void Carveichlenum() {
		System.out.println("PY-01-6547");

	}

	public static void main(String[] args) {
		Test p = new Test();
		p.brand();
		p.model();
		p.year();
		p.veichlenum();
		p.engineno();
		p.Carbrand();
		p.Carmodel();
		p.Caryear();
		p.Carveichlenum();
		p.Carengineno();
	}

}
