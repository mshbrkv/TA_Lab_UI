package com.example.lab1ta.ui.pom;

import com.example.lab1ta.ui.core.BaseTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;

import static org.testng.Assert.assertEquals;

class RegisterPageTest extends BaseTest {

    @Value("${user.trueUsername}")
    private String trueUsername;
    @Value("${user.truePassword}")
    private String truePassword;
    @Value("${user.falseUsername}")
    private String baseUrl;
    @Value("${register.url}")
    private String url;

    @Test
    public void registerUser() throws InterruptedException {
        RegisterPage registerPage = new RegisterPage(driver);
        driver.get(baseUrl + url);
        registerPage.sendUserRegisterInfo("Maria", "Biriucova", trueUsername, truePassword);
        registerPage.ValidateCaptcha();
        registerPage.registerUser();
        assertEquals(registerPage.getErrorMessage(), "User exists!");
    }

}