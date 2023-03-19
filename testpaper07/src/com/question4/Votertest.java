package com.question4;

class Voter {
	String name;
	int age;

	public Voter() {

	}

	public Voter(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;

	}

	public int getAge() {
		return age;
	}

	public void checkAge() {
		if (getAge() < 18) {
			try {
				throw new InvalidVoting("your age is not valid for the voting");
			} catch (InvalidVoting e) {
				System.out.println(e);
			}
		} else {
			System.out.println("you can vote");
		}
	}
}

public class Votertest {

	public static void main(String[] args) {

		Voter v = new Voter();
		v.setAge(18);
		v.setName("Suraj");
		v.checkAge();

	}

}
