package com.welcome;

public class Variable {

	static int t = 0;
	{
		t++;
	}

	public static void main(String[] args) {
		int a = 10;

		Variable p = new Variable();
		Variable q = new Variable();
		Variable r = new Variable();
		System.out.println(p.t);
		System.out.println(a);

	}
}