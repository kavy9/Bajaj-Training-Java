package javatest;

import java.io.IOException;
import java.text.ParseException;
import java.lang.IndexOutOfBoundsException;
import javax.management.JMRuntimeException;
import java.lang.ArrayIndexOutOfBoundsException;

//class Base{
//public void display() throws IOException {
//System.out.println("Base" ); }
//}
//class Derived extends Base {
//public void display() throws IOException, ParseException {
//System.out.println("Derived" ); }
//}
//class Test {
//public static void main(String args[]) throws IOException, ParseException{
//Derived b=new Derived();
//b.display(); }
//}

//class Aaa{
//	static int n;
//	public void Aa() {
//		System.out.println("In A ");
//	}
//	void Adiff() {
//		System.out.println("In A diff ");
//	}
//}
//class Bb extends Aaa{
//	public void Aa() {
//		System.out.println(" in B");
//		throw new  IndexOutOfBoundsException("noooo");	}
//	void Bdiff() {
//		System.out.println("In B diff ");
//	}
//}
//
//public class Test {
//	public static void main(String args[]) {
//		String[] str=new String[10];
//		System.out.println(str[1]);
//		Bb var = new Bb() {};
//		Bb var2 = new Bb() {};
//		int abc;
//		Aaa.n=123;
//		try {
//			var.Aa();
//			System.out.println(var.getClass());
//			System.out.println(var2.getClass());
//			System.out.println(Aaa.n);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		var.Adiff();
//	}
//}

public class Test{
	public static void change(int [] a) {
		a[0]=78;
	}
	public static void change(String a) {
		a="123";
	}
	public static void change(Class_Employee e) {
		e.setEmp_id(0);
	}
	public static void main(String [] args) {
		int[] asd = {1,2};
		int [] dsa= asd;
		String abc = "657";
		Class_Employee e = new Class_Employee("name",12,345,"dept");
		change(asd);
		change(abc);
		change(e);
		System.out.println(asd[0]);
		System.out.println(dsa[0]);
		System.out.println(abc);
		System.out.println(e.getEmp_id());
		

	}
}
