package FirstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AppicalLogin {
	public WebDriver driver;
	
	By Email= By.xpath("//input[@type='email']");
	By Password=By.xpath("//input[@type='password']");
	By Login= By.xpath("//button[@type=\"submit\"]");
	
	public AppicalLogin(WebDriver driver) {
		this.driver=driver;
		
	}
	
	
	public WebElement GetloginEmail() {
		return driver.findElement(Email);
	}
	
	public WebElement GetLoginPassword() {
		return driver.findElement(Password);
	}
	public WebElement GetLoginButtonInto() {
		return driver.findElement(Login);
	}
	
	

}
