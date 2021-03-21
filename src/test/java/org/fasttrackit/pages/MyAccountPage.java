package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

 public  class MyAccountPage extends PageObject {


    @FindBy (css=".woocommerce-MyAccount-content p:nth-child(1)")
    private WebElementFacade helloMessage;

    @FindBy(css=".content-page")
    private WebElementFacade loginPage;

    @FindBy(css=".woocommerce-MyAccount-navigation li:nth-child(5)")
    private WebElementFacade accountDetailsButton;

    @FindBy (css=".woocommerce-message")
    private WebElementFacade accountDetailsMessage;

    @FindBy (css=".woocommerce-MyAccount-navigation li:nth-child(4) a")
    private WebElementFacade addressesButton;

    @FindBy(css=".woocommerce-MyAccount-navigation li:nth-child(2) a")
    private WebElementFacade ordersButton;

    @FindBy (css=".woocommerce-MyAccount-navigation li:last-child a")
    private WebElementFacade logoutButton;

    @FindBy (css="p:nth-child(2) a:first-child")
    private WebElementFacade recentOrdersLink;

    public void verifyHelloMessage() {
        helloMessage.shouldContainText("Hello");
    }

    public void loginPageDisplayed(){
        loginPage.shouldContainText("Login");
    }

    public void clickAccountDetails(){
        clickOn(accountDetailsButton);
    }

    public void accountDetailsMessageContent(){
        accountDetailsMessage.shouldContainText("Account details changed successfully.");
    }

    public void clickAddressesButton(){
        clickOn(addressesButton);
    }

    public void clickOrdersButton(){
        clickOn(ordersButton);
     }

     public void clickLogoutButton(){
        clickOn(logoutButton);
     }

     public void clickRecentOrdersLink(){
        clickOn(recentOrdersLink);
     }



}
