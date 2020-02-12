package com.cg.lab3.exercise4;

public class CharacterCount {
	void characterCount(char character[])
	{
		int index, loop, value = 0;
		for(index = 0; index < character.length; index++)
		{
			int count = 1;
			for(loop = 0; loop <character.length; loop++)
			{
				if (character[index] == character[loop])
				{
					value = count++;
				}
			}
			System.out.println("Number of times Character " + character[index] + "is repeated:" + value );
		}
	}
}
