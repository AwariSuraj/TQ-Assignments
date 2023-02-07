package com.basic;

public class StudentPer {

	int sub1;
	int sub2;
	int sub3;
	int sub4;
	int sub5;
	int per;

	void take(int s1, int s2, int s3, int s4, int s5) {
		sub1 = s1;
		sub2 = s2;
		sub3 = s3;
		sub4 = s4;
		sub5 = s5;

	}

	void percentage() {
		int sum = sub1 + sub2 + sub3 + sub4 + sub5;
		per = sum / 5;
		System.out.println("percentage= " + per);

	}

	void grade() {
		if (per > 90) {
			System.out.println("grade A");
		} else if (per > 75) {
			System.out.println("grade B");
		} else if (per > 60) {
			System.out.println("grade C");
		} else {
			System.out.println("grade D");
		}

	}

	public static void main(String[] args) {

		StudentPer s = new StudentPer();

		s.take(85, 86, 45, 96, 45);
		s.percentage();
		s.grade();

	}

}
