package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	private UUID sectionID = new UUID((long)Math.random(), (long)Math.random());
	private UUID studentID = new UUID((long)Math.random(), (long)Math.random());
	private UUID enrollmentID;
	private double grade;
	
	private Enrollment(){
		enrollmentID = new UUID((long)Math.random(), (long)Math.random());
	}
	public Enrollment(UUID studentID, UUID sectionID){
		this.studentID = studentID;
		this.sectionID = sectionID;
		enrollmentID = new UUID((long)Math.random(), (long)Math.random());
	}
	public void setGrade(double grade){
		this.grade = grade;
	}
}
