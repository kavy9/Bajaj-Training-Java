package javatest;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.IndexOutOfBoundsException;
import javax.management.JMRuntimeException;
import java.lang.ArrayIndexOutOfBoundsException;
import java.util.*;

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

class Aa {
	 int a=0;
	 Bb b = new Bb();
	 public String toString(){
	  return "a=" + a + ", b.a=" + b.a;
	 }
	}

	class Bb {
	 int a=1;
	}

	class Test {
	 public static void main(String[]args){
	  Aa a1=new Aa();
	  System.out.println(a1);
	 }
	}
