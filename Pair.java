package assignment5;

/* 
 * 
 * Name: Pair.java
 * Purpose: This is a Generic class with two parameter types
 * Author: grivera64
 * Date: 10/18/2021
 * 
 */

public class Pair <F, S>
{
	
	private F first;
	private S second;
	
	public Pair()
	{
		
		this(null, null);
		
	}
	
	public Pair(F first, S second)
	{
		
		this.setFirst(first);
		this.setSecond(second);
		
	}
	
	public Pair<F, S> setFirst(F first)
	{
		
		this.first = first;
		return this;
		
	}
	
	public F getFirst()
	{
		
		return this.first;
		
	}
	
	public Pair<F, S> setSecond(S second)
	{
		
		this.second = second;
		return this;
		
	}
	
	public S getSecond()
	{
		
		return this.second;
		
	}
	
}