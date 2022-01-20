package javatest;

class A{
	public int a;
	public A() {
		
	}
	public A(int a){
		this.a = a;
	}
}
class B extends A{
	public int b;
	public B() {
		
	}
	public B(int a,int b){
		super(a);
		this.b=b;
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
		super.a=123;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C cobj = new C(1,2,3);
		D dobj = new D(4,5,6);
		System.out.println(cobj.a);
		System.out.println(cobj.b);
		System.out.println(cobj.c);
		System.out.println();
		System.out.println(dobj.a);
		System.out.println(dobj.b);
		System.out.println(dobj.d);
		System.out.println();
	}
}
