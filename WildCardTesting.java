package assignment5;

/*
 * 
 * Name: WildCardTesting.java
 * Purpose: Tests wild cards in Java
 * Author: grivera64
 * Date: 10/18/2021
 * 
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class WildCardTesting
{

	/* Finds the sum of items in a List */
	public static Number sum(List<? extends Number> list)
	{
		
		Number sum = 0.0;
		
		boolean hasDouble = false;
		
		for (Number item : list)
		{
			if (item instanceof Double || item instanceof Float || hasDouble)
			{
				
				sum = sum.doubleValue() + item.doubleValue();
				hasDouble = true;
			
			}
			else
			{
				
				sum = sum.intValue() + item.intValue();
				
			}
				
		}
		
		return sum;
		
	}
	
	/* Returns a string version of an array */
	public static String iteratorToString(Iterator<?> iter)
	{
		
		/* Makes "[" + the list */
		StringBuilder str = new StringBuilder("");
		str.append("[");
		
		if (iter.hasNext()) str.append(String.format("%s", iter.next()));
		
		while (iter.hasNext())
		{
			
			str.append(String.format(", %s", iter.next()));
			
		}
		
		/* Closes with "]" and returns as a string */
		str.append("]");
		
		return str.toString();
		
	}
	
	public static void main(String[] args)
	{
		
		/* Test sum for Integers */
		Integer[] integerArray = {1, 2, 3, 4, 5};
		List<Integer> integerList = new ArrayList<>();
		
		for (Integer i : integerArray)
		{
			
			integerList.add(i);
			
		}
		
		Iterator<Integer> iter = integerList.iterator();
		System.out.printf("integerList contains: %s\n", iteratorToString(iter));
		System.out.printf("Total of elements in integerList: %s\n", sum(integerList));
		
		System.out.printf("\n");
		
		/* Test sum for Doubles */
		Double[] doubleArray = {1.1, 3.3, 5.5};
		List<Double> doubleList = new ArrayList<>();
		
		for (Double i : doubleArray)
		{
			
			doubleList.add(i);
			
		}
		
		Iterator<Double> iter2 = doubleList.iterator();
		System.out.printf("doubleList contains: %s\n", iteratorToString(iter2));
		System.out.printf("Total of elements in doubleList: %.2f\n", sum(doubleList));
		
		System.out.printf("\n");
		
		/* Test sum for Numbers */
		Number[] numberArray = {1, 2.4, 3, 4.1};
		List<Number> numberList = new ArrayList<>();
		
		for (Number i : numberArray)
		{
			
			numberList.add(i);
			
		}
		
		Iterator<Number> iter3 = numberList.iterator();
		System.out.printf("numberList contains: %s\n", iteratorToString(iter3));
		System.out.printf("Total of elements in numberList: %.2f\n", sum(numberList));
		
	}

}
