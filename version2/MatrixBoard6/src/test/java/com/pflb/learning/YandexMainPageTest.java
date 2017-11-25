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

    @BeforeClass//Аннотация Junit. Говорит, что метод должен запускаться каждый раз после создания экземпляра класса, перед всеми тестами
    public static void setUp() {
        //Устанавливаем System Property, чтобы наше приложени смогло найти драйвер
        //System.setProperty("webdriver.gecko.driver", "C:\\projects\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
    }

   @Test
    public void successGoToNotebooks(){
        YandexMainPage yandexMainPage = new YandexMainPage();
        yandexMainPage.loadPage();
       // yandexMainPage.goToNotebooks();
    }

    /*@AfterClass //Аннотация Junit. Говорит, что метод должен запускаться каждый раз после всех тестов
    public static void tearDown() {
        DriverManager.getDriver().quit();
    }*/
}
