package com.classes&Objects4;

public class CreatingClass {
    int age;
    String name;
	public createAClass(int age,String name) {
        this.age=age;
        this.name=name;
		
	}
	
	void show() {
		System.out.println("Age: "+age +" Name: "+name);
	}
	public static void main(String[] args) {
		createAClass R=new createAClass(20,"Rajveer");
		R.show();
	}
}
