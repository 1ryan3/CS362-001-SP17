package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

	 @Test
	  public void test01()  throws Throwable  {
	     Calendar now = Calendar.getInstance();
        GregorianCalendar cal = new GregorianCalendar();
	     CalDay day1 = new CalDay(cal);


         int startHour=15;
         int startMinute= 30;
         int startDay = 11;
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
                 startDay,
                 startMonth,
                 startYear ,
                 title,
                 description);
         assertTrue(appt.getValid());
         day1.addAppt(appt);
         assertTrue(day1.isValid());
         day1.addAppt(appt2);
         assertTrue(day1.isValid());
	 }
    @Test
    public void test02()  throws Throwable  {
        Calendar now = Calendar.getInstance();
        GregorianCalendar cal = new GregorianCalendar();
        CalDay day1 = new CalDay(cal);
        LinkedList<Appt> testList = new LinkedList<Appt>();

        int startHour=15;
        int startMinute= 30;
        int startDay = now.get(Calendar.DAY_OF_MONTH);
        int startMonth = now.get(Calendar.MONTH);
        int startYear = now.get(Calendar.YEAR);
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

        day1.addAppt(appt);
        testList = day1.getAppts();
        assertTrue(testList.getFirst()!= null);
        assertTrue(day1.getSizeAppts() != 0);
        assertEquals(day1.getDay(), now.get(Calendar.DAY_OF_MONTH));
        assertEquals(day1.getMonth(), now.get(Calendar.MONTH));
        assertEquals(day1.getYear(), now.get(Calendar.YEAR));
        assertTrue(day1.toString() != null);
    }

}
