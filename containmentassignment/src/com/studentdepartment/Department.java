package com.studentdepartment;

public class Department {

	int did;
	String name;

	public Department() {

	}

	public Department(int did, String name) {

		this.did = did;
		this.name = name;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "Department info=" + did + "  " + name;
	}

}
