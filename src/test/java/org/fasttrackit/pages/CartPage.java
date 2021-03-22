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
    @FindBy(css=".quantity .input-text")
    private WebElementFacade quantityField;
    @FindBy(css="button[name=\"update_cart\"]")
    private WebElementFacade updateCartButton;
    @FindBy(css=".woocommerce-message[role=\"alert\"]")
    private WebElementFacade cartUpdateMessage;
    @FindBy(css="#coupon_code")
    private WebElementFacade couponField;
    @FindBy(css=".coupon input:last-child")
    private WebElementFacade applyCoupon;
    @FindBy(css=".woocommerce-error[role=\"alert\"]")
    private WebElementFacade inexistentCouponAlert;




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

    public void eraseQuantityField(){
        typeInto(quantityField,"0");
    }

    public void typeValueInQuantityField(String value){
        typeInto(quantityField,value);
    }

    public void clickUpdateCartButton(){
        clickOn(updateCartButton);
    }

    public void checkUpdateCartMessage(){
        cartUpdateMessage.shouldContainText("Cart updated.");
    }

    public void typeCouponCode(String coupon){
        typeInto(couponField,coupon);
    }

    public void clickApplyCoupon(){
        clickOn(applyCoupon);
    }

    public void verifyInexistentCouponAlert(String coupon){
        inexistentCouponAlert.shouldContainText("Coupon  "+coupon+" does not exist!");
    }

}
