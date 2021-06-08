package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.BuildYourOwnComputer;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.Test;

import java.util.concurrent.Callable;

public class BuildYourOwnComputerTest extends TestBase {
    ComputerPage ComputersPage = new ComputerPage();
    DesktopPage AddToShoppingcartpage = new DesktopPage();
    BuildYourOwnComputer computer = new BuildYourOwnComputer();

    @Test
    public void verifyAllComponentsAreSelectedToBuildAComputer() throws InterruptedException {
        ComputersPage.verifyProductArrangeInAlphaBaticalOrder();
        AddToShoppingcartpage.verifyProductAddedToShoppingCartSuccessFully();
        computer.verifyAllComponentAreSelected();

    }
}
