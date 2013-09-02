package com.cuke.pages;


import com.cuke.WebDriverSingleton;
import org.openqa.selenium.WebDriver;

public class BasePage {

    public WebDriver getDriver() {
        return WebDriverSingleton.getInstance();
    }

    public boolean browserOpen() {
        return !WebDriverSingleton.getInstance().getWindowHandle().isEmpty();
    }  
}
