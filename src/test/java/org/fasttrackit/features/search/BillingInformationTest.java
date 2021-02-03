package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.CartSteps;
import org.fasttrackit.steps.serenity.CheckoutSteps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class BillingInformationTest {
    @Managed
    WebDriver webDriver;
    @Steps
    private CheckoutSteps checkoutSteps;
    @Steps
    private LoginSteps loginSteps;
    @Steps
    private CartSteps cartSteps;


    @Test
    public void completeBillingInfo(){
        loginSteps.loginUser("ivona930@gmail.com","123456");
        cartSteps.proceedToCheckout();
        checkoutSteps.continueToCheckout();
    }


}
