package com.example.oop;

public class Person {
	
	// Property/attribute of a person
	// In day 4, this will be translated to the data
	// needs to be stored in DB
	String name;
	int age;
	int height;
	int weight;
	
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

}
