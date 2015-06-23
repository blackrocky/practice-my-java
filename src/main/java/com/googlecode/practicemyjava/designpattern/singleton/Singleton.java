package com.googlecode.practicemyjava.designpattern.singleton;
/**
 * Singleton pattern
 * 
 * @author blackrocky
 *
 */
public class Singleton {
	private static Singleton s;
	
	private Singleton() {
	}
	
	/**
	 * Make sure this is the only way to get this Singleton
	 * The synchronized bit prevents multiple threads from calling
	 * getInstance() method at the same time, potentially calling the constructor many times
	 * 
	 * @return {@link Singleton} instance
	 */
	public static synchronized Singleton getInstance() {
		if (s == null) return new Singleton();
		return s;
	}

	/**
	 * Don't allow any cloning. Naughty naughty!
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("No cloning for singleton!");
	}
}
