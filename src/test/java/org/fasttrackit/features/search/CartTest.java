package org.fasttrackit.features.search;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.CartSteps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.fasttrackit.steps.serenity.ShopSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.EnvironmentConstants;
import org.junit.Test;


public class CartTest extends BaseTest {

    @Steps
    private CartSteps cartSteps;
    @Steps
    private ShopSteps shopSteps;
    @Steps
    private LoginSteps loginSteps;

    @Test
    public void removeProductFromCart(){
        shopSteps.navigateToShopPage();
        shopSteps.addToCartFirstProduct();
        shopSteps.selectViewCartButton();
        cartSteps.removeProductFromCart();
        cartSteps.removedSuccessfully();
    }

    @Test
    public void productsStayInCartAfterLogout(){
        loginSteps.navigateToLogin();
        loginSteps.loginWithValidCredentials(EnvironmentConstants.USER_EMAIL,EnvironmentConstants.USER_PASS);
        shopSteps.openShopPage();
        shopSteps.addToCartFirstProduct();
        loginSteps.clickOnLogoutButton();
        loginSteps.clickLogin();
        loginSteps.loginWithValidCredentials(EnvironmentConstants.USER_EMAIL,EnvironmentConstants.USER_PASS);
        shopSteps.selectViewCartButton();
        cartSteps.isProductInCart("Album");

    }

    @Test
    public void returnToShopFromEmptyCart(){
        loginSteps.navigateToLogin();
        loginSteps.loginWithValidCredentials(EnvironmentConstants.USER_EMAIL,EnvironmentConstants.USER_PASS);
        cartSteps.clickOnCartCategory();
        cartSteps.clickOnReturnToShopButton();
        shopSteps.isShopPageTitleDisplayed();
    }

}
