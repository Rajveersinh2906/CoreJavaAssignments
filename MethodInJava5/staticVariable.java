package com.methodInJava5;

public class staticVariable {
	 
	static int a=30;
	static void update(int b)
	{
		a=b;
	}
	
	static void show()
	{
		System.out.println("Update value of :"+a);
	}
	public static void main(String[] args) {
	    staticV.show();
		staticV.update(20);
		staticV.show();
	}
}
