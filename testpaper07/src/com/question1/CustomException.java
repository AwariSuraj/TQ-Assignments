package com.question1;

class Account {
	int id;
	String name;
	float balance;

	public Account() {

	}

	public Account(int id, String name, float balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;

	}

	public void setId(int id) {
		this.id = id;
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

	public void setBalance() {
		this.balance = balance;
	}

	public float getBalance() {
		return balance;
	}

	public String toString() {
		return "id =" + id + "  " + "name=" + name;
	}

	public void withdraw(float amount) throws InvalidAmount {
		balance = balance - amount;
		if (balance < 0) {

			throw new InvalidAmount("please enter less amount");

		} else {
			System.out.println(balance);
		}
	}
}

public class CustomException {

	public static void main(String[] args) {

		Account a = new Account(101, "Saving", 45000);

		System.out.println(a);

		try {
			a.withdraw(500);
		} catch (InvalidAmount e) {
			System.out.println(e);
		}
	}

}
