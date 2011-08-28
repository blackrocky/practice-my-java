package com.googlecode.practicemyjava.comparablecomparator;

import java.util.Comparator;

/**
 * Person Comparator to compare the person's age
 * 
 * @author blackrocky
 *
 */
public class AgeComparator implements Comparator<Person> {
	public int compare(Person p1, Person p2) {
		return p1.getAge() - p2.getAge();
	}
}
