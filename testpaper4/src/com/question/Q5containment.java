package com.question;

import java.util.Scanner;

class Book {
	private int id;
	private String name;
	private float price;
	private Author a;

	public Book() {

	}

	public Book(int id, String name, float price, Author a) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.a = a;
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Author getA() {
		return a;
	}

	public void setA(Author a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", a=" + a + "]";
	}

}

class Author {

	private int id;
	private String name;
	private String addrr;

	public Author() {

	}

	public Author(int id, String name, String addrr) {
		super();
		this.id = id;
		this.name = name;
		this.addrr = addrr;
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

	public String getAddrr() {
		return addrr;
	}

	public void setAddrr(String addrr) {
		this.addrr = addrr;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", addrr=" + addrr + "]";
	}

}

public class Q5containment {

	static Scanner sc = new Scanner(System.in);

	public static void enterBookDetails(Book b1) {
		Author a = new Author();
		System.out.println("enter a book id");
		b1.setId(sc.nextInt());
		System.out.println("enter a book name");
		b1.setName(sc.next());
		System.out.println("enter a book price");
		b1.setPrice(sc.nextFloat());
		enterAuthorDetails(a);
		b1.setA(a);

	}

	public static void enterAuthorDetails(Author a1) {
		System.out.println("enter a Author id");
		a1.setId(sc.nextInt());
		System.out.println("enter a Author name");
		a1.setName(sc.next());
		System.out.println("enter a Author address");
		a1.setAddrr(sc.next());
	}

	public static void main(String[] args) {

		Book b = new Book();
		enterBookDetails(b);

		System.out.println(b);
	}
}
