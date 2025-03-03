package com.classes&Objects4;

public class getters&Setter {

	private String name;
    private int age;

    public getters&Setter(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }

    public static void main(String[] args) {
        Person person = new Person("rajveer", 25);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        
        person.setName("rajveer");
        person.setAge(20);
        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());
    }
}
