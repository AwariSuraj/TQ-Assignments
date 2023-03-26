package com.question;

import java.util.ArrayList;
import java.util.Scanner;

class Icecream {
	private int price;
	private String scoopsize;
	private ArrayList flavours;

	public Icecream() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Icecream(int price, String scoopsize, ArrayList flavours) {
		super();
		this.price = price;
		this.scoopsize = scoopsize;
		this.flavours = flavours;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getScoopsize() {
		return scoopsize;
	}

	public void setScoopsize(String scoopsize) {
		this.scoopsize = scoopsize;
	}

	public ArrayList getFlavours() {
		return flavours;
	}

	public void setFlavours(ArrayList flavours) {
		this.flavours = flavours;
	}

	@Override
	public String toString() {
		return "Icecream [price=" + price + ", scoopsize=" + scoopsize + ", flavours=" + flavours + "]";
	}

}

public class Icecreamobjects {

	public static ArrayList flavourDetails() {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> flavours1 = new ArrayList<>();
		System.out.println("enter a three flavour");

		for (int i = 0; i < 3; i++) {
			flavours1.add(i, sc.next());
		}
		return flavours1;
	}

	public static void icecreamDetails(Icecream i) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a price");
		i.setPrice(sc.nextInt());
		System.out.println("enter a scoopsize");
		i.setScoopsize(sc.next());
		System.out.println("enter a flavours");
		i.setFlavours(flavourDetails());
	}

	public static void main(String[] args) {

		Icecream i1[] = new Icecream[3];
		for (int i = 0; i < 3; i++) {
			i1[i] = new Icecream();
			icecreamDetails(i1[i]);

		}

		System.out.println(".................................................................");
		for (Icecream ice : i1) {
			System.out.println(ice);
		}

	}

}
