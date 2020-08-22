package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	@FindBy (xpath = "//*[contains(@id, 'headerMyAccountTitle')][div]")
	WebElement MyAccountText;

	@FindBy (xpath = "//span[contains(text(),'Register')]")
	WebElement RegisterButton;


	public HomePage (WebDriver driver) {


		this.driver = driver;
		PageFactory.initElements(driver, this);
	} 

	public String MyAccountTextVerification () {
		String MyAccountCurrentText = MyAccountText.getText();
		return MyAccountCurrentText;
	}


	public void MyAccountClick() {
		MyAccountText.click();

	}
	public void RegisterButtonClick() {
		RegisterButton.click();
	}


}
