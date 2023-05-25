package com.example.lab1ta.ui.pom;

import com.example.lab1ta.ui.core.BaseTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;

import static org.testng.Assert.assertEquals;

class LoginPageTest extends BaseTest {
    @Value("${user.trueUsername}")
    private String trueUsername;
    @Value("${user.truePassword}")
    private String truePassword;
    @Value("${user.falseUsername}")
    private String baseUrl;
    @Value("${login.url}")
    private String url;

    @Test
    public void loginUser() {
        LoginPage loginPage = new LoginPage(driver);
        driver.get(baseUrl + url);
        loginPage.loginUser(trueUsername, truePassword);

        ProfilePage profilePage = new ProfilePage(driver);
        assertEquals(profilePage.getUsername(), trueUsername);
    }
}