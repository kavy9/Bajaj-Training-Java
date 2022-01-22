
package javatest;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;



public class EmployeewithArrayList{
public static void add_employee(ArrayList<Class_Employee> emp) {
	
}
public static void update_employee(ArrayList<Class_Employee> emp,int index) {
	System.out.println("which field you want to update ");
	System.out.println("insert 1 for name ");
	System.out.println("insert 2 for emp_id ");
	System.out.println("insert 3 for salary ");
	System.out.println("insert 1 for department ");
	Scanner sc=new Scanner(System.in);
	int choice = sc.nextInt();
	switch(choice) {
	case 1 : 
		System.out.println("enter name");
		String name = sc.next();
		emp.get(index).setName(name);
		break;
	case 2 :
		System.out.println("enter emp_id");
		int id = sc.nextInt();
		emp.get(index).setEmp_id(id);
		break;
	case 3 :
		System.out.println("enter salary");
		int salary = sc.nextInt();
		emp.get(index).setSalary(salary);
		break;
	case 4 :
		System.out.println("enter department");
		String dept = sc.next();
		emp.get(index).setDepartment(dept);
		break;
	default:
		System.out.println("incorect choice");
	}
	sc.close();
	
	
}
public static int get_index_by_name(ArrayList<Class_Employee> emp,String name) {
		int index=0;
		for(Class_Employee itr: emp) {
			if(itr.name.equals(name)) {
				return index;
			}
			index++;
		}
	return -1;
}
public static int get_index_by_id(ArrayList<Class_Employee> emp,int id) {
	int index=0;
	for(Class_Employee itr: emp) {
		if(itr.emp_id==id) {
			return index;
		}
		index++;
	}
	return -1;
}
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList<Class_Employee> emp = new ArrayList<Class_Employee>();
	boolean bool = true;
	while(bool) {
		System.out.println("select your choice");
		System.out.println("Enter 1 to add a new Employee");
		System.out.println("Enter 2 to List all Employee");
		System.out.println("Enter 3 to Update an Employee detail");
		System.out.println("Enter 4 to delete an Employee");	
		System.out.println("Enter 5 to Search by name or id ");
		System.out.println("Enter 6 to print sorted list in ASEC");
		System.out.println("Enter 7 to print sorted list in DESC");
		System.out.println("Enter 8 to print sorted by Salary");
		System.out.println("Enter 9 to print sorted by Salary in  Reverse");
		int choice = sc.nextInt();
		if(choice==1) {
			
			System.out.println("enter Id : ");
			int id=sc.nextInt();
			System.out.println("enter name: ");
			String name = sc.next();
			System.out.println("enter salary : ");
			int Salary=sc.nextInt();
			System.out.println("enter dept name: ");
			String dept = sc.next();
			emp.add(new Class_Employee(name,id,Salary,dept));
			
		}
		else if(choice==2) {
			for(Class_Employee itr: emp) {
				System.out.println(itr.toString());
			}
		}
		else if(choice==3) {
			System.out.println("Update by name(1) or id(2) ? ");
			int uchoice = sc.nextInt();
			if(uchoice==1) {
				System.out.println("enter name ");
				String name = sc.next();
				int index=get_index_by_name(emp,name);
				if(index!=-1) {
					update_employee(emp,index);
				}
				else {
					System.out.println("no employee found");
					continue;
				}
			}
			else {
				System.out.println("enter id ");
				int uid = sc.nextInt();
				int index=get_index_by_id(emp,uid);
				if(index!=-1) {
					update_employee(emp,index);
				}
				else {
					System.out.println("no employee found");
					continue;
				}
			}
		}
		else if(choice==4) {
			System.out.println("Delete by name(1) or id(2) ? ");
			int uchoice = sc.nextInt();
			if(uchoice==1) {
				System.out.println("enter name ");
				String name = sc.next();
				int index=get_index_by_name(emp,name);
				if(index!=-1) {
					emp.remove(index);
				}
				else {
					System.out.println("no employee found");
					continue;
				}
			}
			else {
				System.out.println("enter id ");
				int uid = sc.nextInt();
				int index=get_index_by_id(emp,uid);
				if(index!=-1) {
					emp.remove(index);
				}
				else {
					System.out.println("no employee found");
					continue;
				}
			}
	
		}
		else if(choice==5) {
			System.out.println("Search by name(1) or id(2) ? ");
			int uchoice = sc.nextInt();
			switch(uchoice) {
			case 1:
				System.out.println("enter name ");
				String name = sc.next();
				int n_index=get_index_by_name(emp,name);
				if(n_index!=-1) {System.out.println(emp.get(n_index).toString());}else { System.out.println("no such item");}
				break;
			case 2:
				System.out.println("enter id ");
				int uid = sc.nextInt();
				int i_index=get_index_by_id(emp,uid);
				if(i_index!=-1) {System.out.println(emp.get(i_index).toString());}else { System.out.println("no such item");}
				break;
			default:
				System.out.println("Incorrect choice");
				break;
			}
		}
		else if(choice ==6) {
			Collections.sort(emp);
			for(Class_Employee itr: emp) {
				System.out.println(itr.toString());
			}
		}
		else if(choice==7) {
			Collections.sort(emp,Collections.reverseOrder());
			for(Class_Employee itr: emp) {
				System.out.println(itr.toString());
			}
		}
		else if(choice==8) {
			Collections.sort(emp,new sortBySalary());
			for(Class_Employee itr: emp) {
				System.out.println(itr.toString());
			}
		}
		else if(choice==9) {
			Collections.sort(emp,new sortBySalaryReverse());
			for(Class_Employee itr: emp) {
				System.out.println(itr.toString());
			}
		}
		else {
			break;
		}
	}
	sc.close();
  }

}