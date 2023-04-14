package demo;

import java.util.Scanner;
public class Chess
{
	public static void main(String args[])
	{
	    Scanner s = new Scanner(System.in);
		System.out.print("Enter a character (A-H): ");
		char c = s.next().charAt(0);
		System.out.print("Enter a number (1-8): ");
		int n = s.nextInt();
		
		if(c=='A' && n%2==1 || c=='B' && n%2==0 || c=='C' && n%2==1 || c=='D' && n%2==0 ||c=='E' && n%2==1 || c=='F' && n%2==0 || c=='G' && n%2==1 || c=='H' && n%2==0)
		{
		    System.out.println("This is Black Box");
		}
		else
		{
		    System.out.println("This is White Box");
		}
	}
}