package UsingLoops;

public class BreakStatement54 {

	public static void main(String[] args) {
		int num = 4;
		System.out.println("initial value of num " + num);
		int i;
		for (i = 0; i <= num; i++) {

			if (i > 2) {
				num = i;
				break;
			}
		}
		System.out.println("using break at specific condition value of num= " + num);
	}

}
