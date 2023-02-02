package com.OperatorHw;

public class SunlightHw22 {

	public static void main(String[] args) {
		double kmFromSun = 150000000;
		double lightSpeed = 299792458;

		double mFromSun = kmFromSun * 1000;
		double seconds = mFromSun / lightSpeed;
		System.out.println("Light will use ");
		double min = seconds / 60;
		seconds = 0;
		System.out.println(min + " minute(s) and " + seconds + " second(s)");
		System.out.println(" to travel from the sun to the earth.");
	}
}
