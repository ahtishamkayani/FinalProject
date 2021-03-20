package AutomationPracticeLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Resources.HomePage;
import junit.framework.Assert;

public class LocatorsAutomationPractice {

	
	public WebDriver driver;
	
	By SearchField=By.xpath("//*[@id=\"search_query_top\"]");
	By ClickSearchButton=By.xpath("//*[@id=\"searchbox\"]/button");
	By WebList=By.xpath("//*[@id=\"center_column\"]");
	By Black1= By.xpath("//*[@id=\"color_22\"]");
	By Black2= By.xpath("//*[@id=\"color_7\"]");
	
	
	public LocatorsAutomationPractice(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public WebElement GetSearchField() {
		return driver.findElement(SearchField);
	}
	public WebElement GetSearchButton() {
		return driver.findElement(ClickSearchButton);
	}
	
//	public List<WebElement> GetRecord() {
//		List<WebElement> myElements = driver.findElements(WebList);
////		for(WebElement e : myElements) {
////			Assert.assertEquals(true, e.isDisplayed());
//		//}
//		return myElements;
//	}
////	public List<WebElement> GetDressessCode() {
////		List<WebElement> myElements = driver.findElements(Black1,Black2);
////		
////		return myElements;
////	}
	
		
	
	
	

	//HomePage page=new HomePage();
	
	

}
