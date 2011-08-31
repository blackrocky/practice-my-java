package com.googlecode.practicemyjava.designpattern.abstractfactory.factory.client;

import com.googlecode.practicemyjava.designpattern.abstractfactory.factory.AppleSmartphoneFactory;
import com.googlecode.practicemyjava.designpattern.abstractfactory.factory.SamsungSmartphoneFactory;
import com.googlecode.practicemyjava.designpattern.abstractfactory.factory.SmartphoneFactory;
import com.googlecode.practicemyjava.designpattern.abstractfactory.product.PhoneCover;
import com.googlecode.practicemyjava.designpattern.abstractfactory.product.Smartphone;

/**
 * Using Abstract Factory Design Pattern
 * For UML Diagram, see: http://www.apwebco.com/gofpatterns/creational/AbstractFactory.html
 * 
 * @author blackrocky
 *
 */
public class SmartphoneClient {
	public static void main(String[] args) {
		SmartphoneFactory samsung = new SamsungSmartphoneFactory();
		Smartphone phone1 = samsung.createPhone();
		System.out.println("Samsung phone's os: " + phone1.getOperatingSystem());
		PhoneCover phoneCover1 = samsung.createCover();
		System.out.println("Samsung phone cover price: " + phoneCover1.getPrice());
		
		SmartphoneFactory iPhone = new AppleSmartphoneFactory();
		Smartphone phone2 = iPhone.createPhone();
		System.out.println("iPhone's os: " + phone2.getOperatingSystem());
		PhoneCover phoneCover2 = iPhone.createCover();
		System.out.println("iPhone cover price: " + phoneCover2.getPrice());
	}
}
