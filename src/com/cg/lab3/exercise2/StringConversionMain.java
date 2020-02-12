package com.cg.lab3.exercise2;
import java.util.Scanner;

public class StringConversionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of indexes");
		int size = sc.nextInt();
		System.out.println("Enter the String Elements");
		String str[] = new String[size];
		for (int index = 0; index < size; index++)
		{
			str[index] = sc.next();
		}
		
		StringConversion obj = new StringConversion();
		obj.stringConversion(str, size);
	}

}
