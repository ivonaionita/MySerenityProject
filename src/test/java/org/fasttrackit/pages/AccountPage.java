package org.fasttrackit.pages;


import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class AccountPage {

   @FindBy (css = ".hello strong")
    WebElementFacade helloMsg;

   public void verifiyHelloMsg(String userName){

       helloMsg.shouldContainText("Hello"+ userName);
   }

}
