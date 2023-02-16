package com.wrapperdemo;

//A valueOf() method which takes primitive type as an argument
//A valueOf() method which takes String type as an argument
//A valueOf() method which takes two arguments. One is String type and another one is int type.
public class Valueof {

	public static void main(String[] args) {

		// primitive types
		Byte B = Byte.valueOf((byte) 123);
		System.out.println(B); // Output : 123

		Short S = Short.valueOf((short) 25);
		System.out.println(S); // Output : 25

		Integer I = Integer.valueOf(46);
		System.out.println(I); // Output : 46

		Long L = Long.valueOf(235);
		System.out.println(L); // Output : 235

		Float F = Float.valueOf(23.5f);
		System.out.println(F); // Output : 23.5

		Double D = Double.valueOf(15.4d);
		System.out.println(D); // Output : 15.4

		Boolean BLN = Boolean.valueOf(true);
		System.out.println(BLN); // Output : true

		BLN = Boolean.valueOf(false);
		System.out.println(BLN); // Output : false

		Character C = Character.valueOf('C');
		System.out.println(C); // Output : C

		// string type
		Byte b = Byte.valueOf("123");
		System.out.println(B); // Output : 123

		Short s = Short.valueOf("25");
		System.out.println(S); // Output : 25

		Integer i = Integer.valueOf("46");
		System.out.println(I); // Output : 46

		Long l = Long.valueOf("235");
		System.out.println(L); // Output : 235

		Float f = Float.valueOf("23.5");
		System.out.println(F); // Output : 23.5

		Double d = Double.valueOf("15.4");
		System.out.println(D); // Output : 15.4

		Boolean bln = Boolean.valueOf("true");
		System.out.println(BLN); // Output : true

		BLN = Boolean.valueOf("false");
		System.out.println(BLN); // Output : false

		BLN = Boolean.valueOf("abc");
		System.out.println(BLN); // Output : false

		// Character C = Character.valueOf("C"); //Compile Time Error : Character Class
		// doesn't have this method

		// valueof() method having two arguments

		/*
		 * This form of valueOf method takes two arguments. One is String type which
		 * holds valid numeric value to be converted into wrapper class object and
		 * second argument is int type which indicates the radix or base of that numeric
		 * value. This form also throws NumberFormatException if String is not a valid
		 * numeric value. This method is available only in Byte, Short, Integer and Long
		 * wrapper classes.
		 */

		Byte b1 = Byte.valueOf("10110", 2); // A number with base 2 is converted into decimal value
		System.out.println(b); // Output : 22

		b1 = Byte.valueOf("43", 5); // A number with base 5 is converted into decimal value
		System.out.println(b1); // Output : 23

		Short s1 = Short.valueOf("12043", 8); // A number with base 8 is converted into decimal value
		System.out.println(s1); // Output : 5155

		s1 = Short.valueOf("4751", 10); // A number with base 10 is converted into decimal value
		System.out.println(s1); // Output : 4751

		Integer i1 = Integer.valueOf("4673AB", 12); // A number with base 12 is converted into decimal value
		System.out.println(i1); // Output : 1132403

		i1 = Integer.valueOf("6489CDF", 16); // A number with base 16 is converted into decimal value
		System.out.println(i1); // Output : 105422047

		Long l1 = Long.valueOf("GHFTDJ", 36); // A number with base 36 is converted into decimal value
		System.out.println(l1); // Output : 996750199

		l = Long.valueOf("DFGCHJ", 36); // A number with base 36 is converted into decimal value
		System.out.println(l); // Output : 812017207
	}

}
