package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.steps.serenity.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CheckoutTest {

    @Managed
    WebDriver webDriver;
    @Steps
    private LoginSteps loginSteps;
    @Steps
    private HomePage homePage;
    @Steps
    private ProductSteps productSteps;
    @Steps
    private ProductDescriptionSteps productDescriptionSteps;
    @Steps
    private CartSteps cartSteps;
    @Steps
    private BillingInfoSteps billingInfoSteps;

    @Test

    public void proceedToCheckOut() {
        loginSteps.loginUser("ivona930@gmail.com", "123456");
        cartSteps.proceedToCheckout();

    }

     @Test
        public void completeBillingInfo(){
            loginSteps.loginUser("ivona930@gmail.com","123456");
            cartSteps.proceedToCheckout();
            billingInfoSteps.continueToCheckout();
        }


    }


