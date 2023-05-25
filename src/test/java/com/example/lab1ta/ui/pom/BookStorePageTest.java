package com.example.lab1ta.ui.pom;

import com.example.lab1ta.ui.core.BaseTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;

import static org.testng.Assert.assertEquals;

public class BookStorePageTest extends BaseTest {
    @Value("${url.base}")
    private String baseUrl;
    @Value("${bookstore.url}")
    private String url;
    @Value("${book.isbn}")
    private String isbn;


    @Test
    public void getBooksSize() {
        final BookStorePage bookStorePage = new BookStorePage(driver);
        driver.get(baseUrl + url);
        assertEquals(bookStorePage.getBooksSize(), 8);
    }

    @Test
    public void getTitle() {
        final BookStorePage bookStorePage = new BookStorePage(driver);
        driver.get(baseUrl + url);
        bookStorePage.clickOnBookByIsbn(isbn);
        assertEquals(bookStorePage.getTitle(), "Git Pocket Guide");
    }

    @Test
    public void getIsbn() {
        final BookStorePage bookStorePage = new BookStorePage(driver);
        driver.get(baseUrl + url);
        bookStorePage.clickOnBookByIsbn(isbn);
        assertEquals(bookStorePage.getIsbn(), isbn);
    }

}