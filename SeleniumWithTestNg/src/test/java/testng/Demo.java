package testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo {
@Test(priority = 1)
public void mytestcase() {
	System.out.println("This is my testcase");
	System.out.println("1st line");
	Assert.assertEquals("Actual", "Actual");
	System.out.println("2nd line");
	System.out.println("3rd line");
}
@BeforeTest
public void beforetest() {
	System.out.println("This is my beforetest");
}
@AfterTest
public void aftertest() {
	System.out.println("This is my aftertest");
}
@Test(priority = 2,dependsOnMethods = "mytestcase")
public void mySecondtestcase() {
	System.out.println("This is my secondtest case");
	System.out.println("line1");
	SoftAssert s = new SoftAssert();
	s.assertEquals("Expected", "Actual");
	System.out.println("line2");
	System.out.println("line3");
	s.assertAll(); //decison point at which i need to fail a test case
}
@BeforeMethod
public void beforemethod() {
	System.out.println("This is from before method");
}
@AfterMethod
public void aftermethod() {
	System.out.println("This is from after method");
}
@BeforeClass
public void beforeclass() {
	System.out.println("This is from beforeclass");
}
@AfterClass
public void afterclass() {
	System.out.println("This is from afterclass");
}
@BeforeSuite
public void beforesuite() {
	System.out.println("This is from beforesuite");
}
@AfterSuite
public void aftersuite() {
	System.out.println("This is from aftersuite");
}
}
