package assignment5;

/* 
 * 
 * Name: GenericMethodTest.java
 * Purpose: Tests out a few static Generic Methods in Java
 * Author: grivera64
 * Date: 10/18/2021
 * 
 */

public class GenericMethodTest
{

	/* Print s */
	public static <E> void printArray(E[] array)
	{
		
		/* Go through every element in the arrays */
		for (E element : array)
		{
			
			/* Print out their toString() method */
			System.out.printf("%s ", element);
			
		}
		
		/* Go to a new line */
		System.out.printf("\n");
		
	}
	
	public static void main(String[] args)
	{
		
		/* Create primitive's Wrapper Class arrays */
		Integer[] integerArray =  {1, 2, 3, 4, 5, 6}; 
		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7}; 
		Character[] characterArray = {'H', 'E', 'L', 'L', 'O'}; 
		
		/* Print out the arrays via Generics */
		System.out.printf("Array integerArray contains: "); 
		printArray(integerArray);
		
		System.out.printf("Array doubleArray contains: "); 
		printArray(doubleArray); 
		
		System.out.printf("Array characterArray contains: "); 
		printArray(characterArray); 
		
	}
	
}