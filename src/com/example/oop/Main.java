package com.example.oop;

public class Main {

	public static void main(String[] args) {
		
		
		// Creating an Instance of Person = person1
		Person person1 = new Person();
		person1.name = "Alice";
		person1.age = 30;
		person1.height = 170;
		person1.weight = 70;
		
		// Creating an instance of Person = person2
		Person person2 = new Person();
		person2.name = "John";
		person2.age = 25;
		person2.height = 170;
		person2.weight = 65;
		
		System.out.println("Person 1 is "+person1.name+" and she is "+person1.age+" years old");
		System.out.println("Person 2 is "+person2.name+" and he is "+person2.age+" years old");
		
		Person person3 = new Person("Tom", 20, 180, 70);
		System.out.println("Person 3 is "+person3.name+" and he is "+person3.age+" years old");
		
		// In this case when we try to call it it will crash, throw an exception
		// If i want Java to check for the error I will surround this 
		// with try catch
		try {
			Person person4 = null;
			System.out.println(person4.name);
		}
		catch (Exception e) {
			System.out.println("An error occured "+e.getMessage());
		}
		
		
		System.out.println("Is everything OK? If OK show me");
		
		Person person5 = new Person();
		System.out.println("Default name is "+person5.name+" and default age is "+person5.age);
	}
	
	

}
