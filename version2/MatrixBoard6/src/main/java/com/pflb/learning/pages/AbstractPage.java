package com.pflb.learning.pages;

import com.pflb.learning.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Абстрактный класс, родитель всех Page'ей
 * Сделан для того, чтобы все Page'и наследовали конструктор и поле с драйвером
 */
public abstract class AbstractPage {
    protected WebDriver driver; //Поле, где будет храниться драйвер

    /**
     * Дефолтный конструктор. Тут сразу получаем драйвер для взаимодействия с ним
     * А так же инициализируем элементы на Page'ах, которые были заданы с помощью аннотаций @FindBy
     */
    public AbstractPage() {
        //System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
        driver = DriverManager.getDriver();
        //driver = new ChromeDriver();
        PageFactory.initElements(driver, this);
    }


}
