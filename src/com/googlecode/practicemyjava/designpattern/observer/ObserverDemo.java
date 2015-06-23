package com.googlecode.practicemyjava.designpattern.observer;

/**
 * Observer Design Pattern demo
 * Scenario:
 * A class of students (Observers), a prefect (Observable), and a teacher.
 * The teacher is currently away, and the students were having a party.
 * The prefect notifies the students when the teacher is coming
 * 
 * @author blackrocky
 *
 */
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
