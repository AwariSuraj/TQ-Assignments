package com.containmenthierarchy;

public class Topic {

	private int tid;
	private String tname;
	private Subtopic subtopic;

	public Topic() {

	}

	public Topic(int id, String tname, Subtopic subtopic) {

		this.tid = tid;
		this.tname = tname;
		this.subtopic = subtopic;
	}

	public Subtopic getSubtopic() {
		return subtopic;
	}

	public void setSubtopic(Subtopic subtopic) {
		this.subtopic = subtopic;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String toString() {
		return "Topic [tid=" + tid + ", tname=" + tname + ", subtopic=" + subtopic + "]";
	}

}
