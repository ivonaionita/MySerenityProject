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

    @FindBy(css=".woocommerce-orders-table td:nth-child(5) a")
    private WebElementFacade viewButton;

    @FindBy(css=".woocommerce-MyAccount-content td:first-child a")
    private WebElementFacade orderNumber;

    @FindBy(css=".woocommerce-MyAccount-content td:nth-child(2)")
    private WebElementFacade orderDate;



    public void processingOrderStatus(){
        orderStatus.shouldContainText("Processing");
    }

    public boolean ordersTableIsDisplayed(){
        for(WebElementFacade webElementFacade:ordersTable){
            if (webElementFacade.findElement(By.cssSelector(".woocommerce-MyAccount-orders th")).isDisplayed())
             return true;
        }return false;
    }

    public void clickViewButton(){
        clickOn(viewButton);
    }

    public void orderNumberMatches(){
        orderNumber.getText().equals(find(By.cssSelector(".order-number")).getText());
    }

    public void orderDateMatches(){
        orderDate.getText().equals(find(By.cssSelector(".order-date")).getText());
    }


}
