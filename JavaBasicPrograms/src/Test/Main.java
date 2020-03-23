package Test;

import java.util.Scanner;

import Operations.Methods;

public class Main {
	
	public static void main(String[] args)
	{
		Methods m = new Methods();
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		//n = sc.nextInt();
		String s=sc.next();
		m.StringPalindrome(s);
		
	}

}
