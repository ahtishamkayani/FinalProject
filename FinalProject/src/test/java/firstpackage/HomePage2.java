package firstpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.HomePage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;

public class HomePage2 extends HomePage{
	//private static void LogManager.getLogger(LandingPage.class.getName())
	@BeforeTest
	public void InitailzeDriver() throws IOException {
		driver=InitalizeDriver();
	}

	@Test(dataProvider="getData" )
	public void openbrowser(String Username,String Password) throws IOException {
		//driver.findElement(By.className("sumome-react-wysiwyg-move-handle")).click();
		driver.get(prop.getProperty("url"));
		LandingPage landing=new LandingPage(driver);
		System.out.println("First Test CASE");
		//landing.closebutton().click();
		landing.getlogin().click();//driver.findelement
		LoginPage Login=new LoginPage(driver);
		Login.GetEmail().sendKeys(Username);
		Login.GetPassword().sendKeys(Password);
		Login.GetIntoLogin().click(); 

		  
	}
	//to user hava to login so we create array list
	//one user will have access to all modules
	//one user will just see the modules
	@DataProvider
	public  Object[][] getData() {
		//row stands for how many different types test should run
		//column stands for how many values for each test
		//0 ROW
		//Start from 0 but count is 2 row and 2 columns
		//[2][2] array lenth is two thats why 2 mentioned 
		Object[][] data=new Object[2][2];
		data[0][0]="gluon@jembott.com";
		data[0][1]="111111aa";
		
	 //First Row 
		
		
		 data[1][0]="gluon@jembott.com";
		 data[1][1]="111111aa";
		 
		 
		return data;
				  
	}


	@AfterTest
	public void tearDown(){
		driver.close();
		driver=null;
	}
	
}
