package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;

    // Locators
    private By userIdField = By.xpath("//input[@placeholder='Enter your User ID']");
    private By passwordField = By.xpath("//input[@placeholder='Enter your Password']");
    private By loginButton = By.xpath("//button[contains(text(),'Log In')]");
    private By passwordToggle = By.xpath("//button[contains(@class,'MuiButtonBase-root')]");
    private By errorMessage = By.xpath("//p[contains(text(),'Invalid')]");

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void enterUserId(String userId) {
        driver.findElement(userIdField).clear();
        driver.findElement(userIdField).sendKeys(userId);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public boolean isLoginButtonEnabled() {
        return driver.findElement(loginButton).isEnabled();
    }

    public void togglePasswordVisibility() {
        driver.findElement(passwordToggle).click();
    }

    public String getErrorMessage() {
        WebElement error = driver.findElement(errorMessage);
        return error.isDisplayed() ? error.getText() : "";
    }
}
