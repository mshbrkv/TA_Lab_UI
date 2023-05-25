package com.example.lab1ta.ui.pom;

import com.example.lab1ta.ui.core.AbstractPom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends AbstractPom {
    @FindBy(xpath = "//label[@id = 'userName-value']")
    public WebElement usernameLabel;

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    public String getUsername() {
        return usernameLabel.getText();
    }
}
