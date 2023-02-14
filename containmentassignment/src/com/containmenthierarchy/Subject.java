package com.containmenthierarchy;

public class Subject {

	private int subjid;
	private String subjname;
	private Topic topic;

	public Subject() {

	}

	public Subject(int subjid, String subjname, Topic topic) {

		this.subjid = subjid;
		this.subjname = subjname;
		this.topic = topic;

	}

	public int getSubjid() {
		return subjid;
	}

	public void setSubjid(int subjid) {
		this.subjid = subjid;
	}

	public String getSubjname() {
		return subjname;
	}

	public void setSubjname(String subjname) {
		this.subjname = subjname;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public String toString() {
		return "Subject [subjid=" + subjid + ", subjname=" + subjname + ", topic=" + topic + "]";
	}

}
