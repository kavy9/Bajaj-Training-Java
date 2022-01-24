package com.bajaj.java;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class TestTree {

	static Scanner sc = null; 
	public static int Fibbo(int f) {
		if(f==1) {
			return 1;
		}
		else if(f==0) {
			return 0;
		}
		else {
			return Fibbo(f-1)+Fibbo(f-2);
		}
	}
	public static Node createTree(int data) {
		if(data==-1) {
			Node root=null;
			return root;
		}
		Node root =new Node(data);
		sc= new Scanner(System.in);
		//root.value=data;
		if(data!=-1) {
			System.out.println("Enter Right node value");
			data = sc.nextInt();
			root.right = createTree(data);
			
			System.out.println("Enter Left node value");
			data =sc.nextInt();
			root.left = createTree(data);
		}
		return root;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		PrintThis<String> aValue = new PrintThis("Any String");
//		aValue.Print();
//		String aString = new String("Hello");
//		System.out.println(aString.getClass());
//		ArrayList<PrintThis> newArray = new ArrayList();
//		
//		newArray.add(aValue);
//		System.out.println(newArray.get(0).getClass());
//		newArray.get(0).Print();
		/*
		String s = "6";
		int i = Integer.parseInt(s);
		System.out.println(s.getClass().getClass().getClass());
		
		PrintObjectAlso<Integer> object = new PrintObjectAlso<Integer>(2);
		object.Print();
		object.PrintType();
		int [] arr = {1,2,3,4,5};
		arr[0]=3;
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		arr1.add(1);
		arr1.add(3);
		arr1.remove(1);
		System.out.println(arr1);
		System.out.println(arr);
		*/	
		Node root = createTree(10);
		System.out.println("created");
		//System.out.println(root.right.value);
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		Stack<Node> stack = new Stack<Node>();
		
		stack.push(root);
		
		while(!stack.empty()) {
			Node current = stack.pop();
			arr1.add(current.value);
			
			if(current.right != null) {
				stack.push(current.right);
			}
			
			if(current.left!=null) {
				stack.push(current.left);
			}
			

		}
		
		System.out.println(arr1);
		
		
		
		
	}

}
