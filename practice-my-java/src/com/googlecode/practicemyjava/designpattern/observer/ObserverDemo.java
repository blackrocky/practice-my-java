package com.googlecode.practicemyjava.designpattern.observer;

public class ObserverDemo {
	private Prefect p = new Prefect();
	private Student s1 = new Student();
	private Student s2 = new Student();
	
	public ObserverDemo() {
		p = new Prefect();
		s1 = new Student();
		s2 = new Student();
		
		p.addObserver(s1);
		p.addObserver(s2);
	}
	
	public void demo() {
		p.teacherComing();
	}
	
	public static void main(String[] args) {
		ObserverDemo demo = new ObserverDemo();
		demo.demo();
	}
}
