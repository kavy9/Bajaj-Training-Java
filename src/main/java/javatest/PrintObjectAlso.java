package javatest;
import java.lang.Class;
public class PrintObjectAlso<T> extends PrintThis<T>{

	Class type = super.value.getClass(); 
	public PrintObjectAlso(T userValue) {
		super(userValue);
		
	}
	public void PrintType() {
		System.out.println(this.type);
	}
	@Override
	public void Print() {
		System.out.println("so the value is " + this.value);
	}

}
