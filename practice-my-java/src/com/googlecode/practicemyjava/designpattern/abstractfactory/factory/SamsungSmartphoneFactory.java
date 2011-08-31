package com.googlecode.practicemyjava.designpattern.abstractfactory.factory;

import com.googlecode.practicemyjava.designpattern.abstractfactory.product.PhoneCover;
import com.googlecode.practicemyjava.designpattern.abstractfactory.product.SamsungPhoneCover;
import com.googlecode.practicemyjava.designpattern.abstractfactory.product.SamsungSmartphone;
import com.googlecode.practicemyjava.designpattern.abstractfactory.product.Smartphone;

public class SamsungSmartphoneFactory implements SmartphoneFactory {

	public PhoneCover createCover() {
		return new SamsungPhoneCover();
	}

	public Smartphone createPhone() {
		return new SamsungSmartphone();
	}


}
