package edu.osu.cs362;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.LinkedList;
import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for TimeTable class.
 */

public class TimeTableRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS = 100;
    /**
     * Generate Random Tests that tests TimeTable Class.
     */
	 @Test
	  public void randomtest()  throws Throwable  {
		 	 long startTime = Calendar.getInstance().getTimeInMillis();
			 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;


			 System.out.println("Start testing...");


			 for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				 long randomseed = System.currentTimeMillis();
				 Random random = new Random(randomseed);

				 //			System.out.println(" Seed:"+randomseed );
				 TimeTable tt = new TimeTable();
				 Calendar now = Calendar.getInstance();
				 LinkedList<Appt> listAppts = new LinkedList<Appt>();
				 GregorianCalendar first = new GregorianCalendar(2017,4,1);
				 GregorianCalendar second = new GregorianCalendar(2017,4,30);
				 CalDay day1 = new CalDay(first);

				 for (int i = 0; i < NUM_TESTS; i++) {

                     int startHour= ValuesGenerator.getRandomIntBetween(random, 0, 23);
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
                     assertTrue((tt.deleteAppt(listAppts,appt)) == null);
                     listAppts.add(appt);
                     assertTrue((tt.deleteAppt(listAppts,null)) == null);
                     listAppts.add(appt);
                     listAppts.add(appt2);
                     listAppts.add(appt3);
                     day1.addAppt(appt);
                     day1.addAppt(appt2);
                     day1.addAppt(appt3);
                     tt.getApptRange(listAppts, first, second);
                     assertTrue((tt.deleteAppt(listAppts,appt)) != null);
                     assertTrue(tt.deleteAppt(null,null) == null);

				 }

				 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
				 if ((iteration % 10000) == 0 && iteration != 0)
					 System.out.println("elapsed time: " + elapsed + " of " + TestTimeout);

			 }


			 System.out.println("Done testing...");

		 }
		 
		 
	 }


	

