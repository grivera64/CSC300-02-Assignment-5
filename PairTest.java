package assignment5;

/* 
 * 
 * Name: Pair.java
 * Purpose: This is a test of using two generics in one class
 * Author: grivera64
 * Date: 10/18/2021
 * 
 */

public class PairTest
{
	
	public static void main(String[] args)
	{
		
		/* Creating a Pair with type parameters Integer & String */
		Pair<Integer, String> pair = new Pair<>(1, "one");
		
		/* Print Original values */
		System.out.printf("Original Pair: <%s, %s>\n", pair.getFirst(), pair.getSecond());
		
		/* Print new values */
		pair.setFirst(2).setSecond("two");
		System.out.printf("Modified Pair: <%s, %s>\n", pair.getFirst(), pair.getSecond());
		
	}

}
