package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage {
	WebDriver driver;

	By firstName = By.id("firstname");
	By lastName = By.id("lastname");
	By email = By.id("email_address");
	By password = By.id("password");
	By confirmPassword = By.id("password-confirmation");
	By createAccountButton = By.xpath("//button[@title='Create an Account']");

	public SignupPage(WebDriver driver) {
		this.driver = driver;
	}

	public void setFirstName(String fName) {
		driver.findElement(firstName).sendKeys(fName);
	}

	public void setLastName(String lName) {
		driver.findElement(lastName).sendKeys(lName);
	}

	public void setEmail(String emailAddress) {
		driver.findElement(email).sendKeys(emailAddress);
	}

	public void setPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}

	public void setConfirmPassword(String confirmPwd) {
		driver.findElement(confirmPassword).sendKeys(confirmPwd);
	}

	public void clickCreateAccount() {
		driver.findElement(createAccountButton).click();
	}
}
