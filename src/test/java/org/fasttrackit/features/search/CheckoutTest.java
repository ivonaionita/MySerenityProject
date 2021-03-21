package org.fasttrackit.features.search;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.CartSteps;
import org.fasttrackit.steps.serenity.CheckoutSteps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.fasttrackit.steps.serenity.MyAccountSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.EnvironmentConstants;
import org.junit.Test;

public class CheckoutTest extends BaseTest {
    @Steps
    private CheckoutSteps checkoutSteps;
    @Steps
    private LoginSteps loginSteps;
    @Steps
    private MyAccountSteps myAccountSteps;
    @Steps
    private CartSteps cartSteps;

    @Test
    public void checkoutWithEmptyCartAsUser(){
        loginSteps.navigateToLogin();
        loginSteps.loginWithValidCredentials(EnvironmentConstants.USER_EMAIL,EnvironmentConstants.USER_PASS);
        checkoutSteps.clickonCheckoutButton();
        cartSteps.verifyEmptyContetMessage();
    }

}
