package com.question;

//1)super can be used to refer immediate parent class instance variable.
/*
 * class Animal { String color = "white"; }
 * 
 * class Dog extends Animal { String color = "black";
 * 
 * void printColor() { System.out.println(color);// prints color of Dog class
 * System.out.println(super.color);// prints color of Animal class } }
 * 
 * class TestSuper1 { public static void main(String args[]) { Dog d = new
 * Dog(); d.printColor(); } }
 */

//  2)super can be used to invoke immediate parent class method.
/*
 * class Animal { void eat() { System.out.println("eating..."); } }
 * 
 * class Dog extends Animal { void eat() {
 * System.out.println("eating bread..."); }
 * 
 * void bark() { System.out.println("barking..."); }
 * 
 * void work() { super.eat(); bark(); } }
 * 
 * class TestSuper2 { public static void main(String args[]) { Dog d = new
 * Dog(); d.work(); } }
 */

/*
 * 3)super()can be used to invoke immediate parent class constructor.
 * 
 * class Animal { Animal() { System.out.println("animal is created"); } }
 * 
 * class Dog extends Animal { Dog() { super();
 * System.out.println("dog is created"); } }
 * 
 * class TestSuper3 { public static void main(String args[]) { Dog d = new
 * Dog(); } }
 */
