package com.welcome;

public class Task {

	String Name;
	int rollno;
	int batch;

	int mobile;
	String Collegename;
	static Task t1 = new Task();
	static Task t2 = new Task();

	static void details() {

		t1.Name = "Tarangini";
		t1.rollno = 12195;
		t1.batch = 81;
		t1.mobile = 111;
		t1.Collegename = "jntu";

		t2.Name = "abc";
		t2.rollno = 1;
		t2.batch = 81;
		t2.mobile = 222;
		t2.Collegename = "aaa";
		t2.display();

	}

	void display() {
		System.out.println("first student name is:" + t1.Name);
		System.out.println("first student rollno is:" + t1.rollno);
		System.out.println("first student batch is:" + t1.batch);
		System.out.println("first student mobilenumber is:" + t1.mobile);
		System.out.println("first student college name is:" + t1.Collegename);
		System.out.println("second student name is:" + t2.Name);
		System.out.println("second student rollno is:" + t2.rollno);
		System.out.println("second student batch is:" + t2.batch);
		System.out.println("second student mobilenumber is:" + t2.mobile);
		System.out.println("second student college name is:" + t2.Collegename);

	}

	public static void main(String[] args) {
		System.out.println("start");
		details();

	}

}
