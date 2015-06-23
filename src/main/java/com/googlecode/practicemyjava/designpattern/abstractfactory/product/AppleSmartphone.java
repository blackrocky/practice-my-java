package com.googlecode.practicemyjava.designpattern.abstractfactory.product;

public class AppleSmartphone extends Smartphone {
	private static final String OS = "iOS";

	@Override
	public String getOperatingSystem() {
		return OS;
	}
	
}
