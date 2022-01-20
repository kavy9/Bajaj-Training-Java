package javatest;

import java.util.ArrayList;
import java.util.Scanner;

abstract class BasicAccount {
	protected int id;
	protected String name;
	protected double balance;
	protected double rate; 
	
	protected BasicAccount(){
		
	}
	
	protected BasicAccount(String a,double b,double c) {
		this.name = a;
		this.balance = b;
		this.rate = c;
	}
	
	public boolean withdraw(double amount) {
		if(amount <= this.balance) {
			this.balance-=amount;
			return true;
		}else {
			return false;
		}
	}
	protected void deposit(double amount) {
		this.balance+=amount;
	}
	protected void setRate(float rate) {
		this.rate=rate;
	}

	public void showSms() {
		// TODO Auto-generated method stub
		System.out.println("hellow");
	}
}
abstract class Pin extends BasicAccount{
	protected int pin;
	Pin(){
		
	}
	Pin(String a,double b,double c,int pin){
		super(a,b,c);
		this.pin = pin;
	}
	protected boolean verifyPin(int pin) {
		if(this.pin ==pin) {
			return true;
		}else {
			return false;
		}
	}
}

public class Accounts {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Pin> accounts = new ArrayList<Pin>();
		Pin[] account = new Pin[10];
		while(true) {
			System.out.println("select your choice");
			System.out.println("Enter 1 to create a new account");
			System.out.println("Enter 2 to create access old account");
			System.out.println("Enter 3 to create");
			System.out.println("Enter 4 to create");
			
		}
	}

}
