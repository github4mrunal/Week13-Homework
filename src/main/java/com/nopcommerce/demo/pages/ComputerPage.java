package com.nopcommerce.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputerPage extends Homepage {
    public void verifyProductArrangeInAlphaBaticalOrder() throws InterruptedException {
        selectMenu("Computers");
        Thread.sleep(3000);
        clickOnElement(By.xpath("//div[@class='item-grid']/div/div//a[text()=' Desktops ']"));
       selectByValueFromDropDown(By.id( "products-orderby" ),"5" );
        List<WebElement> deskTopList = driver.findElements(By.xpath("//div[@class='item-grid']/div/div/div[2]/child::h2"));
        List<String> productName = new ArrayList<>();
        for (WebElement deskTop : deskTopList){
            productName.add(deskTop.getText());
        }

        List<String> tempList = new ArrayList<>();
        tempList.addAll(productName);

        Collections.sort(tempList,Collections.reverseOrder());
        Collections.sort( productName,Collections.reverseOrder());
        System.out.println(productName);
        System.out.println(tempList);
        Assert.assertEquals( productName,tempList );



    }

}
