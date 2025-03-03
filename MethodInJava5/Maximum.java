package com.MethodInJava5;

import java.util.Scanner;

public class Maximum {
	static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
	
	public static void main(String[] args) {
		int a,b,c;
		 Scanner sc = new Scanner(System.in);
		    System.out.println("Enter 1st Number");
	        a = sc.nextInt();
	        System.out.println("Enter 2nd Number");
	        b = sc.nextInt();
	        System.out.println("Enter 3rd Number");
	        c = sc.nextInt();
	        System.out.println("Maximum: " + findMax(a, b, c));
	}
}
