package com.Datatypes2;

public class TypeCasting {

	public static void main(String[] args) {
		
		int num = 30;
        double doubleNum = num;
        System.out.println("Implicit Casting (int to double): " + doubleNum);

        double pi = 3.14159;
        int intPi = (int) pi;
        System.out.println("Explicit Casting (double to int): " + intPi);
	}
}
