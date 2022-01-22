package javatest;

import java.util.*;

interface MyFunction{
	public int afunc(int a);
	//public void bfunc();
}
interface evenOdd{
	public boolean oddeve(int a);
}
interface PosNeg{
	public boolean PosNegfun(int a);
}
interface UpperCase{
	public void upper(String s);
}
public class EmployeeMap {
 public static void f(MyFunction f) {
	 f.afunc(10);
	 
 }
	public static void main(String[] args) {
		Map<Integer,Class_Employee> map = new HashMap<Integer,Class_Employee>();
		map.put(2,new Class_Employee("first",12,134,"dept"));
		map.put(1,new Class_Employee("second",12,134,"dept"));
		map.put(4,new Class_Employee("third",12,134,"dept"));
		map.put(4,new Class_Employee("fourth",12,134,"dept"));
		map.put(3,new Class_Employee("fourth",12,134,"dept"));
		Set<Integer> key = map.keySet();
		for(int a:key) {
			map.get(a);
			System.out.println(map.get(a));
		}
		Set<Map.Entry<Integer,Class_Employee>> value = map.entrySet();
		for (Map.Entry<Integer,Class_Employee> keyvalue : value) {
			System.out.println(keyvalue.getKey() + " : "+ keyvalue.getValue());
		}
		System.out.println("lambda here");
		map.forEach((k,v)->System.out.println(k + " " + v));
	
		MyFunction fun = (a)-> a ;
		
		evenOdd evenodd = (a)->a%2==0?true:false;
		System.out.println(evenodd.oddeve(10));
		System.out.println(evenodd.oddeve(11));
		
		PosNeg posneg = (a)->a>0?true:false;
		System.out.println(posneg.PosNegfun(1));
		System.out.println(posneg.PosNegfun(-1));
		
		UpperCase uc= (s)->System.out.println(s.toUpperCase());
		uc.upper("lower");
		
	}

}
