package javatest;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class ComparableImplementationDemo {

	public static void main(String[] args) {
		Set<Class_Employee> set = new TreeSet<Class_Employee>(new sortByName() );
		set.add(new Class_Employee("first",12,134,"dept"));
		set.add(new Class_Employee("second",12,134,"dept"));
		set.add(new Class_Employee("third",12,134,"dept"));
		set.add(new Class_Employee("fourth",12,134,"dept"));
		
		System.out.println(set.toString()); 
		System.out.println(set.contains(new Class_Employee("first",2,134,"dept")));
	}

}
