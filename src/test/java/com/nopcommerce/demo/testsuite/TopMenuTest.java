package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.Homepage;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TopMenuTest extends TestBase {
    Homepage homepage = new Homepage();

    @Test
    public void  verifyPageNavigation(){
    homepage.selectMenu("Computers");
    }

}





