package Week_1.Day_2.Assignment;

import java.util.Scanner;

public class Fraction_Of_A_Number {

	static Scanner sc = new Scanner(System.in);
	static int num, fact = 1;
	
	public static void main(String[] args) 
	{
		findFact();
	}
	
	public static void findFact()
	{
		System.out.printf("Enter the number to find the Factorial: ");
		num = sc.nextInt();
		
		for (int i = 1; i <= num; i++)
		{
			fact = fact*i;
		}
		System.out.println("\nFactorial of "+num+" is : "+fact);
	}
	
}
