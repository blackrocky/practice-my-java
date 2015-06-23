package com.googlecode.practicemyjava.basic;

/**
 * Division has more precedence than additions
 * 
 * @author blackrocky
 *
 */
public class OperatorPrecedence {
	public static void main(String[] args) {
		int i1 = 4;
		int i2 = 10;
		double result = 3 + i1 / i2 + 2;
		System.out.println(result);
	}
}
