package com.static1;

public class Statihc {

	static String company = "tcs";
	static int a = 0;

	{
		a++;
	}
	int employeesize;

	public Statihc(int employeesize) {
		this.employeesize = employeesize;
	}

	public void setEmployeeSize(int employeesize) {
		this.employeesize = employeesize;
	}

	public int getEmployeeSize() {
		return employeesize;
	}

	public static void setCompany(String company) {
		Statihc.company = company;
	}

	public static String getCompany() {
		return company;
	}

	public String toString() {
		return "employeesize=" + employeesize + "  company=" + company;

	}

	public static void main(String[] args) {
		Statihc s = new Statihc(150);

		System.out.println(s);
		Statihc s1 = new Statihc(200);
		// System.out.println(a);
		s1.setCompany("hcl");
		System.out.println(s1);
		System.out.println(s);
		System.out.println("hit counter= " + a);
	}

}
