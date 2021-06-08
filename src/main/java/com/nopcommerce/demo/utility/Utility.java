package com.nopcommerce.demo.utility;

import com.nopcommerce.demo.basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility extends BasePage{

    /**
     * This method will click on element
     *
     * @param by
     */
    public void clickOnElement(By by) {
        driver.findElement(by).click();

    }

    /**
     *
     * @param element
     */
    public void clickOnElement(WebElement element){
        element.click();
    }

    /**
     * This method will get text from element
     *
     * @param by
     * @return
     */
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();


    }
    public String getTextFromElement(WebElement element){
        return element.getText();

    }

    /**
     * This method will send text to/on Element
     *
     * @param by
     * @param text
     */
    public void sendTextToElement(By by, String text) {

        driver.findElement(by).sendKeys(text);
    }

    /**
     * This method will select by value from dropdown
     *
     * @param by
     * @param value
     */
    public void selectByValueFromDropDown(By by, String value) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);

    }

    /**
     *
     */
    public WebElement waitUntilVisibilityOfElementLocated(By by, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return element;
    }
    public void selectByVisibleTextFromDropDown(By by ,String text){
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
}

