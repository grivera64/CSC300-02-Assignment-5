package assignment5;

/* 
 * 
 * Name: HasNoNullsTest.java
 * Purpose: Uses wildcards to prove no items in a List are null
 * Author: grivera64
 * Date: 10/18/2021
 * 
 */

import java.util.List;
import java.util.ArrayList;

public class HasNoNullsTest
{
	
	public static boolean hasNoNulls(List<?> list)
	{
		
		/* Search the list */
		for (Object o : list)
		{
			
			/* If a value yields null, return false */
			if (o == null) return false;
			
		}
		
		/* Otherwise return true */
		return true;
		
	}
	
	public static void testNull(List<?> list, String listName)
	{
		
		System.out.printf("It is %s that %s has no null values.\n",
							(hasNoNulls(list)) ? "true" : "false", listName);
		
	}
	
	public static void main(String[] args)
	{
		
		ArrayList<Integer> intArrayL = new ArrayList<>();
		
		/* Test intArrayL */
		for (int i = 0; i < 7; i++)
		{
			
			intArrayL.add(i);
			
		}
		
		testNull(intArrayL, "intArrayL");
		
		intArrayL.add(null);
		testNull(intArrayL, "intArrayL");
		
		ArrayList<String> stringArrayL = new ArrayList<String>();
		
		for (int i = 0; i < 7; i++)
		{
			
			stringArrayL.add(String.format("xxx%d", i));
			
		}
		
		testNull(stringArrayL, "stringArrayL");
		
		stringArrayL.add(3, null);
		testNull(stringArrayL, "stringArrayL");
		
		
	}
	
}