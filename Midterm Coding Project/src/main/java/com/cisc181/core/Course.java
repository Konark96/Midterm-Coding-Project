package com.cisc181.core;

import java.util.UUID;
import com.cisc181.eNums.eMajor;;

public class Course {
	private final UUID courseID = new UUID((long) Math.random(), (long) Math.random());
	private String courseName;
	private int gradePoints;
	private eMajor major;
}
