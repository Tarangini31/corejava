package com.welcome;

public class Gar {
	@Override
	protected void finalize() throws Throwable {

		System.out.println("start method called");
		System.out.println(e4);
	}

	void key() {

		System.out.println("hello");

	}

	void hi() {

		System.out.println("hi");
		//System.out.println(e4);


	}

	public static void main(String[] args) {

		Gar e1 = new Gar();
		Gar e2 = new Gar();
		Gar e3 = new Gar();
		Gar e4 = new Gar();
		e4.hi();

		e1 = null;
		e2 = e3;
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);


		System.out.println("finalize method called");

		//new Gar().key();
		new Gar();
		System.gc();

	}

}
