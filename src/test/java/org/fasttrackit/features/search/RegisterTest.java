package org.fasttrackit.features.search;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.RegisterSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.EnvironmentConstants;
import org.junit.Test;
import org.springframework.core.env.Environment;

public class RegisterTest extends BaseTest {
    @Steps
    private RegisterSteps registerSteps;

    @Test
    public void registerWithValidCredentials() {
        registerSteps.navigateToRegister();
        registerSteps.setRegEmailField("testemail1@yahoo.com");
        registerSteps.setRegPasswordField("Parolaestenoua@1234567");
        registerSteps.proceedToRegister();
        registerSteps.verifyRegisterMessage();

   }

    @Test
    public void registerWithWeakPassword(){
        registerSteps.navigateToRegister();
        registerSteps.setRegEmailField("11@yahoo.com");
        registerSteps.setRegPasswordField("Parola");
        registerSteps.verifyPassStrength();

    }

    @Test
    public void registerWithAlreadyExistingEmail(){
        registerSteps.navigateToRegister();
        registerSteps.setRegEmailField(EnvironmentConstants.USER_EMAIL);
        registerSteps.setRegPasswordField(EnvironmentConstants.USER_PASS);
        registerSteps.proceedToRegister();
        registerSteps.verifyAlreadyExistingEmailMessage();
    }





}
