package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class CartPage extends PageObject {

    @FindBy (css = ".woocommerce td:nth-child(3)")
    private WebElementFacade productName;
    @FindBy (css=".product-remove .remove")
    private WebElementFacade removeButton;
    @FindBy(css=".woocommerce-message ")
    private WebElementFacade removedMessage;
    @FindBy(css=".wc-proceed-to-checkout .button")
    private WebElementFacade proceedToCheckoutButton;
    @FindBy (css=".cart-empty")
    private WebElementFacade emptyCartContentMessage;
    @FindBy (css=".return-to-shop a")
    private WebElementFacade returnToShopButton;




    public void isProductInCart(String product){
           productName.shouldContainText(product);
    }

    public void clickRemoveButton(){
        clickOn(removeButton);
    }

    public void removedMessageDisplayed(){
        removedMessage.shouldContainText("removed");
    }

    public void clickProceedToCheckoutButton(){
        clickOn(proceedToCheckoutButton);
    }

    public void emptyCartContentMessageDisplayed(){
        emptyCartContentMessage.shouldContainText("Your cart is currently empty.");
    }

    public void clickReturnToShopButton(){
        clickOn(returnToShopButton);
    }

}
