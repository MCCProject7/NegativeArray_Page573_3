//	Main_NegativeArray.java by Kyle Wolff and Brandon VanderMey

import java.util.Scanner;

public class Main_NegativeArray
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String userInput;
		char[] charArray;
		
		System.out.print("Enter number for array size: ");
		userInput = scanner.nextLine();
		
		try
		{
			int userInputInt = Integer.parseInt(userInput);
			charArray = new char[userInputInt];
		}
		
		catch (NumberFormatException ex)
		{
			System.out.println("Input not a number.");
		}
		
		catch (NegativeArraySizeException ex)
		{
			System.out.println("Input cannot be negative number.");
		}
	}
}
