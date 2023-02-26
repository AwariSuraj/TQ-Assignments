package com.question;

import java.util.Scanner;

abstract class Game {
	String name;
	int id;

	public abstract void rules();

	public void noPlayer() {
		System.out.println("enter a number of player");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(n + " player " + " in " + name + " this game whose id=" + id);
	}

	public Game() {

	}

	public Game(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Game [name=" + name + ", id=" + id + "]";
	}

}

class Basketball extends Game {
	float fee;

	public Basketball(String name, int id, float fee) {
		super(name, id);
		this.fee = fee;
	}

	public void rules() {
		System.out.println(" time limit 10 min");
	}

	@Override
	public String toString() {
		return super.toString() + "Basketball [fee=" + fee + "]";
	}

}

class Football extends Game {
	float fee;

	public Football(String name, int id, float fee) {
		super(name, id);
		this.fee = fee;
	}

	public void rules() {
		System.out.println(" time limit 10 min");
	}

	@Override
	public String toString() {
		return super.toString() + "Football [fee=" + fee + "]";
	}

}

public class Q7dynamicmethoddispatch {

	public static void main(String[] args) {

		Game g;

		g = new Basketball("football", 1230, 455555f);
		g.rules();
		g.noPlayer();
		System.out.println(g);
		System.out.println("============================");
		g = new Football("football", 1441, 78124f);
		g.rules();
		g.noPlayer();
		System.out.println(g);
	}

}
