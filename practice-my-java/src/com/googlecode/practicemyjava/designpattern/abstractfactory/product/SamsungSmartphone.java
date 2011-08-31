package com.googlecode.practicemyjava.designpattern.abstractfactory.product;

public class SamsungSmartphone extends Smartphone {
	private static final String OS = "Android";
	
	@Override
	public String getOperatingSystem() {
		return OS;
	}
	
}
