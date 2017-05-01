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
		 LinkedList<Appt> listAppts = new LinkedList<Appt>();
		 GregorianCalendar first = new GregorianCalendar(2017,4,1);
		 GregorianCalendar second = new GregorianCalendar(2017,4,30);
		 CalDay day1 = new CalDay(first);


		 int startHour=15;
		 int startMinute= 30;
		 int startDay = 10;
		 int startMonth = 1;
		 int startYear = 2011;
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

		 Appt appt2 = new Appt(startHour - 1,
				 startMinute - 1,
				 startDay + 1,
				 startMonth,
				 startYear ,
				 title,
				 description);
		 Appt appt3 = new Appt(startHour + 1,
				 startMinute - 1,
				 startDay + 8,
				 startMonth,
				 startYear ,
				 title,
				 description);
		 listAppts.add(appt);
		 listAppts.add(appt2);
		 listAppts.add(appt3);
		 day1.addAppt(appt);
		 day1.addAppt(appt2);
		 day1.addAppt(appt3);
		 tt.getApptRange(listAppts, first, second);
		 assertTrue(tt.deleteAppt(listAppts, appt3) != null);
		 assertTrue((tt.deleteAppt(listAppts,appt)) != null);
		 assertTrue(tt.deleteAppt(null,null) == null);
	 }

}
