package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://qa5.fasttrackit.org:8008/")
public class HomePage extends PageObject {

   @FindBy (css = ".login-woocommerce")
    WebElementFacade loginLink;

   public void clickLoginLink(){
       clickOn(loginLink);
   }

}
