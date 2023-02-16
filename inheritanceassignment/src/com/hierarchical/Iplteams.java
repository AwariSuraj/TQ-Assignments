package com.hierarchical;

class Ipl {

	public void play() {
		System.out.println("playing well");
	}
}

class Csk extends Ipl {
	int players = 14;
	String captain = "Dhoni";
}

class Rcb extends Ipl {
	int players = 13;
	String captain = "virat";
}

public class Iplteams {

	public static void main(String[] args) {

		Csk c = new Csk();
		System.out.println("players =" + c.players + " " + "captain=" + c.captain);
		c.play();
		System.out.println("====================================");
		Rcb r = new Rcb();
		System.out.println("players =" + r.players + " " + "captain=" + r.captain);
		r.play();

	}

}
