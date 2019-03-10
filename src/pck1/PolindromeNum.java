package pck1;

import java.util.Scanner;

public class PolindromeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter any no.");
		int n =sn.nextInt();
		int sum = 0,rev;
		while(n>0)
		{
		rev=n%10;
		sum=(sum*10)/rev;
		n=n/10;
		}
		if(n==sum)
		{
		System.out.println("Number is polindrome");
		}
		else
		{
		System.out.println("Number is not polindrome");
		}
	}

}
