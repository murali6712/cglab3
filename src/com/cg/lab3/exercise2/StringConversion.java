package com.cg.lab3.exercise2;
import java.util.Arrays;

public class StringConversion {
	void stringConversion(String str[], int size)
	{
		Arrays.sort(str);
		for (int index = 0; index < size; index++)
		{
			if(str[index].length() %2 != 0)
			{
				str[index] = str[index].substring(0, str[index].length()/2 + 1 ).toUpperCase() + 
						str[index].substring(str[index].length()/2 + 1 , str[index].length()).toLowerCase();
			}
			else
			{
				str[index] = str[index].substring(0, str[index].length()/2).toUpperCase() + 
						str[index].substring(str[index].length()/2 , str[index].length()).toLowerCase();
			}
		}
		for(int index = 0; index <size; index++)
		{
			System.out.println(str[index]);
		}
	}

}
