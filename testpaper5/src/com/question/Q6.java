/*
 * package com.question;
 * 
 * significance for the final keyword
 * 
 * .1)Java final variable If you make any variable as final,you cannot change
 * the value of final variable(It will be constant).
 * 
 * class Bike9{ final int speedlimit=90;//final variable void run(){
 * speedlimit=400; } public static void main(String args[]){ Bike9 obj=new
 * Bike9(); obj.run(); } }
 * 
 * 
 * 
 * 2)Java final method If you make any method as final, you cannot override it.
 * 
 * class Bike{ final void run(){System.out.println("running");} }
 * 
 * class Honda extends Bike{ void
 * run(){System.out.println("running safely with 100kmph");}
 * 
 * public static void main(String args[]){ Honda honda= new Honda();
 * honda.run(); } }
 * 
 * 
 * 3)Java final class If you make any class as final, you cannot extend it.
 * 
 * final class Bike{}
 * 
 * class Honda1 extends Bike{ void
 * run(){System.out.println("running safely with 100kmph");}
 * 
 * public static void main(String args[]){ Honda1 honda= new Honda1();
 * honda.run(); } }
 */