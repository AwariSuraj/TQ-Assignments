package com.containmenthierarchy;

public class Subtopic {

	private int Subtid;
	private String subtname;
	private Question q;

	public Subtopic() {

	}

	public Subtopic(int subtid, String subtname, Question q) {

		Subtid = subtid;
		this.subtname = subtname;
		this.q = q;
	}

	public Question getQ() {
		return q;
	}

	public void setQ(Question q) {
		this.q = q;
	}

	public int getSubtid() {
		return Subtid;
	}

	public void setSubtid(int subtid) {
		Subtid = subtid;
	}

	public String getSubtname() {
		return subtname;
	}

	public void setSubtname(String suntname) {
		this.subtname = subtname;
	}

	public String toString() {
		return "Subtopic [Subtid=" + Subtid + ", subtname=" + subtname + ", question=" + q + "]";
	}

}
