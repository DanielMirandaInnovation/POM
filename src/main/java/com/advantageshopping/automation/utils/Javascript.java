package com.advantageshopping.automation.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Javascript {

    public static JavascriptExecutor executor;

    public static void clickJS(WebDriver driver, By by) {
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", driver.findElement(by));
    }

    public static void scroll(WebDriver driver, By by) {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        executor.executeScript("arguments[0].scrollIntoView(true);", new Object[]{driver.findElement(by)});
    }
}
