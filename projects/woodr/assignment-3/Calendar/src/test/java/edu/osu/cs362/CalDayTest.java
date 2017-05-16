package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.Iterator;

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
        assertTrue(day1.toString() != null);
    }
    @Test

    public void test03()  throws Throwable  {
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

	Appt appt2 = new Appt(startHour + 1,
                startMinute + 1,
                startDay - 1,
                startMonth ,
                startYear ,
                title,
                description);

        day1.addAppt(appt);
	day1.addAppt(appt2);
	assertNotNull(day1.getAppts());
        testList = day1.getAppts();
	assertNotNull(testList);
        assertTrue(testList.getFirst()!= null);
        assertTrue(day1.getSizeAppts() != 0);
        assertTrue(day1.toString() != null);
    }
    @Test
    public void test04() throws Throwable {
	CalDay day = new CalDay();
	assertFalse(day.isValid());
	
	Iterator itrBad = day.iterator();
	assertNull(itrBad);
	assertEquals("",day.toString());
	Appt appt = new Appt(1,
                -1 ,
                22,
                11 ,
                2017 ,
                "Party",
                "Birthday!");

	Calendar now = Calendar.getInstance();
        GregorianCalendar cal = new GregorianCalendar();
        CalDay day1 = new CalDay(cal);
	
	Iterator itr = day1.iterator();
	assertNotNull(itr);	
	day1.addAppt(appt);
	assertEquals(0, day1.getSizeAppts());
	assertFalse("" == day.toString());	
    }	
    
    @Test
    public void test05() throws Throwable {

        GregorianCalendar cal = new GregorianCalendar(2017,4,1);
        CalDay day1 = new CalDay(cal);

	assertTrue(day1.getYear() == 2017);

    }	
    @Test
    public void test06() throws Throwable {

        GregorianCalendar cal = new GregorianCalendar(2017,4,1);
        CalDay day1 = new CalDay(cal);

	assertTrue(day1.getMonth() == 4);

    }	
    @Test
    public void test07() throws Throwable {

        GregorianCalendar cal = new GregorianCalendar(2017,4,21);
        CalDay day1 = new CalDay(cal);
	assertTrue(day1.getDay() == 21);

    }	
    @Test
    public void test08() throws Throwable {

        GregorianCalendar cal = new GregorianCalendar(2017,4,21);
        CalDay day1 = new CalDay(cal);
	Appt appt = new Appt(
 		 2,
                 2,
                22,
                11,
                2017 ,
                "Party",
                "Birthday!");

	day1.addAppt(appt);
	assertEquals(day1.getAppts().size(), 1);
	assertNotNull(day1.getAppts());
	assertNotNull(day1.getAppts().getFirst());
	Appt appt2 = new Appt(
                 2,
                 2,
                22,
                11 ,
                2017 ,
                "Party2",
                "Birthday!");
	Appt appt3 = new Appt(
                 3,
                 2,
                22,
                11 ,
                2017 ,
                "Party3",
                "Birthday!");

	day1.addAppt(appt3);
	assertTrue((day1.getAppts()).get(1) == appt3);
	day1.addAppt(appt2);
	assertTrue((day1.getAppts()).get(1) == appt2);
	assertTrue(day1.getSizeAppts() == 3);
	assertNotNull((day1.getAppts()).getFirst());
	assertTrue(day1.toString().contains("Party2"));
	assertTrue(day1.toString().contains("Party3"));
    }	



}
