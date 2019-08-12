package com.sreekar.design;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom implements Cloneable {

	private String className;
	List<Student> students = new ArrayList<>();

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public void loadStudents() {

		for (int i = 1; i <= 5; i++) {
			Student stu = new Student();
			stu.setRollNo(i);
			stu.setName("Student" + i);
			getStudents().add(stu);
		}

	}

	@Override
	protected ClassRoom clone() throws CloneNotSupportedException {

		ClassRoom classRoom = new ClassRoom();

		for (Student student : this.getStudents()) {
			classRoom.getStudents().add(student);
		}

		return classRoom;

	}

	@Override
	public String toString() {
		return "Class [className=" + className + ", students=" + students + "]";
	}

}
