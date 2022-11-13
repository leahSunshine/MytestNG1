package com;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest1 {
	  @Test
	  public void f1() {
		  System.out.println("f1");
	  }
	  @Test
	  public void f2() {
		  System.out.println("f2");
	  }
	  @Test
	  public void f3() {
		  System.out.println("f2");
	  }
		@Test
		public void assertEquals1() {
			System.out.println("1");
			Assert.assertEquals("1","2");  //Assert.assertEquals(actual, expected)，actual实际值和expected期望值比较
		}
		
		@Test
		public void assertEquals2() {
			System.out.println("11");
			Assert.assertEquals("11","12","断言");  //Assert.assertEquals(actual,expected，“message1”)actual实际值和expected期望值比较,比较失败返回message1
		}
}
