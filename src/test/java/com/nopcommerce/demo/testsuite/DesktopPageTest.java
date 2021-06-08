package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.DesktopPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class DesktopPageTest extends TestBase {
     DesktopPage AddToShoppingcartpage = new DesktopPage();

     @Test
    public void clickOnDesktopAndSortByAtoZ() throws InterruptedException {
         AddToShoppingcartpage.verifyProductAddedToShoppingCartSuccessFully();

     }
}
