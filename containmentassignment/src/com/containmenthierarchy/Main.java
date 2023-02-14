package com.containmenthierarchy;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void instituteDetails(Institute i1) {
		Subject s = new Subject();
		System.out.println("enter a institute id");
		i1.setIid(sc.nextInt());
		System.out.println("enter a institute name");
		i1.setIname(sc.next());
		subjectDetails(s);
		i1.setSubject(s);

	}

	public static void subjectDetails(Subject s1) {
		Topic t = new Topic();

		System.out.println("enter a subject id");
		s1.setSubjid(sc.nextInt());
		System.out.println("enter a subject name");
		s1.setSubjname(sc.next());
		topicDetails(t);
		s1.setTopic(t);
	}

	public static void topicDetails(Topic t1) {
		Subtopic s = new Subtopic();
		System.out.println("enter a topic id");
		t1.setTid(sc.nextInt());
		System.out.println("enter a topic name");
		t1.setTname(sc.next());
		subtopicDetails(s);
		t1.setSubtopic(s);

	}

	public static void subtopicDetails(Subtopic s1) {
		Question q = new Question();
		System.out.println("enter a subtopic id");
		s1.setSubtid(sc.nextInt());
		System.out.println("enter a subtopic name");
		s1.setSubtname(sc.next());
		questionDetails(q);
		s1.setQ(q);

	}

	public static void questionDetails(Question q1) {
		System.out.println("enter a question id");
		q1.setQid(sc.nextInt());
		System.out.println("enter a question name");
		q1.setQname(sc.next());
	}

	public static void main(String[] args) {

		Institute i = new Institute();
		System.out.println(i);
		instituteDetails(i);

		System.out.println(i);

	}
}