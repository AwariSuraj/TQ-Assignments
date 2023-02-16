package com.hierarchical;

public class College extends Student {
	private String course;
	private int semister;

	public College() {
		super();

	}

	public College(int id, String name, int age, float marks, String course, int semister) {
		super(id, name, age, marks);
		this.course = course;
		this.semister = semister;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getSemister() {
		return semister;
	}

	public void setSemister(int semister) {
		this.semister = semister;
	}

	public String toString() {
		return super.toString() + " college " + course + semister;
	}

}
