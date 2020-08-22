package Websites.PageObectModelFrameWork;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;

@Listeners
public class Base {

	public WebDriver driver;

	@Parameters({"browser", "url"})
	@BeforeClass
	
	public void browser (String browser, String url) throws InterruptedException {
		
		if (browser.equalsIgnoreCase("Chrome")) {
			String userDirectoryPath = System.getProperty("user.dir");
			System.out.println(userDirectoryPath);
			System.setProperty("webdriver.chrome.driver", userDirectoryPath+"/Drivers/chromedriver");
			driver = new ChromeDriver();
			driver.navigate().to(url);
			Thread.sleep(1000); // how to add 6 sec gap to go another website
			driver.manage().window().maximize();
			
			System.out.println("URL is : "+ driver.getTitle());

		} else if (browser.equalsIgnoreCase("Firefox")) {
			String userDirectoryPath = System.getProperty("user.dir");
			System.out.println(userDirectoryPath);
			System.setProperty("webdriver.gecko.driver", userDirectoryPath +"/Drivers/geckodriver");
			driver = new FirefoxDriver();
			driver.navigate().to(url);
			Thread.sleep(1000); // how to add 6 sec gap to go another website
			
		}else {
			System.out.println("Wrong browser name");

		}
	}



	public void screenShotPage () throws IOException {
		String userDirectoryPath = System.getProperty("user.dir");
		Date date = new Date();
		String ut = date.toString().replace(" ", "_").replace(":", "_") + ".jpg";
		File CaptureShots = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(CaptureShots, new File(userDirectoryPath+"/ScreenShot/"+ut));
	}
	public static ITestContext setContext(ITestContext iTestContext, WebDriver driver) {
		iTestContext.setAttribute("driver", driver);

		return iTestContext;
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException, IOException {

		screenShotPage ();
		Thread.sleep(8000);
		//driver.close();
		driver.quit();
	}
}
