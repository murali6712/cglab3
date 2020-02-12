package com.cg.lab3.exercise1;

import java.util.Scanner;

public class SecondSmallestMain {
	/*static int minimum(int a[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array index value to display minimum number");
		int min = sc.nextInt();
		return (a[min-1]);
	}
	
	static int maximum(int a[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array index value to display maximum number");
		int max = sc.nextInt();
		return (a[a.length-max]);
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements");
		int nOfElements = sc.nextInt();
		System.out.println("Enter Array elements");
		int elements[] = new int[nOfElements];
		for (int i = 0; i < nOfElements; i++)
		{
			elements[i] = sc.nextInt();
		}
		
		SecondSmallest obj = new SecondSmallest();
		obj.getSecondSmallest(elements);
		//System.out.println(minimum(elements));
		//System.out.println(maximum(elements));
	}
}

