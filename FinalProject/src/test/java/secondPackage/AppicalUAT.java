package secondPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import FirstPackage.AppicalCreateAccount;
import Resources.HomePage;


public class AppicalUAT extends HomePage{
		

	//WebDriverWait wait = new WebDriverWait(driver,30);
	@BeforeTest
	public void InitailzeDriver() throws IOException {
		driver=InitalizeDriver();
		driver.get(prop.getProperty("url2"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
		
	}

	@AfterTest
	public void tearDown(){
		//driver.close();
		//driver=null;
	}

	@Test
	public void openbrowser() throws IOException, InterruptedException, AWTException {
	
		//driver.findElement(By.className("sumome-react-wysiwyg-move-handle")).click();
		AppicalCreateAccount App=new AppicalCreateAccount(driver);
		System.out.println("First Test Case");
		//Compare text with browser with actual value
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		App.CreatePageAccount().click();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		App.GetFirstName().sendKeys("Ahtisham");
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		App.GetLastTime().sendKeys("Kayani");
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		App.GetEmail().sendKeys("Ahtisham@new.com");
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		Robot robot = new Robot();
		for (int i = 0; i < 4; i++) {

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			
		}
	
		App.GetPassword().sendKeys("Test1234@");
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		App.GetConfirmPassword().sendKeys("Test1234@");
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		App.GetCreateButton().click();
		
		
		}
	}
	

