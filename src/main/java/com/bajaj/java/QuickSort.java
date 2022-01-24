package com.bajaj.java;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class QuickSort {
	
public static void swap(int [] arr,int i,int j) {
	int temp = arr[j];
	arr[j]=arr[i];
	arr[i]=temp;
}
public static int partition(int[] arr,int low,int high ) {
	int pivot = arr[high];
	int lp = low;
	int rp=high-1;
	while(lp<=rp) {

			if(arr[lp]<pivot) {
				lp++;
			}else if(arr[lp]>pivot) {
				if(arr[rp]<pivot) {
					swap(arr,lp,rp);
				}else {
					rp--;
				}
			}
//		while(arr[lp]<=pivot && lp<rp) {
//			lp++;
//		}
//		while(arr[rp]>=pivot && lp<rp) {
//			rp--;
//		}
//			swap(arr,lp,rp);
	}
	swap(arr,lp,high);
	return lp;
	
}

	public static void quicksort(int[] arr,int low,int high ) {
		
		if(low>=high) {return ;}
		
			int pivot = arr[high];
			int pi = partition(arr,low,high);
			quicksort(arr,low,pi-1);
			quicksort(arr,pi+1,high);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		try {
				int [] arr= {2,1,5,4,3};
				quicksort(arr,0,arr.length-1);
				for(int i=0;i<arr.length;i++)
				{
					System.out.println(arr[i]);
				}
		}
		catch(InputMismatchException e) {
			//e.printStackTrace();
			//e.getMessage();
			System.out.println("invalid input " );
		}
		
		
	}

}
