package com.cg.lab3.exercise4;

import java.util.Scanner;

public class ArrayCharacterCountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int noOfElements;
		System.out.println("Enter the String to calculate the occurances of each characters:");
		Scanner sc = new Scanner(System.in);
		noOfElements= sc.nextInt();
		char string[] = new char[noOfElements];
		for (int index = 0; index < noOfElements;index++)
		{
			string[index] = sc.next().charAt(0);
		}
		CharacterCount obj = new CharacterCount();
		obj.characterCount(string);
	}

}
