package com.googlecode.practicemyjava.basic;

/**
 * Determine if a string is a substring of another string
 * 
 * @author blackrocky
 *
 */
public class Substring {
	public static boolean isSubstring(String substr, String str) {
		if (substr == null || str == null) return false;
		if (substr.length() > str.length()) return false;
		
		int substrLength = substr.length();
		for (int i = 0; i < str.length() - substrLength; i++) {
			String substrToVerify = str.substring(i, i+substrLength);
			//System.out.println(substrToVerify);
			if (substr.equals(substrToVerify)) return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isSubstring("cde", "abcdefg"));
	}
}
