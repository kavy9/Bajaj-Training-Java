
package javatest;

public class Test {
	public static int pro(int a,int b) throws Exception{
		return a/0;
	}
	public static void main(String args[]){
		int a=5,b=3;
		try {
			pro(a,b);
		} catch (ArithmeticException e) {
			
			
			System.out.println("what??");
		}catch(Exception e) {
			
		}
	}
}