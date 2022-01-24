package com.bajaj.java;
import java.util.Scanner;

public class HandsonPrac {
	
public static void PrintValue() {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the value");
	int input =sc.nextInt();
	System.out.println(input);
	sc.close();
}
public static int add(int a ,int b) {
	return a+b;
}
public static float multiply(float a,float b) {
	return a*b;
}
public static int ascii(char c) {
	return (int)c;
}
public static void evenOdd(int i) {
	if(i%2==0) {
		System.out.println("it's an even number");
	}
	else {
		System.out.println("it's an odd number");
	}
}
public static void vowelOrNot(char c) {
	switch(c) {
	case 'a':
		System.out.println("Vowel");
		break;
	case 'e':
		System.out.println("Vowel");
		break;
	case 'i':
		System.out.println("Vowel");
		break;
	case 'o':
		System.out.println("Vowel");
		break;
	case 'u':
		System.out.println("Vowel");
		break;
	default :
		System.out.println("Consonent");
		
	}
}
public static int Max(int a,int b,int c) {
	if(a>b & a>c) {
		return a;
	}
	else if(b>a & b>c) {
		return b;
	}else {
		return c;
	}
}
public static boolean leapYear(int i) {
	if(i%4==0) {
			if(i%100!=0) {
				return true;
			}else if(i%100==0) {
				if(i%400==0) {
					return true;
				}else {
					return false;
				}
			}else{return false;}
	}else {
		return false;
	}
}
public static boolean leapYear2(int i) {
	if(i%4==0) {
		if(i%100!=0||i%400==0) {
			return true;
		}else {
			return false;
		}
	}else {
		return false;
	}
}
public static void main(String[] args) {
	int a=3,b=4;
	int c = a;
	a =b;
	b=c;
	c=5;
	//char ch= 'y';
	//vowelOrNot(ch);
	System.out.println(leapYear(2000));
	System.out.println(leapYear2(2000));
	
}
}
