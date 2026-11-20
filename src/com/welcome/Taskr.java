package com.welcome;

public class Taskr {

String Name;
int rollno;
int batch;

int mobile;
String Collegename;
static Taskr t1 = new Taskr();

static void details() {

	t1.Name = "Tarangini";
	t1.rollno = 12195;
	t1.batch = 81;
	t1.mobile = 111;
	t1.Collegename = "jntu";
	System.out.println("first student name is:" + t1.Name);
	System.out.println("first student rollno is:" + t1.rollno);
	System.out.println("first student batch is:" + t1.batch);
	System.out.println("first student mobilenumber is:" + t1.mobile);
	System.out.println("first student college name is:" + t1.Collegename);


	t1.Name = "abc";
	t1.rollno = 1;
	t1.batch = 81;
	t1.mobile = 222;
	t1.Collegename = "aaa";
	System.out.println("first student name is:" + t1.Name);
	System.out.println("first student rollno is:" + t1.rollno);
	System.out.println("first student batch is:" + t1.batch);
	System.out.println("first student mobilenumber is:" + t1.mobile);
	System.out.println("first student college name is:" + t1.Collegename);

}


public static void main(String[] args) {
	System.out.println("start");
	details();

}

}
