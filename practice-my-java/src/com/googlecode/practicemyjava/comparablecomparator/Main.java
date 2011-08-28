package com.googlecode.practicemyjava.comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * What is the difference between Comparator and Comparable?
 * - {@link Comparator} is from java.util package, {@link Comparable} is from java.lang package
 * - {@link Comparator} requires you to implement compare() with 2 parameters, {@link Comparable} requires you to implement compareTo() with 1 parameter
 * - {@link Comparator} compares two objects provided to it, {@link Comparable} compares "this" reference with the given object
 * - {@link Comparable} is used to implement natural ordering of object
 * - Any class implementing {@link Comparable} interface and then collection of that object in List or Array can then be sorted by using
 *   Collections.sort() or Arrays.sort() based on the natural ordered defined in compareTo() method
 * - Any Comparable implementation can be used as keys in a sorted map or elements in a sorted set eg. TreeSet, without specifying any Comparator
 * 
 * @author blackrocky
 *
 */
public class Main {
	public static void main(String[] args) {
		Person p1 = new Person(1, "Tom", "Cruise", 30);
		Person p2 = new Person(10, "Scarlett", "Johanssen", 18);
		Person p3 = new Person(4, "Jessica", "Alba", 17);
		
		List<Person> people = new ArrayList<Person>();
		people.add(p1);
		people.add(p2);
		people.add(p3);
		
		System.out.println("----------- ArrayList -----------");
		System.out.println(people);
		Collections.sort(people); // Comparable in action
		System.out.println(people);
		Collections.sort(people, new AgeComparator()); // Comparator in action
		System.out.println(people);
		
		System.out.println("----------- TreeSet -----------");
		Set<Person> peopleSet = new TreeSet<Person>();
		peopleSet.add(p1);
		peopleSet.add(p2);
		peopleSet.add(p3);
		
		System.out.println(peopleSet); // Comparable in action
	}
}
