package com.googlecode.practicemyjava.comparablecomparator;

public class Person implements Comparable<Person>{
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	
	public Person() {
	}
	
	public Person(int id, String firstName, String lastName, int age) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int compareTo(Person o) {
		return this.id - o.getId();
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", firstName=" + firstName + ", id=" + id
				+ ", lastName=" + lastName + "]";
	}
	
}