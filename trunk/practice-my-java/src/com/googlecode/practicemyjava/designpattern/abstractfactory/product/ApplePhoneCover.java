package com.googlecode.practicemyjava.designpattern.abstractfactory.product;

public class ApplePhoneCover extends PhoneCover {
	private static final double PRICE = 50;

	@Override
	public double getPrice() {
		return PRICE;
	}
}
