package com.example.lab1ta.ui.pom;

import com.example.lab1ta.ui.core.AbstractPom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BookStorePage extends AbstractPom {
    @FindBy(xpath = "//div[@class='rt-tr-group']//a[@href]")
    public List<WebElement> booksList;
    @FindBy(xpath = "//div[@id='title-wrapper']/div[2]")
    public WebElement titleLable;
    @FindBy(xpath = "//div[@id='ISBN-wrapper']/div[2]")
    public WebElement isbnLable;

    public BookStorePage(WebDriver driver) {
        super(driver);
    }

    public int getBooksSize() {
        return booksList.size();
    }

    public void clickOnBookByIsbn(String isbn) {
        WebElement bookElement = driver.findElement(By.xpath("//a[contains(@href,'" + isbn + "')]"));
        bookElement.click();

    }

    public String getTitle() {
        return titleLable.getText();
    }

    public String getIsbn() {
        return isbnLable.getText();
    }
}
