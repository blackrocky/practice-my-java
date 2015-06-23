package com.googlecode.practicemyjava.designpattern.observer;

import java.util.Observable;

public class Prefect extends Observable {
	public void teacherComing() {
		setChanged();
		notifyObservers("teacher is coming!");
	}
}
