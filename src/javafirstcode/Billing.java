package javafirstcode;

public class Billing {

	byte itemcount;
	double itemprice;
	int discount;
	char grade;
	double exactdiscount;
	double finalbill;
	int roundedbill;
	int gradecode;

	public static void main(String[] args) {
		Billing a = new Billing();
		a.itemcount = 5;
		a.itemprice = 88.76;
		a.discount = 5;
		a.grade = 'A';
		a.gradecode= a.grade;
		a.exactdiscount = (a.discount * a.itemprice * a.itemcount) / 100;
		a.finalbill = ((a.itemprice * a.itemcount) - (a.exactdiscount));
		a.roundedbill = (int) a.finalbill;
		System.out.println(a.itemcount);
		System.out.println(a.itemprice);
		System.out.println(a.discount);
		System.out.println(a.grade);
		System.out.println(a.exactdiscount);
		System.out.println(a.finalbill);
		System.out.println(a.roundedbill);
		System.out.println(a.gradecode);
	}
}
