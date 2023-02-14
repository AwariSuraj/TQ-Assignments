package com.containmenthierarchy;

public class Institute {

	private int iid;
	private String iname;
	private Subject subject;

	public Institute() {

	}

	public Institute(int iid, String iname, Subject subject) {

		this.iid = iid;
		this.iname = iname;
		this.subject = subject;
	}

	public int getIid() {
		return iid;
	}

	public void setIid(int iid) {
		this.iid = iid;
	}

	public String getIname() {
		return iname;
	}

	public void setIname(String iname) {
		this.iname = iname;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public String toString() {
		return "Institute [iid=" + iid + ", iname=" + iname + ", subject=" + subject + "]";
	}

}
