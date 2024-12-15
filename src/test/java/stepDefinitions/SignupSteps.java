package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import pageobject.SignupPage;
import pageobject.HomePage;

public class SignupSteps {
	WebDriver driver;
	SignupPage signupPage;
	HomePage homePage;

	@Given("I am on the signup page")
	public void i_am_on_the_signup_page() {
		System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
		signupPage = new SignupPage(driver);
	}

	@When("I enter valid details and click {string} button")
	public void i_enter_valid_details_and_click_button(String button) {
		signupPage.setFirstName("John");
		signupPage.setLastName("Doe");
		signupPage.setEmail("john.doe@example.com");
		signupPage.setPassword("Password123");
		signupPage.setConfirmPassword("Password123");
		signupPage.clickCreateAccount();
	}

	@When("I leave all mandatory fields empty and click {string} button")
	public void i_leave_all_mandatory_fields_empty_and_click_button(String button) {
		signupPage.clickCreateAccount();
	}

	@When("I enter an invalid email and click {string} button")
	public void i_enter_an_invalid_email_and_click_button(String button) {
		signupPage.setFirstName("John");
		signupPage.setLastName("Doe");
		signupPage.setEmail("invalid-email");
		signupPage.setPassword("Password123");
		signupPage.setConfirmPassword("Password123");
		signupPage.clickCreateAccount();
	}

	@When("I enter mismatched passwords and click {string} button")
	public void i_enter_mismatched_passwords_and_click_button(String button) {
		signupPage.setFirstName("John");
		signupPage.setLastName("Doe");
		signupPage.setEmail("john.doe@example.com");
		signupPage.setPassword("Password123");
		signupPage.setConfirmPassword("Password321");
		signupPage.clickCreateAccount();
	}

	@Then("the account should be created successfully")
	public void the_account_should_be_created_successfully() {
		homePage = new HomePage(driver);
		assert homePage.isWelcomeMessageDisplayed();
		driver.quit();
	}

	@Then("error messages should be displayed for mandatory fields")
	public void error_messages_should_be_displayed_for_mandatory_fields() {
		// Add verification for error messages
		driver.quit();
	}

	@Then("an error message should be displayed for invalid email format")
	public void an_error_message_should_be_displayed_for_invalid_email_format() {
		// Add verification for invalid email format error message
		driver.quit();
	}

	@Then("an error message should be displayed for mismatched passwords")
	public void an_error_message_should_be_displayed_for_mismatched_passwords() {
		// Add verification for mismatched passwords error message
		driver.quit();
	}
}
