package com.containmenthierarchy;

public class Question {
	private int qid;
	private String qname;

	public Question() {

	}

	public Question(int qid, String qname) {

		this.qid = qid;
		this.qname = qname;
	}

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQname() {
		return qname;
	}

	public void setQname(String qname) {
		this.qname = qname;
	}

	public String toString() {
		return "Question [qid=" + qid + ", qname=" + qname + "]";
	}

}
