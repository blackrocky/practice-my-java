package com.googlecode.practicemyjava.comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Person p1 = new Person(1, "Tom", "Cruise", 30);
		Person p2 = new Person(10, "Scarlett", "Johanssen", 18);
		Person p3 = new Person(4, "Jessica", "Alba", 17);
		
		List<Person> people = new ArrayList<Person>();
		people.add(p1);
		people.add(p2);
		people.add(p3);
		
		System.out.println(people);
		Collections.sort(people); // Comparable in action
		System.out.println(people);
		Collections.sort(people, new AgeComparator()); // Comparator in action
		System.out.println(people);
	}
}
