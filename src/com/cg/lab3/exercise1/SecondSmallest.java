package com.cg.lab3.exercise1;

public class SecondSmallest {
	int getSecondSmallest(int elements[])
	{
		int temporary;
		System.out.println("Sorted Elements are");
		for (int loop = 0; loop < elements.length; loop++)
		{
			for (int loop1 = loop+1; loop1 < elements.length; loop1++)
			{
				if (elements[loop] > elements[loop1])
				{
					temporary = elements[loop];
					elements[loop] = elements[loop1];
					elements[loop1] = temporary;
				}
			}
			System.out.println(elements[loop]);
		}
		System.out.println("Second Smallest Element is:" + elements[1]);
		return elements[1];
	}
}
