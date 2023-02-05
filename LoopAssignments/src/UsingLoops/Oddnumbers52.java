package UsingLoops;

public class Oddnumbers52 {

	public static void main(String[] args) {

		int num1 = 521;
		int num2 = 229;
		// print odd numbers between these two value
		for (int i = num1; i >= num2; i--) {
			if (i % 2 != 0) {
				System.out.print(i);
				System.out.print(" ");
			}
		}
	}

}
