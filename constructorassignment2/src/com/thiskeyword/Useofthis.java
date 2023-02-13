package com.thiskeyword;

//we assign new value to the instance variable using this keyword;

class Assign {

	private int id;
	private String name;

	public void setId(int id) {
		this.id = id;/*
						 * if we remove this keyword there is no error but it shows us the default value
						 */

	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}

public class Useofthis {

	public static void main(String[] args) {

		Assign a = new Assign();
		a.setId(5);
		System.out.println("id=" + a.getId());
		a.setName("suraj");
		System.out.println("name=" + a.getName());
	}

}
