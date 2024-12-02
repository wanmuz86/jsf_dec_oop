package com.example.oop;

public class Person {
	
	// Property/attribute of a person
	// In day 4, this will be translated to the data
	// needs to be stored in DB
	/// Declared as private I can only access it from the class
	
	private String name;
	private int age;
	private int height;
	private int weight;
	
	
	
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
		this.age = age;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	// Normal constructor / empty constructor
	public Person() {
		
	}
	
	
	// Constructor with argument
	// A constructor is a "way" to facilitate the creation of an Object 
	// so that the object can be created in 1 line
	
	public Person(String name, int age, int height, int weight) {
		// THe keyword this refers to the property/attribute
		// wheras the name without this, refer to the constructor argument
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	// Method / A function in a Class
	// Return type void, int, String, double ...
	public void introduce() {
		System.out.println("My name is "+this.name+" and I am "+this.age+" years old");
	}

}
