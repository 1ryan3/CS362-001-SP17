package edu.osu.cs362;


import org.junit.Test;

import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Random;

import static org.junit.Assert.*;

	/**
	 * Random Test Generator  for CalDay class.
	 */

	public class CalDayRandomTest {
		private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
		private static final int NUM_TESTS = 100;
		/**
		 * Generate Random Tests that tests CalDay Class.
		 */
		@Test
		public void randomtest() throws Throwable {

			long startTime = Calendar.getInstance().getTimeInMillis();
			long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;


			System.out.println("Start testing...");


			for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				long randomseed = System.currentTimeMillis();
				//			System.out.println(" Seed:"+randomseed );
				Random random = new Random(randomseed);

				GregorianCalendar cal = new GregorianCalendar();
				CalDay day1 = new CalDay(cal);

				for (int i = 0; i < NUM_TESTS; i++) {
					int startHour = ValuesGenerator.getRandomIntBetween(random, 0, 23);
					int startMinute = 30;
					int startDay = 10;
					int startMonth = 4;
					int startYear = 2017;
					String title = "Birthday Party";
					String description = "This is my birthday party.";
					//Construct a new Appointment object with the initial data
					Appt appt = new Appt(startHour,
							startMinute,
							startDay,
							startMonth,
							startYear,
							title,
							description);
					Appt appt2 = new Appt(startHour + 1,
							startMinute,
							startDay,
							startMonth,
							startYear,
							title,
							description);
					Appt appt3 = new Appt(startHour - 1,
							startMinute,
							startDay,
							startMonth,
							startYear,
							title,
							description);
					day1.addAppt(appt);
					assertTrue(day1.isValid());
					day1.addAppt(appt2);
					assertTrue(day1.isValid());
					day1.addAppt(appt3);
					assertTrue(day1.isValid());
				}

				elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
				if ((iteration % 10000) == 0 && iteration != 0)
					System.out.println("elapsed time: " + elapsed + " of " + TestTimeout);

			}


			System.out.println("Done testing...");

		}


	}

