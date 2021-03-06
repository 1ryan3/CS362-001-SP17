package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;

public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void test01()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
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
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(13, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());
	 }

    /* Test the toString function*/
     @Test
     public void test02() throws Throwable {
         int startHour=10;
		 int startMinute=10;
		 int startDay=1;
		 int startMonth=1;
		 int startYear=2001;
		 String title="Party";
		 String description="PARTY!";
		 //Construct a new Appointment object with the initial data
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	// assertions
        assertEquals("\t1/1/2001 at 10:10am ,Party, PARTY!\n",appt.toString());

     }
    @Test
    public void test02b() throws Throwable {
        int startHour=12;
        int startMinute=10;
        int startDay=1;
        int startMonth=1;
        int startYear=2001;
        String title="Party";
        String description="PARTY!";
        //Construct a new Appointment object with the initial data
        Appt appt = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);
        // assertions
        assertEquals("\t1/1/2001 at 12:10pm ,Party, PARTY!\n",appt.toString());

    }
    @Test
    public void test02c() throws Throwable {
        int startHour=0;
        int startMinute=10;
        int startDay=1;
        int startMonth=1;
        int startYear=2001;
        String title="Party";
        String description="PARTY!";
        //Construct a new Appointment object with the initial data
        Appt appt = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);
        // assertions
        assertEquals("\t1/1/2001 at 12:10am ,Party, PARTY!\n",appt.toString());

    }
    @Test
    public void test03()  throws Throwable  {
        int startHour=25;
        int startMinute=30;
        int startDay=10;
        int startMonth=4;
        int startYear=2017;
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
        // assertions
        assertFalse(appt.getValid());
    }
    @Test
    public void test04()  throws Throwable  {
        int startHour=23;
        int startMinute=75;
        int startDay=10;
        int startMonth=4;
        int startYear=2017;
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
        // assertions
        assertFalse(appt.getValid());
    }
    @Test
    public void test05()  throws Throwable  {
        int startHour=23;
        int startMinute=30;
        int startDay=83;
        int startMonth=4;
        int startYear=2017;
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
        // assertions
        assertFalse(appt.getValid());
    }
    @Test
    public void test06()  throws Throwable  {
        int startHour=22;
        int startMinute=30;
        int startDay=10;
        int startMonth=19;
        int startYear=2017;
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
        // assertions
        assertEquals(null, appt.toString());
        assertFalse(appt.getValid());
    }
    @Test
    public void test07()  throws Throwable  {
        int startHour=23;
        int startMinute=30;
        int startDay=10;
        int startMonth=4;
        int startYear=2017;
        String description="This is my birthday party.";
        //Construct a new Appointment object with the initial data
        Appt appt = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                null,
                description);
        // assertions
        assertEquals("",appt.getTitle());
    }
    @Test
    public void test08()  throws Throwable  {
        int startHour=23;
        int startMinute=30;
        int startDay=10;
        int startMonth=4;
        int startYear=2017;
        String title="Birthday Party";
        //Construct a new Appointment object with the initial data
        Appt appt = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                null);
        // assertions
        assertEquals("", appt.getDescription());
    }
    @Test
    public void test09()  throws Throwable  {
        int startHour=-1;
        int startMinute=30;
        int startDay=11;
        int startMonth=4;
        int startYear=2017;
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
        // assertions
        assertFalse(appt.getValid());
    }
    @Test
    public void test10()  throws Throwable  {
        int startHour=23;
        int startMinute=-1;
        int startDay=11;
        int startMonth=4;
        int startYear=2017;
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
        // assertions
        assertFalse(appt.getValid());
    }
    @Test
    public void test11()  throws Throwable  {
        int startHour=23;
        int startMinute=30;
        int startDay=-1;
        int startMonth=4;
        int startYear=2017;
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
        // assertions
        assertFalse(appt.getValid());
    }
    @Test
    public void test12()  throws Throwable  {
        int startHour=23;
        int startMinute=30;
        int startDay=11;
        int startMonth=-1;
        int startYear=2017;
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
        // assertions
        assertFalse(appt.getValid());
    }
    @Test
    public void test13()  throws Throwable  {
        int startHour=23;
        int startMinute=30;
        int startDay=11;
        int startMonth=4;
        int startYear=2017;
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
        // assertions
        assertTrue(appt.getValid());
        appt.setDescription("NEW");
        assertTrue(appt.getValid());
        appt.setTitle("NEWNEW");
        assertTrue(appt.getValid());
        appt.setStartDay(11);
        assertTrue(appt.getValid());
        appt.setStartHour(1);
        assertTrue(appt.getValid());
        appt.setStartMinute(22);
        assertTrue(appt.getValid());
        appt.setStartMonth(10);
        assertTrue(appt.getValid());
        appt.setStartYear(2011);
        assertTrue(appt.getValid());
    }
}
