package com.googlecode.practicemyjava.basic;

/**
 * A method to return the nth Fibbonaci number
 *  
 * @author blackrocky
 *
 */
public class Fibonacci {
	private int[] series;
	
	public Fibonacci(int n) {
		series = new int[n];		
		if (n > 0) series[0] = 0;
		if (n > 1) series[1] = 1;
		if (n > 2) {
			for (int i = 2; i < n; i++) {
				series[i] = series[i-1] + series[i-2];
			}
		}
	}
	
	public int getNthNumber(int n) {
		return series[n-1];
	}
}
