package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	
	public WebDriver driver;
	By signin=By.xpath("//*[@id=\"homepage\"]/header/div[1]/div/nav/ul/li[4]/a");
//	By Closebutton=By.xpath("//*[@id=\"homepage\"]/div[4]/div[2]/div/div/div/span/div/div[6]/div/div/button");
	By Title= By.xpath("//*[@id=\"content\"]/div/div/h2");
	By Contact=By.xpath("//*[@id=\"homepage\"]/header/div[2]/div/nav/ul/li[8]/a");
	
	  public LandingPage(WebDriver driver) {
		// TOD O Auto-generated constructor stub
		  this.driver=driver;
	}
	  public WebElement VerifyContact() { 
		  return driver.findElement(Contact);
	  }
	  
	  public WebElement getTitle() {
		  return driver.findElement(Title);
	  }

	public WebElement getlogin() {  
		return driver.findElement(signin);
	}
	
	/*public WebElement closebutton() {
		return driver.findElement(Closebutton);*/
		
	}

 