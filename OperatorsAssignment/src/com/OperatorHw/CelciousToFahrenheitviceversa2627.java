package com.OperatorHw;

public class CelciousToFahrenheitviceversa2627 {

	public static void main(String[] args) {

		int tempinc = 45;

		float tempf = (tempinc * 9 / 5) + 32;
		System.out.println("we convert celcious into fahrenheit " + tempf);

		float celcious = (tempf - 32) * 5 / 9;
		System.out.println("we again convert fahrenheit into the celcious " + celcious);
	}

}
