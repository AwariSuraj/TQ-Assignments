package com.hierarchical;

public class Student {

	private int id;
	private String name;
	private int age;
	private float marks;

	public Student() {

	}

	public Student(int id, String name, int age, float marks) {

		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public String toString() {
		return "student  " + id + " " + name + " " + age + " " + marks;
	}
}
