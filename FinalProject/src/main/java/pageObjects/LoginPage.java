package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 

public class LoginPage {
	
	WebDriver driver;
	By Email=By.id("user_email");
	By Password=By.id("user_password");
	By GetLogin=By.xpath("//*[@id=\"hero\"]/div/form/div[3]/input");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
		public WebElement GetEmail() {
		return driver.findElement(Email);		
	}
	public WebElement GetIntoLogin() {
		return driver.findElement(GetLogin);
	}
	public WebElement GetPassword() {
		return driver.findElement(Password);
		
	}
	
	
	
}
