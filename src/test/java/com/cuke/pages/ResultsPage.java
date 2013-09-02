package com.cuke.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResultsPage extends BasePage {

    public boolean resultExists(String url) {
        WebElement myDynamicElement = (new WebDriverWait(getDriver(), 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("resultStats")));

        List<WebElement> findElements = getDriver().findElements(By.xpath("//*[@id='rso']//h3/a"));

        for (WebElement webElement : findElements) {
            if (webElement.getAttribute("href").contains(url)) {
                return true;
            }
        }
        return false;
    }
}
