package com.pflb.learning;

import com.pflb.learning.pages.AbstractPage;
import com.pflb.learning.pages.YandexMainPage;
import com.pflb.learning.utils.DriverManager;
import org.junit.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by vika on 24.11.2017.
 */
public class YandexMainPageTest {


   @Test
    public void successGoToNotebooks(){
        YandexMainPage yandexMainPage = new YandexMainPage();
        yandexMainPage.loadPage();
        yandexMainPage.goToNotebooks();
    }

    /*@AfterClass //Аннотация Junit. Говорит, что метод должен запускаться каждый раз после всех тестов
    public static void tearDown() {
        DriverManager.getDriver().quit();
    }*/
}
