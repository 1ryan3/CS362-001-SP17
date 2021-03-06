/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 18 03:38:54 GMT 2017
 */

package tutorial;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import tutorial.Stack;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Stack_ESTest extends Stack_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Stack<Object> stack0 = new Stack<Object>();
      assertTrue(stack0.isEmpty());
      
      stack0.push(stack0);
      stack0.push(stack0);
      stack0.pop();
      assertFalse(stack0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Stack<Integer> stack0 = new Stack<Integer>();
      stack0.push((Integer) null);
      assertFalse(stack0.isEmpty());
      
      stack0.pop();
      boolean boolean0 = stack0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Stack<Object> stack0 = new Stack<Object>();
      assertTrue(stack0.isEmpty());
      
      stack0.push(stack0);
      boolean boolean0 = stack0.isEmpty();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Stack<Object> stack0 = new Stack<Object>();
      // Undeclared exception!
      try { 
        stack0.pop();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Stack empty
         //
         assertThrownBy("tutorial.Stack", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Stack<Integer> stack0 = new Stack<Integer>();
      Stack<Object> stack1 = new Stack<Object>();
      stack1.push((Object) null);
      stack1.push(stack0);
      stack1.push(stack0);
      stack1.push(stack0);
      Object object0 = new Object();
      stack1.push(object0);
      stack1.push(object0);
      stack1.push(stack1);
      stack1.push("");
      stack1.push(object0);
      // Undeclared exception!
      try { 
        stack1.push("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Stack exceeded capacity!
         //
         assertThrownBy("tutorial.Stack", e);
      }
  }
}
