package javatest;

import javax.management.JMRuntimeException;

class Age extends JMRuntimeException{
	Age(String msg){
		super(msg);
		System.out.println();
	}
}
public class Test {

	public static boolean valid(int age) throws Age {
		if(age<18) {
			throw new Age("not old enough");
		}
		else {return false;}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=17;
		try {
			valid(17);
		}catch(Age e) {
			System.out.println("You're Not old enough");
			//e.printStackTrace();
		}finally {
			
		}
		String b = "something";
		b.substring(0,35);
	}

}
