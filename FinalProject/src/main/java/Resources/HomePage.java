package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;


public class HomePage{
	
	public WebDriver driver;
	public Properties prop;
	//public WebDriverWait wait=new WebDriverWait(driver,30);
	public WebDriver InitalizeDriver() throws IOException {
		prop=new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\Ahtisham Kashif\\Documents\\FinalProject-master\\src\\main\\java\\Resources/browser.properties");
		//FileInputStream file=new FileInputStream("/Users/arkhitech/Downloads/AppicalCode-master/src/main/java/Resources/browser.properties");
		prop.load(file);
		String brow=prop.getProperty("browser");
		if(brow.equals("chrome")) {
			// System.setProperty("webdriver.chrome.driver", "/Users/arkhitech/desktop/chromedriver");
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ahtisham Kashif\\eclipse-workspace\\chromedriver.exe");
			 driver = new ChromeDriver();	
			//Execute in browser   
		}
		else if(brow.equals("firefox")) {
			//System.setProperty("webdriver.firefox.driver", "F:\\ChromeDriver\\firefoxdriver.exe");
			 driver = new FirefoxDriver();
			
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
	 
	
public void getScreenshots(String result) throws IOException {
		
//	File src2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	FileHandler.copy(src2, new File("/Users/arkhitech/desktop/SeleniumFailure"+result+" screenshot.png"));
//	//FileHandler.copy(src2, new File("/Users/arkhitech/desktop/SeleniumFailure"+result+" screenshot.png"));
	//FileHandler.
}
}