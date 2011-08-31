package com.googlecode.practicemyjava.designpattern.abstractfactory.factory;

import com.googlecode.practicemyjava.designpattern.abstractfactory.product.PhoneCover;
import com.googlecode.practicemyjava.designpattern.abstractfactory.product.Smartphone;

public interface SmartphoneFactory {
	Smartphone createPhone();
	PhoneCover createCover();
}
