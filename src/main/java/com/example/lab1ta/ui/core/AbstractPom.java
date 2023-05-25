package com.example.lab1ta.ui.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AbstractPom {
    protected WebDriver driver;
    public AbstractPom(WebDriver driver){
        this.driver = driver;
       PageFactory.initElements(driver, this);
    }
}
