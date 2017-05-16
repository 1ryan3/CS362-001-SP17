package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {

	 @Test
	  public void test01()  throws Throwable  {
	 	 TimeTable tt = new TimeTable();
	 	 Calendar now = Calendar.getInstance();
		 
		 GregorianCalendar first = new GregorianCalendar(2017,4,1);
		 GregorianCalendar second = new GregorianCalendar(2017,4,30);

		 CalDay day1 = new CalDay(first);


		 int startHour=15;
		 int startMinute= 30;
		 int startDay = 2;
		 int startMonth = 4;
		 int startYear = 2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data
		 Appt appt = new Appt(startHour,
				 startMinute ,
				 startDay ,
				 startMonth ,
				 startYear ,
				 title,
				 description);

		 Appt appt2 = new Appt(startHour + 1,
				 startMinute,
				 startDay,
				 startMonth,
				 startYear ,
				 title,
				 description);
		 Appt appt3 = new Appt(startHour + 2,
				 startMinute,
				 startDay,
				 startMonth,
				 startYear ,
				 "TEST",
				 description);

		 Appt appt4 = new Appt(startHour + 2,
				 99,
				 startDay,
				 startMonth,
				 startYear ,
				 title,
				 description);


		 day1.addAppt(appt);
		 day1.addAppt(appt2);
		 day1.addAppt(appt3);

		 assertNotNull(tt.getApptRange(day1.getAppts(), first, second).getFirst());
	         assertTrue((tt.getApptRange(day1.getAppts(), first, second)).size() != 0);		 
		 assertTrue(tt.deleteAppt(day1.getAppts(), appt3) != null);
		 assertTrue((tt.deleteAppt(day1.getAppts(),appt)) != null);
		 assertTrue(tt.deleteAppt(null,null) == null);
		 day1.addAppt(appt4);
		 assertTrue(tt.deleteAppt(day1.getAppts(), appt4) == null);
		
	 }
	 @Test
	  public void test02()  throws Throwable { 
	 	 TimeTable tt = new TimeTable();
		 LinkedList<Appt> apptList = new LinkedList();
		 GregorianCalendar today = new GregorianCalendar(2017,4,1);
                 GregorianCalendar tomo = new GregorianCalendar(2017,4,2);
		 int startHour=15;
		 int startMinute= 30;
		 int startDay = 1;
		 int startMonth = 4;
		 int startYear = 2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data
		 Appt appt = new Appt(startHour,
				 startMinute ,
				 startDay ,
				 startMonth ,
				 startYear ,
				 title,
				 description);

	

	
		 apptList.add(appt);

		 LinkedList<CalDay> list = tt.getApptRange(apptList, today, tomo);
		 
		 assertFalse(list.size() == 0);
		 
		 assertTrue(list.getFirst().getAppts().getFirst() == appt); 
		 
	}
	 @Test
	  public void test03()  throws Throwable { 
	 	 TimeTable tt = new TimeTable();
		 LinkedList<Appt> apptList = new LinkedList();
		 GregorianCalendar today = new GregorianCalendar(2017,4,1);
                 GregorianCalendar tomo = new GregorianCalendar(2017,4,2);
		 int startHour=15;
		 int startMinute= 30;
		 int startDay = 1;
		 int startMonth = 4;
		 int startYear = 2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data
		 Appt appt = new Appt(startHour,
				 startMinute ,
				 startDay ,
				 startMonth ,
				 startYear ,
				 title,
				 description);

	

	
		 apptList.add(appt);

		 LinkedList<CalDay> list = tt.getApptRange(apptList, today, tomo);
		 
		 assertFalse(list.size() == 0);
		 
		 assertTrue(list.getFirst().getAppts().getFirst() == appt); 
		 
		 
		 assertTrue((tt.deleteAppt(apptList,appt)) != null);
		 assertTrue((tt.deleteAppt(apptList,appt)) == null);
	}

	
}
