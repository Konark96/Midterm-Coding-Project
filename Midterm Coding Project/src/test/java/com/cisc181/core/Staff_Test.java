package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {
	private static ArrayList<Staff> list = new ArrayList<Staff>();

	@BeforeClass
	public static void setup() {
		Staff a = new Staff("Rob", "Bob", "Hobbes", new Date(), "20 Mapple Street", 
				"302 302 3022", "Rat@tat.tat", "Always Open", 5, 3.21, new Date(),
				eTitle.MR);
		Staff b = new Staff("John", "Ron", "Lawn", new Date(), "20 Mapple Street", 
				"302 302 3023", "Rate@tat.tat", "Always Open", 4, 44.55, new Date(),
				eTitle.MR);
		Staff c = new Staff("Jill", "Bill", "Hill", new Date(), "20 Mapple Street", 
				"302 302 3024", "Rap@tat.tat", "Always Open", 3, 67.67, new Date(),
				eTitle.MRS);
		Staff d = new Staff("Kyle", "Smile", "While", new Date(), "20 Mapple Street", 
				"302 302 3025", "Tap@tat.tat", "Always Open", 2, 88.88, new Date(),
				eTitle.MR);
		Staff e = new Staff("Miles", "Styles", "Files", new Date(), "20 Mapple Street", 
				"302 302 3026", "Tape@tat.tat", "Always Open", 1, 999.99, new Date(),
				eTitle.MR);
		
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		list.add(e);
	}

	@Test
	public void testAvgSal() {
		double avgSal = 0;
		for(Staff s: list){
			avgSal += s.getSalary();
		}
		avgSal = avgSal / 5;
		assertEquals("The average salery should be 240.86", avgSal, 240.86, .001) ;
	}

}
