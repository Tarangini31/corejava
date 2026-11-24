package javafirstcode;

public class Test2 {

 static int employeeid=1;
	String employeename;
	long mobileno;
	String depname;
	int basesalary;
	int totalsalary;
	int age;
	boolean active;
	char gender;
	int bonus;
	static Test2 a = new Test2();
	static Test2 b = new Test2();
	static Test2 c = new Test2();

	public static void main(String[] args) {
		a.details();
	}

	void details() {

		a.employeeid=employeeid;
		a.employeename = "Tarangini";
		a.mobileno = 123;
		a.depname = "dev";
		a.basesalary = 1000;
		a.age = 24;
		a.active = true;
		a.gender = 'f';
		a.bonus = 500;
		b.employeeid=employeeid++;
		b.employeename = "a";
		b.mobileno = 124;
		b.depname = "frontend";
		b.basesalary = 500;
		b.age = 24;
		b.active = false;
		b.gender = 'm';
		b.bonus = 200;
		c.employeeid=employeeid++;
		c.employeename = "b";
		c.mobileno = 125;
		c.depname = "database";
		c.basesalary = 1000;
		c.age = 24;
		c.active = true;
		c.gender = 'f';
		c.bonus = 500;
		a.salary();
	}

	static void salary() {
	a.totalsalary = a.basesalary + a.bonus;
	b.totalsalary = b.basesalary + b.bonus;
	c.totalsalary = c.basesalary + c.bonus;
a.completion();
	}

static void completion() {
System.out.println(a.employeeid + " "+ a.employeename + " " + a.mobileno + " "+ a.depname + " "+a.basesalary + " "+a.age +" " + a.active + " "+a.gender+ " " +a.bonus+ " "+ a.totalsalary) ;
System.out.println(b.employeeid + " "+ b.employeename + " " + b.mobileno + " "+ b.depname + " "+b.basesalary + " "+b.age +" " + b.active + " "+b.gender+ " " +b.bonus+ " "+ b.totalsalary) ;
System.out.println(c.employeeid + " "+ c.employeename + " " + c.mobileno + " "+ c.depname + " "+c.basesalary + " "+c.age +" " + c.active + " "+c.gender+ " " +c.bonus+ " "+ c.totalsalary) ;

}

}
