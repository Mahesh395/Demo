package Programs;

import java.util.Scanner;

public class UserDefinedExceptionUsingRecursion {

	public static void main(String[] args) 
	{
		Scanner sp = new Scanner(System.in);
		System.out.print("Enter the number to print natural numbers: ");
		int n = sp.nextInt();
		
		try
		{
			number(n);
		}
		catch(NumberCannotBeNegativeException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Countdown completed!");
	}
	
	public static void number(int n) throws NumberCannotBeNegativeException
	{
		if(n<0)
		{
			throw new NumberCannotBeNegativeException();
		}
		System.out.println(n--);
		number(n);
	}
}

class NumberCannotBeNegativeException extends Exception
{
	public String getMessage()
	{
		return "The countdown can't be negative";
	}
}