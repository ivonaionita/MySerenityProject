package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.HomePage;

public class CartSteps {

    private CartPage cartPage;
    private HomePage homePage;

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


}
