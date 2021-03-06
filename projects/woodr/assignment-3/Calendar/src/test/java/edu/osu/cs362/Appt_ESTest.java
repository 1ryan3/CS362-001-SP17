/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 04:41:41 GMT 2017
 */

package edu.osu.cs362;

import org.junit.Test;
import static org.junit.Assert.*;
import edu.osu.cs362.Appt;

public class Appt_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Appt appt0 = new Appt(23, 23, 1319, (-6), 23, "%%-2F;nTVQ]<Pnj\"", "%%-2F;nTVQ]<Pnj\"");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Appt appt0 = new Appt(2, 2, 2, 2, (-1022), "%Y-%M-%D%z", "\"\"xqjKA\nn.jmw");
      appt0.setStartMinute(817);
      appt0.getValid();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Appt appt0 = new Appt(2433, 2433, 233, 233, 0, "I,`;M8m1y{u", "I,`;M8m1y{u");
      appt0.getStartYear();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Appt appt0 = new Appt(1, 1, (-989), 0, (-989), "", (String) null);
      appt0.getStartYear();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, 0, 14, "", "h");
      appt0.getStartMonth();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, (-941), (-125), (String) null, (String) null);
      appt0.getStartMonth();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 12, 84, 2220, "=R", "F4!T/B3\"K?aBQ^eL");
      appt0.getStartMinute();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Appt appt0 = new Appt((-506), (-652), (-506), 0, 0, "s^H){+d6v*U3", "s^H){+d6v*U3");
      appt0.getStartMinute();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Appt appt0 = new Appt(11, 11, 11, 5, 0, "|o|^bN=N", "|o|^bN=N");
      appt0.getStartHour();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Appt appt0 = new Appt(31, 31, 0, 0, 31, "S@N", "S@N");
      appt0.getStartDay();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Appt appt0 = new Appt(11, 11, 11, 11, 11, "", "L-&gzun");
      appt0.getStartDay();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Appt appt0 = new Appt(1, 1, 1, 1, 1, (String) null, "P&~Uyj2cAy");
      String string0 = appt0.getDescription();
      assertEquals(1, appt0.getStartDay());
      assertEquals("P&~Uyj2cAy", string0);
      assertTrue(appt0.getValid());
      assertEquals(1, appt0.getStartMinute());
      assertEquals("", appt0.getTitle());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Appt appt0 = new Appt(1, 1, 1, 1, 1, (String) null, "P&~Uyj2cAy");
      appt0.setDescription("P&~Uyj2cAy");
      assertEquals("P&~Uyj2cAy", appt0.getDescription());
      assertTrue(appt0.getValid());
      assertEquals(1, appt0.getStartMinute());
      assertEquals(1, appt0.getStartMonth());
      assertEquals("", appt0.getTitle());
      assertEquals(1, appt0.getStartHour());
      assertEquals(1, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Appt appt0 = new Appt(11, 11, 11, 11, 1808, "", "L-&gu");
      assertEquals("L-&gu", appt0.getDescription());

      appt0.setDescription((String) null);
      assertEquals(1808, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Appt appt0 = new Appt(1, 1, 1, 1, 1, (String) null, "P&~Uyj2cAy");
      assertEquals("", appt0.getTitle());

      appt0.setTitle("P&~Uyj2cAy");
      appt0.getTitle();
      assertEquals("P&~Uyj2cAy", appt0.getTitle());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Appt appt0 = new Appt((-1585), (-1585), (-1585), (-1585), 0, "", (String) null);
      appt0.setTitle((String) null);
      assertEquals(-1585, appt0.getStartDay());
      assertEquals(0, appt0.getStartYear());
      assertFalse(appt0.getValid());
      assertEquals(-1585, appt0.getStartMonth());
      assertEquals(-1585, appt0.getStartHour());
      assertEquals(-1585, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Appt appt0 = new Appt(1, 1, 1, 1, 1, (String) null, "P&~Uyj2cAy");
      String string0 = appt0.getTitle();
      assertEquals(1, appt0.getStartMinute());
      assertEquals(1, appt0.getStartMonth());
      assertEquals(1, appt0.getStartHour());
      assertTrue(appt0.getValid());
      assertNotNull(string0);
      assertEquals(1, appt0.getStartDay());
      assertEquals("", string0);
      assertEquals("P&~Uyj2cAy", appt0.getDescription());
      assertEquals(1, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Appt appt0 = new Appt(1000000000, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, 1000000000, "", "");
      int int0 = appt0.getStartDay();
      assertEquals(Integer.MIN_VALUE, int0);
      assertEquals(-2147483648, appt0.getStartMonth());
      assertEquals(-2147483648, appt0.getStartMinute());
      assertEquals(1000000000, appt0.getStartHour());
      assertEquals(1000000000, appt0.getStartYear());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Appt appt0 = new Appt(11, 11, 11, 5, 0, "|o|^bN=N", "|o|^bN=N");
      boolean boolean0 = appt0.getValid();
      assertEquals(5, appt0.getStartMonth());
      assertEquals(11, appt0.getStartHour());
      assertTrue(boolean0);
      assertEquals(11, appt0.getStartMinute());
      assertEquals("|o|^bN=N", appt0.getDescription());
      assertEquals(0, appt0.getStartYear());
      assertEquals(11, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 12, 84, 2220, "=R", "F4!T/B3\"K?aBQ^eL");
      int int0 = appt0.getStartYear();
      assertEquals(84, appt0.getStartMonth());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartMinute());
      assertEquals(2220, int0);
      assertEquals(0, appt0.getStartHour());
      assertEquals("=R", appt0.getTitle());
      assertEquals(12, appt0.getStartDay());
      assertEquals("F4!T/B3\"K?aBQ^eL", appt0.getDescription());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Appt appt0 = new Appt(12, 12, 12, 12, 80, "=:lr^#'=`20K", "=:lr^#'=`20K");
      int int0 = appt0.getStartMinute();
      assertEquals(12, int0);
      assertEquals("=:lr^#'=`20K", appt0.getDescription());
      assertEquals(80, appt0.getStartYear());
      assertEquals("=:lr^#'=`20K", appt0.getTitle());
      assertEquals(12, appt0.getStartMonth());
      assertEquals(12, appt0.getStartHour());
      assertTrue(appt0.getValid());
      assertEquals(12, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Appt appt0 = new Appt(1813, 0, 0, 1813, 0, "pm", "");
      String string0 = appt0.getDescription();
      assertEquals(0, appt0.getStartMinute());
      assertEquals("", string0);
      assertEquals(1813, appt0.getStartMonth());
      assertEquals(0, appt0.getStartDay());
      assertEquals("pm", appt0.getTitle());
      assertEquals(1813, appt0.getStartHour());
      assertEquals(0, appt0.getStartYear());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Appt appt0 = new Appt(1813, 0, 0, 1813, 0, "pm", "");
      int int0 = appt0.getStartMonth();
      assertEquals(1813, int0);
      assertEquals("", appt0.getDescription());
      assertEquals("pm", appt0.getTitle());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartDay());
      assertEquals(1813, appt0.getStartHour());
      assertEquals(0, appt0.getStartMinute());
      assertEquals(0, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Appt appt0 = new Appt(11, 11, 11, 11, 11, "", "L-&gzun");
      appt0.setStartHour(0);
      appt0.toString();
      assertEquals(0, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Appt appt0 = new Appt(11, 11, 11, 11, 1808, "", "L-&gu");
      appt0.setStartHour(14);
      appt0.toString();
      assertEquals(14, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Appt appt0 = new Appt(3, 59, 1671, 3, (-261), "ov", "---%D%z");
      String string0 = appt0.toString();
      assertNull(string0);
      assertEquals("ov", appt0.getTitle());
      assertEquals(1671, appt0.getStartDay());
      assertEquals(-261, appt0.getStartYear());
      assertEquals("---%D%z", appt0.getDescription());
      assertEquals(3, appt0.getStartHour());
      assertEquals(59, appt0.getStartMinute());
      assertEquals(3, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Appt appt0 = new Appt(728, 24, 24, 0, 728, "", "");
      assertEquals(728, appt0.getStartHour());

      appt0.setStartHour(0);
      assertEquals(0, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Appt appt0 = new Appt(1813, 0, 0, 1813, 0, "pm", "");
      appt0.setStartHour(0);
      appt0.setStartDay(31);
      assertEquals(31, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Appt appt0 = new Appt(0, (-1315), 0, (-1315), 57, (String) null, (String) null);
      int int0 = appt0.getStartHour();
      assertEquals(-1315, appt0.getStartMinute());
      assertEquals(-1315, appt0.getStartMonth());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartDay());
      assertEquals(0, int0);
      assertEquals(57, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Appt appt0 = new Appt((-1585), (-1585), (-1585), (-1585), 0, "", (String) null);
      int int0 = appt0.getStartHour();
      assertEquals(0, appt0.getStartYear());
      assertFalse(appt0.getValid());
      assertEquals((-1585), int0);
      assertEquals(-1585, appt0.getStartMinute());
      assertEquals(-1585, appt0.getStartMonth());
      assertEquals(-1585, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Appt appt0 = new Appt(11, 11, 11, 5, 0, "|o|^bN=N", "|o|^bN=N");
      appt0.setStartYear(783);
      assertEquals(783, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Appt appt0 = new Appt(11, 11, 11, 5, 0, "|o|^bN=N", "|o|^bN=N");
      assertEquals(5, appt0.getStartMonth());

      appt0.setStartMonth(11);
      assertTrue(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Appt appt0 = new Appt(11, 11, 11, 5, 0, "|o|^bN=N", "|o|^bN=N");
      String string0 = appt0.toString();
      assertNotNull(string0);
      assertEquals("\t5/11/0 at 11:11am ,|o|^bN=N, |o|^bN=N\n", string0);
  }
}
