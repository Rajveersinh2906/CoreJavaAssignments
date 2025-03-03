package com.Datatypes2;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st Number:");
		a=sc.nextInt();
		System.out.print("Enter 2nd Number:");
		b=sc.nextInt();
		
		System.out.println("Addition :"+(a+b));
		System.out.println("Substraction :"+(a-b));
		System.out.println("Multiplication :"+(a*b));
		System.out.println("Division :"+(a/b));
		System.out.println("Moduless :"+(a%b));
		System.out.println("a is greater than to b :"+(a>b));
		System.out.println("a is greater than equals to b :"+(a>=b));
		
	}
}
