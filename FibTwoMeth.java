/**
* Fibonacci Nth Sequence Class Methods
* Author: Gary Anstey
* Parameters: A recursive static method that returns the nth term in the Fibonacci sequence. 
* The method should accept n as a parameter. Do not include javadoc code in your implementation (yet).
* A main method that calls the first method. Pass in 10 as an argument. 
*/
//Output the 10th term of the Fibonacci sequence along with some descriptive text

import java.util.*;

public class FibTwoMeth
{
	private static Scanner scnr;


	public static void main (String args[])
	{
		//declare one variable n
		int n;    
		scnr = new Scanner(System.in);

		//get the value of n from user
		System.out.println("Enther value of n: ");
		n=scnr.nextInt();

		//print nth number 
		System.out.println("The "+n+"th term of the Fibonacci sequence is "+fibonacci(n));

	}//end main


	//method to return the n-th fibonacci sequence number
	public static int fibonacci(int n)
	{
		//run comparative value and return n
		if (n <= 1)
			return n;
		//Use the function fibonacci() above
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
}//End class