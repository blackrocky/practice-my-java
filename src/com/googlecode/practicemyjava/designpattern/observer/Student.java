package com.googlecode.practicemyjava.designpattern.observer;

import java.util.Observable;
import java.util.Observer;

public class Student implements Observer {
	public void update(Observable o, Object arg) {
		System.out.println("changes: " + o + " with arg: " + arg);
		System.out.println("Stop the party, and stay quiet, pretend to read books");
	}
}
