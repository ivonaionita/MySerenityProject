package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class AccountDetailsPage extends PageObject {

   @FindBy (css="#account_first_name")
    private WebElementFacade firstNameField;

   @FindBy (css="#account_last_name")
   private WebElementFacade lastNameField;

   @FindBy (css="#password_current")
   private WebElementFacade currentPassField;

   @FindBy (css="#password_1")
   private WebElementFacade newPasswordField;

   @FindBy (css="#password_2")
   private  WebElementFacade confirmPasswordField;

   @FindBy (css=".woocommerce-Button ")
   private WebElementFacade saveChangesButton;

   public void setFirstNameField(String firstName){
       typeInto(firstNameField,firstName);
   }

   public void setLastNameField(String lastName){
       typeInto(lastNameField,lastName);
   }

   public void typeCurrentPassword(String password){
       typeInto(currentPassField,password);
   }

   public void typeNewPassword(String password){
       typeInto(newPasswordField,password);
   }

   public void typeInConfirmNewPassword(String password){
       typeInto(confirmPasswordField,password);
   }

   public void clickSaveChangesButton(){
       clickOn(saveChangesButton);
   }


}
