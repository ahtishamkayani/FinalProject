package secondPackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import FirstPackage.AppicalLogin;
import Resources.HomePage;

public class AppicalUATLogin extends HomePage {
	
	//WebDriverWait wait = new WebDriverWait(driver,30);
		@BeforeTest
		public void InitailzeDriver() throws IOException {
			driver=InitalizeDriver();
			driver.get(prop.getProperty("url2"));
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
			
		}

		@AfterTest
		public void tearDown(){
			driver.close();
			//driver=null;
		}
		@Test
		public void LoginintoAppical() throws InterruptedException {
			AppicalLogin login=new AppicalLogin(driver);
			login.GetloginEmail().sendKeys("ahtishamkayani1@gmail.com");
			login.GetLoginPassword().sendKeys("Test123@");
			login.GetLoginButtonInto().click();
			Thread.sleep(2000);
			Assert.assertTrue(false);
		}
}
