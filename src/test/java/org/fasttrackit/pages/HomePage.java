package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://qa5.fasttrackit.org:8008/")
public class HomePage extends PageObject {

   @FindBy (css = ".login-woocommerce")
   private WebElementFacade loginLink;

   @FindBy(id = "menu-item-73")
   private WebElementFacade shopCategory;

   @FindBy(css=".view-cart")
   private WebElementFacade cartButton;

   @FindBy (css=".searchform [type=\"text\"]")
   private WebElementFacade searchbar;

   @FindBy (css=".search-form [type=\"submit\"]")
   private WebElementFacade searchButton;

   @FindBy (css=".logout")
   private  WebElementFacade logoutButton;

   @FindBy (css = "#menu-item-70")
   private WebElementFacade myAccountCategory;

   @FindBy (css="#menu-item-71")
   private WebElementFacade checkoutCategory;

   @FindBy (css="#menu-item-72")
   private WebElementFacade cartCategory;

   public void clickLoginLink() {
       clickOn(loginLink);
   }

   public void clickShopButton(){
       clickOn(shopCategory);
   }

   public void clickCartButton(){
       clickOn(cartButton);
   }

   public void typeSearchText(String text){
       typeInto(searchbar,text);
   }

   public void clickSearchButton(){
       clickOn(searchButton);
   }

   public void clickLogout(){
       clickOn(logoutButton);
   }

   public void clickMyAccountButton(){
       clickOn(myAccountCategory);
   }

   public void clickCheckoutButton(){
       clickOn(checkoutCategory);
   }
}
