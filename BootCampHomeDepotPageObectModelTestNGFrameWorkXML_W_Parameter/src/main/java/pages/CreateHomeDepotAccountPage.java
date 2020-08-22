package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateHomeDepotAccountPage {

	public WebDriver driver;

	@FindBy (xpath = "//p[contains(text(),'Personal Account')]")
	WebElement PersonalAccountTextBox;

	@FindBy (xpath = "//span[contains(text(),'Select & Continue')]")
	WebElement SelectAndContinueButton;
	
	public String SoftAssert;
//Factory constructor
	public CreateHomeDepotAccountPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);		
	}

	public String personalAccountTextBox() {
		String CurrentTestAccount = PersonalAccountTextBox.getText();
		return CurrentTestAccount;
	}

	
	public void getPersonalAccountTextBox() {
		PersonalAccountTextBox.click();
	}

	public void getSelectAndContinueButton() {
		SelectAndContinueButton.click();
	}
	
}
