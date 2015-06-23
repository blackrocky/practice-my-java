package com.googlecode.practicemyjava.designpattern.abstractfactory.factory;

import com.googlecode.practicemyjava.designpattern.abstractfactory.product.ApplePhoneCover;
import com.googlecode.practicemyjava.designpattern.abstractfactory.product.AppleSmartphone;
import com.googlecode.practicemyjava.designpattern.abstractfactory.product.PhoneCover;
import com.googlecode.practicemyjava.designpattern.abstractfactory.product.Smartphone;

public class AppleSmartphoneFactory implements SmartphoneFactory {

	public PhoneCover createCover() {
		return new ApplePhoneCover();
	}

	public Smartphone createPhone() {
		return new AppleSmartphone();
	}

}
