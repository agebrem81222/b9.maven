package b9.maven.com.step;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import b9.maven.com.page.PurchaseFlightPage;
import b9.maven.com.utils.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PurchaseFlightSteps {
	PurchaseFlightPage obj = new PurchaseFlightPage();

	@Given("User navigates to BlazaDemo Purchase {string}")
	public void user_navigates_to_blaza_demo_purchase(String url) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		Constants.driver = new ChromeDriver();
		Constants.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Constants.driver.manage().window().maximize();
		Constants.driver.get(url);
		Thread.sleep(2000);

	}

	@When("User enters Name {string}")
	public void user_enters_name(String Name) {
		obj.enterFirstLastName(Name);

	}

	@When("User enters Address {string}")
	public void user_enters_address(String Address) {
		obj.enterAddress(Address);

	}

	@When("User enters City {string}")
	public void user_enters_city(String City) {
		obj.enterCity(City);

	}

	@When("User enters State {string}")
	public void user_enters_state(String State) {
		obj.enterState(State);

	}

	@When("User enters Zip Code {string}")
	public void user_enters_zip_code(String ZipCode) {
		obj.enterzipCode(ZipCode);

	}

	@When("User selects Card Type {string}")
	public void user_selects_card_type(String CardType) {
		obj.selectcardType(CardType);

	}

	@When("user enters Credit Card Number {string}")
	public void user_enters_credit_card_number(String CardNumber) {
		obj.entertCardNumber(CardNumber);

	}

	@When("User enters Month {string}")
	public void user_enters_month(String Month) {
		obj.entertcreditCardMonth(Month);

	}

	@When("User enters Year {string}")
	public void user_enters_year(String Year) {
		obj.entercreditCardYear(Year);

	}

	@When("User enters Name on Card {string}")
	public void user_enters_name_on_card(String NameOnCard) {
		obj.enternameOnCard(NameOnCard);

	}

	@When("User check Remember me")
	public void user_check_remember_me() {
		obj.clickRememberMeCheck();

	}

	@When("user clicks purchase Flight")
	public void user_clicks_purchase_flight() {
		obj.clicksubmitButton();

	}

	@Then("User verifies success message {string}")
	public void user_verifies_success_message(String Message) throws InterruptedException {
		obj.verifyMessage(Message);

		Thread.sleep(2000);
		Constants.driver.quit();
	}

}
