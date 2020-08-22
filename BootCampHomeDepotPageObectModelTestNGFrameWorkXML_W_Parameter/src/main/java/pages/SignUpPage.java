package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

	public WebDriver driver;

	@FindBy (name = "email")
	WebElement emailField;

	@FindBy (id = "password-input-field")
	WebElement passwordField;
	
	@FindBy (xpath = "//label[@id='showPasswordCheck']")
	WebElement showPassword;

	@FindBy (id = "zipCode")
	WebElement zipCodeField;

	@FindBy (id = "phone")
	WebElement phoneField;

	@FindBy (xpath = "//div[@class='myAccount--button u--marginSmall-bottom']//div[@class='checkbox-btn']")
	WebElement checkBoxPhone;
	
	@FindBy (xpath = "//span[contains(text(),'Create an Account')]")
	WebElement createAccountButton;

	public String SoftAssert;
//Factory constructor
	public SignUpPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);		
	}

	
	public void getEmail (String email) {
		emailField.sendKeys (email);

	}

	public void getPassword (String password) {
		passwordField.sendKeys(password);

	}

	public void getshowPassword() {
		showPassword.click();;

	}
	
	public void getzipCode(String zipcode) {
		zipCodeField.sendKeys(zipcode);
	}

	public void getPhoneNumber(String phoneNumber) {
		phoneField.sendKeys(phoneNumber);

	}
	public void getPhoneNumberCheckBox () {
		checkBoxPhone.click();

	}

	public void getcreatebuttonaccount() {
		createAccountButton.click();
	}

	

	}



