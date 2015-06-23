package com.googlecode.practicemyjava.designpattern.abstractfactory.product;

public class SamsungPhoneCover extends PhoneCover {
	private static final double PRICE = 10;

	@Override
	public double getPrice() {
		return PRICE;
	}
}
