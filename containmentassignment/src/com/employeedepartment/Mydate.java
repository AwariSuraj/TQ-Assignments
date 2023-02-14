package com.employeedepartment;

public class Mydate {

	private String month;
	private int day;
	private int year;

	public Mydate() {

	}

	public Mydate(String month, int day, int year) {

		this.month = month;
		this.day = day;
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String toString() {
		return "Mydate [month=" + month + ", day=" + day + ", year=" + year + "]";
	}

}
