package phptravels;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import excelhandling.ExcelReader;

public class Homepage {
	WebDriver c;
public Homepage(WebDriver c) {
	this.c = c;
}

public void clicklogin() {
	c.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div/div/a[2]")).click();
	
}

}
