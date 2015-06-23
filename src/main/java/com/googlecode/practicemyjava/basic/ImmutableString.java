package com.googlecode.practicemyjava.basic;

/**
 * String is immutable
 * 
 * @author blackrocky
 *
 */
public class ImmutableString {
	private static void modify(String s) {
		String t = s;
		t = t.trim();
		t = t.replace(' ', '_');
		s = t;
	}
	
	public static void main(String[] args) {
		String x = "Can you modify this string??";
		modify(x);
		System.out.println(x);
	}
}
