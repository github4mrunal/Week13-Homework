package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class ComputerPageTest extends TestBase {
    ComputerPage ComputersPage = new ComputerPage();
  @Test
  public void clickAndSortByZtoA() throws InterruptedException {
      ComputersPage.verifyProductArrangeInAlphaBaticalOrder();
  }
}
