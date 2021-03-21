package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class OrdersPage extends PageObject {

    @FindBy (css=".account-orders-table td:nth-child(3)")
    private WebElementFacade orderStatus;

    @FindBy (css=".woocommerce-MyAccount-orders")
    private List<WebElementFacade> ordersTable;

    public void processingOrderStatus(){
        orderStatus.shouldContainText("Processing");
    }

    public boolean ordersTableIsDisplayed(){
        for(WebElementFacade webElementFacade:ordersTable){
            if (webElementFacade.findElement(By.cssSelector(".woocommerce-MyAccount-orders th")).isDisplayed())
             return true;
        }return false;
    }


}
