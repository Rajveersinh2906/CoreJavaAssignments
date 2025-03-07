package com.interfaced&AbstractClasses10;

abstract class zoo {
 abstract void makeSound();
 void sleep() {
     System.out.println("This animal is sleeping.");
 }
}

 class zoo extends Animal {
 void makeSound() {
     System.out.println(" dog Sound ");
 }
 
 }
public class Abstractc {
	
	public static void main(String[] args) {
		zoo d=new zoo();
		d.makeSound();
		d.sleep();
	}
}