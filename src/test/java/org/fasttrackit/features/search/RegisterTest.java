package org.fasttrackit.features.search;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.RegisterSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class RegisterTest extends BaseTest {
    @Steps
    private RegisterSteps registerSteps;

    @Test
    public void registerWithValidCredentials() {

        registerSteps.navigateToRegister();
        registerSteps.setRegEmailField("bcdef@yahoo.com");
        registerSteps.setRegPasswordField("@1234567890As");
        registerSteps.proceedToRegister();
        registerSteps.verifyRegisterMessage();


    }
}
