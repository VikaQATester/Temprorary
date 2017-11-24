package com.pflb.learning.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

/**
 * Created by vika on 24.11.2017.
 */
public class YandexMainPage extends AbstractPage {
    @FindBy(xpath = "//a[text()='Компьютеры']") //найти по xpath
    private WebElement computers;

    private static final String url = "https://yandex.ru/";

    public YandexMainPage loadPage(){
        //driver = new ChromeDriver();
        driver.navigate().to(url);
        return this;
    }

    public void goToNotebooks(){
        computers.click();
    }

}
