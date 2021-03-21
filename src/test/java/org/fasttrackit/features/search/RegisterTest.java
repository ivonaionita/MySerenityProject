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
        registerSteps.setRegEmailField("testemail@yahoo.com");
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





}
