package com.hierarchical;

public class SchoolStudent extends Student {

	private String schoolname;
	private int std;

	public SchoolStudent() {
		super();

	}

	public SchoolStudent(int id, String name, int age, float marks, String schoolname, int std) {
		super(id, name, age, marks);
		this.schoolname = schoolname;
		this.std = std;

	}

	public String getSchoolname() {
		return schoolname;
	}

	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}

	public int getStd() {
		return std;
	}

	public void setStd(int std) {
		this.std = std;
	}

	public String toString() {
		return super.toString() + " schoolname=" + schoolname + " " + std;

	}
}
