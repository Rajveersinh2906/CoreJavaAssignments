package com.methodInJava5;

public class methodOverloading {

	void display(int num)
	{
		System.out.println("Integer :"+num);
	}
	void display(double num)
	{
		System.out.println("Double :"+num);
	}
	void display(String text)
	{
		System.out.println("String :"+text);
	}
	
	
	public static void main(String[] args) {
		methodOverloading m=new methodOverloading();
		m.display(30);
		m.display(10.1);
		m.display("Rajveer");
	}
	
}
