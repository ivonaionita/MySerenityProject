package org.fasttrackit.features.search;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.CartSteps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.fasttrackit.steps.serenity.PlaceOrderSteps;
import org.fasttrackit.steps.serenity.ShopSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.EnvironmentConstants;
import org.junit.Test;

import java.util.Base64;

public class PlaceOrderTest extends BaseTest{
    @Steps
    private LoginSteps loginSteps;
    @Steps
    private ShopSteps shopSteps;
    @Steps
    private CartSteps cartSteps;
    @Steps
    private PlaceOrderSteps placeOrderSteps;

    @Test
    public void placeAnOrderWithoutAccount(){
        shopSteps.addProductToShoppingCart();
        shopSteps.selectViewCartButton();
        cartSteps.proceedToCheckout();
        placeOrderSteps.completeBillingInfo("abc","ds","asa","asasa","1234","0745567432","asd@yahoo.com");
        placeOrderSteps.placeOrder();
        placeOrderSteps.confirmationOrder();
    }

   @Test
    public void placeAnOrderLoggedIn(){
        loginSteps.navigateToLogin();
        loginSteps.loginWithValidCredentials(EnvironmentConstants.USER_EMAIL,EnvironmentConstants.USER_PASS);
        shopSteps.openShopPage();
        shopSteps.addToCartFirstProduct();
        shopSteps.selectViewCartButton();
        cartSteps.proceedToCheckout();
        placeOrderSteps.placeOrder();
        placeOrderSteps.confirmationOrder();
    }

}
