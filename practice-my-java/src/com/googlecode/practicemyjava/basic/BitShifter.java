package com.googlecode.practicemyjava.basic;

/**
 * Bit shifter
 * 
 * @author blackrocky
 *
 */
public class BitShifter {
	public static void main(String[] args) {
		int x = -1;
		x = x >>> 5;
		
		System.out.println("x = " + x);
		
		int b = -1;
		b = b >> 5;
		
		System.out.println("b = " + b);
		
		byte y = -1;
		y = (byte) ( y >>> 5 );
		
		System.out.println("y = " + y);
		
		int z = -1;
		z = z << 16;
		
		System.out.println("z = " + z);
		 
		int a = -1;
		a = a >>> 32;
		
		System.out.println("a = " + a);
	}
}
