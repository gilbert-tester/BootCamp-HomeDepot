package runner;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import Websites.PageObectModelFrameWork.Base;
import pages.CreateHomeDepotAccountPage;
import pages.HomePage;
import pages.SignUpPage;

@Listeners
public class HomeDepotTest extends Base{
	
	@Test (priority =1)
	public WebDriver Verification() {
		HomePage home =  new HomePage (driver);
		String MyAccountText = home.MyAccountTextVerification();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(MyAccountText, "My Account");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		}
	
	@Parameters({"email","password","zip","phone"})
	@Test (priority = 2)
		public void CreateTheAccount (String email, String password, String zip, String phone) throws IOException {
		HomePage home = new HomePage(driver);
		home.MyAccountClick();
		home.RegisterButtonClick();
		
		CreateHomeDepotAccountPage pg = new CreateHomeDepotAccountPage (driver);
		pg.getPersonalAccountTextBox();
		pg.getSelectAndContinueButton();
		
		SignUpPage sp = new SignUpPage(driver);
		sp.getEmail(email);
		
		sp.getshowPassword();
		sp.getPassword(password);
		sp.getzipCode(zip);
		sp.getPhoneNumber(phone);
		//sp.getPhoneNumberCheckBox();
		sp.getcreatebuttonaccount();
		screenShotPage ();
		
//		String CreateAccountText = sp.CreateAnAccountVerification();
//		SoftAssert softAssert = new SoftAssert();
//		softAssert.assertEquals(CreateAccountText, "Create an Account");
		//boolean lk = dt.linkDisplay();
		//softAssert.assertEquals(lk, true);
		//boolean clicked = dt.CreatebuttonClickable();
		//softAssert.assertEquals(clicked, true);
		//dt.Email("ddannbul@gmail.com");
		//dt.password("asdklsadlkasd");
		//dt.PhoneNumber("9098763423");
		//dt.ZipCode("92345");
	//	dt.Createbuttonaccount();
//		softAssert.assertAll();
		
	}

}
