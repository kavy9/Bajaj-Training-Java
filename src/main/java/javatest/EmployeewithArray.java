package javatest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
//import javatest.QuickSort;

public class EmployeewithArray {
	public static Class_Employee create_emp(String name, int emp_id, int salary, String department) {
		Class_Employee emp = new Class_Employee(name,emp_id,salary,department);
		return emp;
		
	}
	public static int get_id_by_name(Class_Employee[] Emp,String name,int count) {
		for(int i=0;i<count;i++) {
			if(Emp[i].name.equals(name)) {
				return Emp[i].emp_id;	
			}
			System.out.println("id_by_name i : "+i+" "+ Emp[i].name + " "+ name);
			System.out.println(Emp[i].name.equals(name));
		}
		return -1;
	}
	public static void delete_from_list(Class_Employee[] Emp,int index,int count) {
		for(int i = index;i<count;i++) {
			Emp[i]=Emp[i+1];
		}
	}
	public static int get_index_by_id(Class_Employee[] Emp,int id,int count) {
		for(int i=0;i<count;i++) {
			if(Emp[i].emp_id == id) {
				return i;
				
			}
		}
		return -1;	
	}
	public static void print_sorted(Class_Employee [] emp,int count ) {
		int arr[] = new int[count];
		System.out.println("yes");
		for(int i=0;i<count;i++) {
			System.out.println(i);
			arr[i]=emp[i].emp_id;
		}
		QuickSort.quicksort(arr, 0, count-1);
		for(int i=0;i<arr.length;i++) {
			System.out.println(emp[get_index_by_id(emp,arr[i],count)].toString());
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Class_Employee [] edata = new Class_Employee[10];
		int count = 0;
		while(true) {
			System.out.println("select your choice");
			System.out.println("Enter 1 to add a new Employee");
			System.out.println("Enter 2 to List all Employee");
			System.out.println("Enter 3 to Update an Employee detail");
			System.out.println("Enter 4 to delete an Employee");	
			System.out.println("Enter 5 to Search by name");
			System.out.println("Enter 6 to print sorted list");
			int choice = sc.nextInt();
			if(choice == 1) {
				System.out.println("enter name: ");
				String name = sc.next();
				System.out.println("enter salary : ");
				int Salary=sc.nextInt();
				System.out.println("enter dept name: ");
				String dept = sc.next();
				edata[count]=create_emp(name,count+1,Salary,dept);
				count++;
			}
			else if(choice==2) {
				for(int i=0;i<count;i++) {
					System.out.println(edata[i].toString());
					System.out.println();
				}
			}
			else if(choice==3) {
				System.out.println("Update by name(1) or id(2) ? ");
				int uchoice = sc.nextInt();
				int id,index;
				if(uchoice==1) {
					System.out.println("enter name ");
					String name = sc.next();
					id= get_id_by_name(edata,name,count);
					if(id==-1) {
						System.out.println("no employee found by name ");
						continue;
					}
					index = get_index_by_id(edata,id,count);
					if(id==-1) {
						System.out.println("no employee found by id ");
						continue;
					}
				}else {
					System.out.println("enter id to update");
					id=sc.nextInt();
					index = get_index_by_id(edata,id,count);
					if(id==-1) {
						System.out.println("no employee found by id ");
						continue;
					}
				}					
				System.out.println("old name : "+edata[index].getName()+" enter new name: ");
				String name = sc.next();
				edata[index].setName(name);
				System.out.println("old Salary : "+edata[index].getSalary()+" enter new salary : ");
				int Salary=sc.nextInt();
				edata[index].setSalary(Salary);
				System.out.println("old Dept : "+edata[index].getDepartment()+" enter new dept name: ");
				String dept = sc.next();
				edata[index].setDepartment(dept);
			}else if(choice==4) {
				System.out.println("delete by name(1) or id(2) ? ");
				int uchoice = sc.nextInt();
				int id,index;
				if(uchoice==1) {
					System.out.println("enter name ");
					String name = sc.next();
					id= get_id_by_name(edata,name,count);
					if(id==-1) {
						System.out.println("no employee found by name ");
						continue;
					}
					index = get_index_by_id(edata,id,count);
					if(id==-1) {
						System.out.println("no employee found by id ");
						continue;
					}
				}else {
					System.out.println("enter emp_id to delete");
					id=sc.nextInt();
					index = get_index_by_id(edata,id,count);
					if(id==-1) {
						System.out.println("no employee found by id ");
						continue;
					}
				}	
				///
				delete_from_list(edata,index,count);
				count--;
				
			}
			else if(choice==5) {
				System.out.println("enter name of employee ");
				String name=sc.next();
				int index = get_index_by_id(edata,get_id_by_name(edata,name,count),count);
				if(index!=-1) {
					System.out.println(edata[index].toString());
				}else {
					System.out.println("not found");
				}
				
				
			}
			else if(choice==6) {
				print_sorted(edata,count);
			}
			else {
				break;
			}
		}
		sc.close();
	}

}
