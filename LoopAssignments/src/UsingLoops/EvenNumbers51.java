package UsingLoops;

public class EvenNumbers51 {

	public static void main(String[] args) {

		int num1 = 121;
		int num2 = 229;
		// print even numbers between these two value
		for (int i = num1; i <= num2; i++) {
			if (i % 2 == 0)
				System.out.print(i);
			System.out.print(" ");
		}

	}

}
