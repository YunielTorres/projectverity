package br.com.verity.utils;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class PageBase {

    public Boolean elementoEnabledViaTextoByXpath(String titulo){
        return Driver.getCurrentDriver().findElement(By.xpath(".//*[contains(text(),'"+titulo+"')]")).isEnabled();
    }

    public WebElement elementoViaByXpath(String xpath){
        return Driver.getCurrentDriver().findElement(By.xpath(xpath));
    }

    public void clicarViaJSXpath(String xpath){
        WebElement elementCheck = Driver.getCurrentDriver().findElement(By.xpath(xpath));
        JavascriptExecutor js = (JavascriptExecutor) Driver.getCurrentDriver();
        js.executeScript("arguments[0].click()",elementCheck);
    }
}

