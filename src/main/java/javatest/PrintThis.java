package javatest;

public class PrintThis<T> {
	
	protected T value ;
	
	public PrintThis(T userValue) {
		this.value = userValue;
	}
	
	public void Print() {
		System.out.println(this.value);
	}

}
