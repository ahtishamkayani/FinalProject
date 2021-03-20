package FirstPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Resources.HomePage;

public class AppicalCreateAccount  extends HomePage{
	public WebDriver driver;
	
	By CreateAccount=By.xpath("/html/body/div/div/div/div/div/div[1]/div/div[2]/p/a");
	By FirstName= By.xpath("/html/body/div/div/div/div/div/div[1]/div/form/div[1]/div[2]/div/input");
	By LastName=By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/input[1]");
	By Email=By.xpath("/html/body/div/div/div/div/div/div[1]/div/form/div[3]/div[2]/div/input");
	By Password=By.xpath("/html/body/div/div/div/div/div/div[1]/div/form/div[4]/div/div[2]/div/input");
	By ConfirmPassword=By.xpath("/html/body/div/div/div/div/div/div[1]/div/form/div[5]/div/div[2]/div/input");
	By CreateAccountButton=By.xpath("/html/body/div/div/div/div/div/div[1]/div/form/div[6]/button");
	
	public AppicalCreateAccount(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	
	public WebElement CreatePageAccount() {
		return driver.findElement(CreateAccount);
	}
	public WebElement GetFirstName() {
		return driver.findElement(FirstName);
	}
	
	public WebElement GetLastTime() {
		return driver.findElement(LastName);
	}
	public WebElement GetEmail() {
		return driver.findElement(Email);
	}
	public WebElement GetPassword() {
		return driver.findElement(Password);
	}
	public WebElement GetConfirmPassword() {
		return driver.findElement(ConfirmPassword);
	}
	public WebElement GetCreateButton() {
		return driver.findElement(CreateAccountButton);
	
}
}