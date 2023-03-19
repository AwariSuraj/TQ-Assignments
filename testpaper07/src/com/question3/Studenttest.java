package com.question3;

import java.util.Arrays;

class Student {
	int marks[];

	public Student() {

	}

	public Student(int marks[]) {
		this.marks = marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public int[] getMarks() {
		return marks;
	}

	public String toString() {
		return "marks=" + Arrays.toString(marks);
	}

	public void checkMarks(int[] marks1) {
		for (int i = 0; i < marks1.length; i++) {
			if (marks1[i] < 0 || marks1[i] > 100) {
				try {
					throw new InvalidMarks("marks are invalid");
				} catch (InvalidMarks e) {
					System.out.println(e);
				}
			} else {
				System.out.print(marks1[i] + " ");
			}
		}
	}
}

public class Studenttest {

	public static void main(String[] args) {

		Student s = new Student();
		int markss[] = { 50, 85, 100, 80, 56 };
		s.setMarks(markss);
		System.out.println(s);
		s.checkMarks(markss);

	}

}
