package com.nopcommerce.demo.pages;

import org.openqa.selenium.By;

public class DesktopPage extends ComputerPage {

    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {//
        selectMenu("Computers");
        Thread.sleep(3000);
        clickOnElement(By.xpath("//body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"));
        selectByValueFromDropDown(By.id("products-orderby"), "5");
        Thread.sleep(3000);
        clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]"));

    }


}
