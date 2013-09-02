package com.cuke.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

    public void open() {
         getDriver().get("http://www.google.com");
    }

    public void searchFor(String searchString) {
        WebElement q = getDriver().findElement(By.name("q"));
        q.sendKeys(searchString);
        q.submit();
    }

}
