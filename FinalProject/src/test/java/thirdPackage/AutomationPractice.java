package thirdPackage;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import AutomationPracticeLocators.LocatorsAutomationPractice;
import FirstPackage.AppicalCreateAccount;
import Resources.HomePage;

public class AutomationPractice extends HomePage{
	
//	@BeforeTest
//	public void InitailzeDriver() throws IOException {
//		driver=InitalizeDriver();
//		driver.get(prop.getProperty("url3"));
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
//		
//	}
//
//	@AfterTest
//	public void tearDown(){
//		//driver.close();
//		//driver=null;
//	}
//	
//	@Test
//	public void openbrowser() throws IOException, InterruptedException {
//	
//		//driver.findElement(By.className("sumome-react-wysiwyg-move-handle")).click();
//		LocatorsAutomationPractice LP=new LocatorsAutomationPractice(driver);
//		String Actual=driver.getTitle();
//		Assert.assertEquals(Actual,"My Store");
//		LP.GetSearchField().sendKeys("Black");
//		LP.GetSearchButton().click();
//		Thread.sleep(2000);
//		List<WebElement> myElements=LP.GetRecord();
//		for(WebElement e : myElements) {
//			Assert.assertEquals(true, e.isDisplayed());
//		}
//		
//		//premain calculation
////		Assert.assertTrue(landing.VerifyContact().isDisplayed());
////		landing.VerifyContact().isDisplayed();
////		Assert.assertEquals(landing.getTitle().getText(),"FEATURED COURSES");
////		Assert.assertTrue(true);
////		System.out.println("Thirs Test Case");
////	
//
//		
		
		//}

}
