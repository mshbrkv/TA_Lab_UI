package com.example.lab1ta.ui.pom;

import com.example.lab1ta.ui.core.AbstractPom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPom {


    @FindBy(xpath = "//input[@id='userName']")
    public WebElement usernameInput;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordInput;
    @FindBy(xpath = "//button[@id='login']")
    public WebElement loginBtn;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void loginUser(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }

}
