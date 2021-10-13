package phptravels;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import excelhandling.ExcelReader;

public class Runner {
	ChromeDriver c;
@BeforeTest
public void precondition() {
	System.setProperty("webdriver.chrome.driver", "C:\\AgileITNewWeekdays\\Selenium\\chromedriver.exe");
	c =new ChromeDriver();
	c.manage().window().maximize();
}
@Test (priority = 1)
public void openurl() {
	String expected = "PHPTRAVELS - PHPTRAVELS";
	c.get("https://www.phptravels.net/");
	Assert.assertEquals(c.getTitle(), expected);
}
@Test (priority = 2 , dependsOnMethods = "openurl")
public void clicklogin() {
	String expected = "Login - PHPTRAVELS";
	Homepage hp = new Homepage(c);
	hp.clicklogin();
	Assert.assertEquals(c.getTitle(), expected);
}
@Test(priority =3, dependsOnMethods = "clicklogin")
public void enterlogindetails() throws IOException {
	String expected = "Dashboard - PHPTRAVELS";
	LoginPage lp = new LoginPage(c);
	ExcelReader xlsreader = new ExcelReader();
	String username = xlsreader.ReadExcel("C:\\Filehandling\\Myworkbook.xlsx", "Login Sheet", 1, 0);
	String password = xlsreader.ReadExcel("C:\\Filehandling\\Myworkbook.xlsx", "Login Sheet", 1, 1);
	lp.enterusername(username);
	lp.enterpassword(password);
	lp.clickbutton();
    Assert.assertEquals(c.getTitle(), expected);
}
@AfterTest
public void closebrowser() {
	c.close();
}
}
