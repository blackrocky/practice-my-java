package com.googlecode.practicemyjava.designpattern.abstractfactory.product;

public abstract class Smartphone {
	private String phoneNumber;
	
	public void setPhoneNumber(String phoneNumber) {
		phoneNumber = phoneNumber;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public abstract String getOperatingSystem();
}
