package com.testNGFramework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationsDemo {
  @Test
  public void f() {
	  System.out.println("printing f");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("printing beforeMethod ");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("printing afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("printing beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("printing afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("printing beforeTest ");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("printing afterTest ");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("printing beforeSuite ");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("printing afterSuite ");
  }

}
