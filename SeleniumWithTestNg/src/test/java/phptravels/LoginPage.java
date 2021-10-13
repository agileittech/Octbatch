package phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage{
	WebDriver c;
public LoginPage(WebDriver c) {
	this.c = c;
}
	public void enterusername(String username) {
		c.findElement(By.name("email")).sendKeys(username);
	}
	public void enterpassword(String password) {
		c.findElement(By.name("password")).sendKeys(password);
		c.findElement(By.id("cookie_stop")).click();
	}
	public void clickbutton() {
		c.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[3]/button")).click();
	    
	}
	
}
