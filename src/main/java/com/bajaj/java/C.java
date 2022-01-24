package com.bajaj.java;

class A{
	public int a=-2;
	public A() {
		
	}
	public A(int a){
		this.a = a;
	}
	{
		System.out.println("instance a");
	}
	public int Amethod() {
		return 0;
	}
}
class B extends A{
	public int b =super.a;
	//public int a=10;
	public B() {
		
	}
	public B(int a,int b){
		//super(a);
		this.b=b;
	}
	public int Amethod() {
		return 1;
	}
	
}
class D extends B{
	int d;
	public D(int a ,int b,int d) {
		super(a,b);
		this.d = d;
	}
}
public class C extends B{
	public int c;
	public C(int a,int b,int c){
		super(a,b);
		this.c = c;
		//super.a=123;
		
	}
	public C() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C cobj = new C(1,2,3);
		D dobj = new D(4,5,6);
		cobj.C();
		System.out.println(cobj.a);
		System.out.println(cobj.b);
		System.out.println(cobj.c);
		System.out.println();
		System.out.println(dobj.a);
		System.out.println(dobj.b);
		System.out.println(dobj.d);
		System.out.println();
		cobj.Amethod();
		C cobj2 = new C();
		System.out.println(cobj2);
	}
	private void C() {
		System.out.println("constructor method ");
		
	}
}
