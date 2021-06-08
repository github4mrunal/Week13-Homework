package com.nopcommerce.demo.pages;

import org.openqa.selenium.By;
import org.testng.Assert;

public class BuildYourOwnComputer extends DesktopPage {

    public void verifyAllComponentAreSelected() throws InterruptedException {
        Thread.sleep(2000);
        String expectedPagetext = "Build your own computer";  //verify build your own  computer page
        String actualPageText = getTextFromElement(By.xpath("//h1[contains(text(),'Build your own computer')]"));
        Assert.assertEquals(expectedPagetext, actualPageText);
        selectByVisibleTextFromDropDown(By.id("product_attribute_1"), "2.2 GHz Intel Pentium Dual-Core E2200"); //select 2.2 intel from drop down on build on my computer page
        selectByVisibleTextFromDropDown(By.id("product_attribute_2"), "8GB [+$60.00]");//select 8 gb from dropdown on computerpage
        clickOnElement(By.id("product_attribute_3_7"));  //select 400 gb radio button
        clickOnElement(By.id("product_attribute_4_9")); //select vista premium radio button
        clickOnElement(By.id("product_attribute_5_12"));//select commander radio button
        Thread.sleep(2000);
        String expectedtotal = "$1,475.00";          //Verifying Total via Assert
        String actualTotal = getTextFromElement(By.xpath("//span[text()='$1,475.00']"));
        Assert.assertEquals(expectedtotal, actualTotal);
        clickOnElement(By.id("add-to-cart-button-1"));  //click on add to cart
        String expectedBarMessage = "The product has been added to your shopping cart";
        String actualBarMessage = getTextFromElement(By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]"));
        Assert.assertEquals(expectedBarMessage, actualBarMessage);


    }

}
