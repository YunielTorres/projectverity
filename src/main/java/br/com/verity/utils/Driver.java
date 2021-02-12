package br.com.verity.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Driver {

    private static WebDriverWait wait;
    private static WebDriver driver;


    public static WebDriver getCurrentDriver() {
        if(driver == null) {
            System.setProperty("webdriver.chrome.driver", "/Users/Yuniel/Documents/AUTOMACAO/Verity/driver/chromedriver");
            driver = new ChromeDriver();
            wait = new WebDriverWait(driver, 10);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        return driver;
    }
    public static void close(){
        getCurrentDriver().quit();
        driver = null;
    }
    public static void loadPage(String url){
        getCurrentDriver().get(url);
    }
}
