package com.cg.lab3.exercise3;
import java.util.Scanner;

public class ReverseNumberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter Size of Array:");
        int size=scan.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter Array Elements:");
          for(int index=0;index<size;index++)
          {
        	 arr[index]=scan.nextInt(); 
          }
          ReverseNumber obj=new ReverseNumber();
           int output[]=obj.getSorted(arr);
           for(int index=0;index<output.length;index++)
        	   System.out.println(output[index]);
        scan.close();
	}

}
