package com.example.oop;

public class Main {

	public static void main(String[] args) {
		
		
		// Creating an Instance of Person = person1
		Person person1 = new Person();
		person1.setName("Alice");
		person1.setAge(20);
		person1.setHeight(170);
		person1.setWeight(70);
		
		// Creating an instance of Person = person2
		Person person2 = new Person();
		person2.setName("John");
		person2.setAge(25);
		person2.setHeight(170);
		person2.setWeight(65);
		
		System.out.println("Person 1 is "+person1.getName()+" and she is "+person1.getAge()+" years old");
		System.out.println("Person 2 is "+person2.getName()+" and he is "+person2.getAge()+" years old");
		
		Person person3 = new Person("Tom", 20, 180, 70);
		System.out.println("Person 3 is "+person3.getName()+" and he is "+person3.getAge()+" years old");
		
		// Calling the method introduce defined inside the class
		person3.introduce();
		
		// In this case when we try to call it it will crash, throw an exception
		// If i want Java to check for the error I will surround this 
		// with try catch
		try {
			Person person4 = null;
			System.out.println(person4.getName());
		}
		catch (Exception e) {
			System.out.println("An error occured "+e.getMessage());
		}
		
		
		System.out.println("Is everything OK? If OK show me");
		
		Person person5 = new Person();
		System.out.println("Default name is "+person5.getName()+" and default age is "+person5.getAge());
	}
	
	

}
