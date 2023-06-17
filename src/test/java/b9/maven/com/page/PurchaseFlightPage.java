package b9.maven.com.page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import b9.maven.com.utils.Constants;


public class PurchaseFlightPage {
		
	
	
	@FindBy(xpath = "//input[@placeholder='First Last']")
	 WebElement firstLastNameField;
	

	@FindBy(xpath = "//input[@placeholder='123 Main St.']")
	 WebElement addressField;
	
	@FindBy(xpath = "//input[@name='city']")
	 WebElement cityField;
	
	@FindBy(xpath = "//input[@placeholder='State']")
	 WebElement stateField;
	
	@FindBy(xpath = "//input[@placeholder='12345']")
	 WebElement zipCodeField;
	
	@FindBy(xpath = "//select[@name='cardType']")
	WebElement cardTypeDropdownField;
	
	@FindBy(xpath = "//input[@id='creditCardNumber']")
	WebElement creditCardNumberField;
	
	@FindBy(xpath = "//input[@id='creditCardMonth']")
	WebElement creditCardMonthField;
	
	@FindBy(xpath = "//input[@id='creditCardYear']")
	WebElement creditCardYearField;
	
	@FindBy(xpath = "//input[@id='nameOnCard']")
	WebElement nameOnCardField;

	@FindBy(xpath = "//input[@id= 'rememberMe']")
	WebElement rememberMeCheck;
	
	@FindBy(xpath = "//input[@type= 'submit']")
	WebElement submitButton;
	
	@FindBy(xpath = "//h1[text()= 'Thank you for your purchase today!]")
	WebElement verifcationMessageText;

	

	//Class Constructor
	public PurchaseFlightPage() {
	
		PageFactory.initElements(Constants.driver,this);
	
	}
	
	// methods
	public void enterFirstLastName(String FirsLast) {
		firstLastNameField.sendKeys(FirsLast);
	}
	

	public void enterAddress(String address) {
		addressField.sendKeys(address);

	}

	public void enterCity(String city) {
		cityField.sendKeys(city);
	}
	public void enterState(String State ) {
		stateField.sendKeys( State);
	}
	public void enterzipCode(String zipCode) {
		zipCodeField.sendKeys(zipCode);
}
	public void selectcardType(String cardType) {
		Select select = new Select(cardTypeDropdownField);
		select.selectByVisibleText(cardType);
		
	}
	public void  entertCardNumber(String creditCardNumber) {
		creditCardNumberField.sendKeys( creditCardNumber);
}
	public void  entertcreditCardMonth(String creditCardMonth) {
		creditCardMonthField.sendKeys( creditCardMonth);
}
	public void  entercreditCardYear(String creditCardYear) {
		creditCardYearField.sendKeys(creditCardYear);
	
}
	public void enternameOnCard(String nameOnCard ) {
		nameOnCardField.sendKeys(nameOnCard);
}
	public void clickRememberMeCheck() {
		rememberMeCheck.click();
	
}	

	public void clicksubmitButton() {
		submitButton.click();
}

 public void verifyMessage(String message)throws InterruptedException{
	
	 String expectedMessage = "Thank you for your purchase today!";
	 
	 if(expectedMessage.equals(message)) {
		 System.out.println("PASSED");
	 }else {
		 System.out.println("FAIELD");
	 }
		 
		 Thread.sleep(2000);
		 Constants.driver.quit();
 }
	      
}
	


