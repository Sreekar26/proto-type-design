package com.sreekar.design;

public class ProtoType {

	public static void main(String[] args) throws CloneNotSupportedException {

		// Need to implement Cloneable interface.
		// Cloneable is a marker interface which has no methods
		// we need to Override clone() protected method which default returns Object
		// Throws Clone not support Exception.

		// Instantiated a class
		ClassRoom classroom = new ClassRoom();
		classroom.setClassName("Nivel Block");
		classroom.loadStudents(); // Hard code data is adding loading into Object

		// ClassRoom classRoom2=new ClassRoom(); instead of creating another object i
		// need to clone existing object
		ClassRoom classRoom2 = classroom.clone(); // cloning of the object.
		classroom.getStudents().remove(1); // removing some object from list of data.
		classRoom2.setClassName("Hardy Block");
		System.out.println(classroom); // will return original data
		System.out.println(classRoom2); // will return Clone data.
	}

}
