package org.fasttrackit.features.search;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.*;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.EnvironmentConstants;
import org.junit.Test;

public class MyAccountTest extends BaseTest {
    @Steps
    private LoginSteps loginSteps;
    @Steps
    private MyAccountSteps myAccountSteps;
    @Steps
    private ShopSteps shopSteps;
    @Steps
    private CartSteps cartSteps;
    @Steps
    private PlaceOrderSteps placeOrderSteps;

    @Test
    public void changePassword(){
        loginSteps.navigateToLogin();
        loginSteps.loginWithValidCredentials("lalala@yahoo.com","Parola@1234");
        myAccountSteps.clickOnMyAccountDetails();
        myAccountSteps.completeAccountDetailsFields("ivona","ionita","Parola@1234","Paroladetest1","Paroladetest1");
        myAccountSteps.clickOnSaveChanges();
        myAccountSteps.accountDetailsMessageDisplayed();
    }

    @Test
    public void saveBillingAddress(){
       loginSteps.navigateToLogin();
        loginSteps.loginWithValidCredentials("lalala@yahoo.com","Paroladetest1");
        myAccountSteps.clickOnAddressesButton();
        myAccountSteps.clickOnEditBillingAddressLink();
        myAccountSteps.completeBillingAddressFirsName("Ana");
        myAccountSteps.completeBillingAddressLastName("Albu");
        myAccountSteps.completeBillinAddressStreetField("2");
        myAccountSteps.completeBillingAddressCityField("cluj");
        myAccountSteps.completeBillingAddressZipcodeField("123");
        myAccountSteps.completeBillingAddressPhoneField("0765430987");
        myAccountSteps.clickOnSaaveBillingAddressButton();
        myAccountSteps.verifySavedBillingAddress("Ana Albu","2","cluj","123");
    }

    @Test
    public void saveShippingAddress(){
        loginSteps.navigateToLogin();
        loginSteps.loginWithValidCredentials("lalala@yahoo.com","Paroladetest1");
        myAccountSteps.clickOnAddressesButton();
        myAccountSteps.clickOnEditShippingAddressLink();
        myAccountSteps.completeShippingAddressFirstName("Ana");
        myAccountSteps.completeShippingAddressLastName("Albu");
        myAccountSteps.completeShippingAddressStreetField("2");
        myAccountSteps.completeShippingAddressCityField("cluj");
        myAccountSteps.completeShippingAddressZipcodeField("123");
        myAccountSteps.clickOnSaveShippingAddressButton();
        myAccountSteps.verifySavedShippingAddress("Ana Albu","2","cluj","123");

    }

    @Test
    public void verifyOrderStatusInMyAccount(){
        loginSteps.navigateToLogin();
        loginSteps.loginWithValidCredentials(EnvironmentConstants.USER_EMAIL,EnvironmentConstants.USER_PASS);
        shopSteps.addProductToShoppingCart();
        shopSteps.selectViewCartButton();
        cartSteps.proceedToCheckout();
        placeOrderSteps.placeOrder();
        placeOrderSteps.confirmationOrder();
        myAccountSteps.clickOnMyAccountButton();
        myAccountSteps.clickOnOrdersButton();
        myAccountSteps.verifyOrderStatus();

    }

    @Test
    public void logoutFromMyAccountSection(){
        loginSteps.navigateToLogin();
        loginSteps.loginWithValidCredentials(EnvironmentConstants.USER_EMAIL,EnvironmentConstants.USER_PASS);
        myAccountSteps.clickOnLogoutButtonMA();
        loginSteps.verifyLoginPage();
    }

    @Test
    public void verifyRecentOrdersFromDashbord(){
        loginSteps.navigateToLogin();
        loginSteps.loginWithValidCredentials(EnvironmentConstants.USER_EMAIL,EnvironmentConstants.USER_PASS);
        myAccountSteps.clickOnRecentOrdersLink();
        myAccountSteps.verifyOrdersTable();
    }

    @Test
    public void verifySpecificOrderDetails(){
        loginSteps.navigateToLogin();
        loginSteps.loginWithValidCredentials(EnvironmentConstants.USER_EMAIL,EnvironmentConstants.USER_PASS);
        myAccountSteps.clickOnOrdersButton();
        myAccountSteps.clickOnViewButtonOrders();
        myAccountSteps.verifyOrderNumber();
        myAccountSteps.verifyOrderDate();
    }

}
