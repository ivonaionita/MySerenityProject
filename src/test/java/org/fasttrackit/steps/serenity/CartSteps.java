package org.fasttrackit.steps.serenity;

import io.cucumber.java.hi.तथा;
import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.ProductPage;

public class CartSteps {

    private CartPage cartPage;
    private HomePage homePage;
    private ProductPage productPage;

    @Step
    public void isProductInCart(String product){
        cartPage.isProductInCart(product);

    }

    @Step
    public void removeProductFromCart(){
        cartPage.clickRemoveButton();
    }

    @Step
    public void removedSuccessfully(){
        cartPage.removedMessageDisplayed();
    }

    @Step
    public void proceedToCheckout(){
        cartPage.clickProceedToCheckoutButton();
    }

    @Step
    public void verifyEmptyContetMessage(){
        cartPage.emptyCartContentMessageDisplayed();
    }

    @Step
    public void clickOnCartCategory(){
        homePage.clickCartButton();
    }

    @Step
    public void clickOnReturnToShopButton(){
        cartPage.clickReturnToShopButton();
    }

    @Step
    public void clearQuantityField(){
        cartPage.eraseQuantityField();
    }

    @Step
    public void completeValueInQuantityField(String qty){
        cartPage.typeValueInQuantityField(qty);
    }

    @Step
    public void clickOnUpdateCart(){
        cartPage.clickUpdateCartButton();
    }

    @Step
    public void verifyUpdateCartMessage(){
        cartPage.checkUpdateCartMessage();
    }

    @Step
    public void completeCuponeField(String coupon){
        cartPage.typeCouponCode(coupon);
    }

    @Step
    public void clickOnApplyCoupon(){
        cartPage.clickApplyCoupon();
    }

    @Step
    public void verifyCoupon(String coupon){
        cartPage.verifyInexistentCouponAlert(coupon);
    }

    @Step
    public void isCartProductListDisplayed(){
        cartPage.cartProductsListDisplayed();
    }

    @Step
    public void clickOnProductLinkInCart(){
        cartPage.clickProductLinkInCart();
    }

    @Step
    public void checkProductLink(){
       productPage.verifyProductTitlePageWithProductLinkInCart();
    }

}
