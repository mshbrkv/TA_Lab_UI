package com.example.lab1ta.ui.pom;

import com.example.lab1ta.ui.core.AbstractPom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static java.lang.Thread.sleep;

public class RegisterPage extends AbstractPom {

    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement firstNameInput;
    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement lastNameInput;
    @FindBy(xpath = "//input[@id='userName']")
    public WebElement userNameInput;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordInput;
    @FindBy(xpath = "//button[@id='register']")
    public WebElement registerBtn;
    @FindBy(xpath = "//*[@id='recaptcha-anchor']/div[1]")
    public WebElement captchaSelect;
    @FindBy(xpath = "//div/p[@id='name']")
    public WebElement errorP;
    @FindBy(xpath = "//iframe[@title='reCAPTCHA']")
    WebElement iframe;

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void sendUserRegisterInfo(String firstname, String lastname, String username, String password) {
        firstNameInput.sendKeys(firstname);
        lastNameInput.sendKeys(lastname);
        userNameInput.sendKeys(username);
        passwordInput.sendKeys(password);
    }

    public void ValidateCaptcha() throws InterruptedException {
        driver.switchTo().frame(iframe);
        captchaSelect.click();
        sleep(10000);
        driver.switchTo().defaultContent();
    }

    public void registerUser() {
        registerBtn.click();
    }

    public String getErrorMessage() {
        return errorP.getText();
    }
}

