package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    By welcomeMessage = By.xpath("//div[@class='welcome-msg']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isWelcomeMessageDisplayed() {
        return driver.findElement(welcomeMessage).isDisplayed();
    }
}
