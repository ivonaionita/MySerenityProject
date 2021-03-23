package org.fasttrackit.steps.serenity;

import io.cucumber.java.ar.اذاً;
import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.*;

public class MyAccountSteps {

    private MyAccountPage myAccountPage;
    private AccountDetailsPage accountDetailsPage;
    private AddressesPage addressesPage;
    private BillingAddressPage billingAddressPage;
    private ShippingAddressPage shippingAddressPage;
    private HomePage homePage;
    private OrdersPage ordersPage;


    @Step
    public void clickOnMyAccountButton(){
        homePage.clickMyAccountButton();
    }

    @Step
    public void clickOnMyAccountDetails(){
        myAccountPage.clickAccountDetails();
    }

    @Step
    public void completeFirstNameFieldAD(String firstName){
        accountDetailsPage.setFirstNameField(firstName);
    }

    @Step
    public void completeLastNameFieldAD(String lastName){
        accountDetailsPage.setLastNameField(lastName);
    }

    @Step
    public void completeCurrentPassword(String password){
        accountDetailsPage.typeCurrentPassword(password);
    }

    @Step
    public void completeNewPassword(String password){
        accountDetailsPage.typeNewPassword(password);
    }

    @Step
    public void completeConfirmNewPassword(String password){
        accountDetailsPage.typeInConfirmNewPassword(password);
    }

    @Step
    public void clickOnSaveChanges(){
        accountDetailsPage.clickSaveChangesButton();
    }

    @Step
    public void completeAccountDetailsFields(String firstName, String lastName,String currentpassword, String newPassword,String confirmNewPass){
        completeFirstNameFieldAD(firstName);
        completeLastNameFieldAD(lastName);
        completeCurrentPassword(currentpassword);
        completeNewPassword(newPassword);
        completeConfirmNewPassword(confirmNewPass);
    }

    @Step
    public void accountDetailsMessageDisplayed(){
        myAccountPage.accountDetailsMessageContent();
    }

    @Step
    public void clickOnAddressesButton(){
        myAccountPage.clickAddressesButton();
    }

    @Step
    public void clickOnEditBillingAddressLink(){
        addressesPage.clickEditBillingLink();
    }

    @Step
    public void completeBillingAddressFirsName(String firstName){
        billingAddressPage.setBillingAddressFirstNameField(firstName);
    }

    @Step
    public void completeBillingAddressLastName(String lastName){
        billingAddressPage.setBillingAddressLastNameField(lastName);
    }

    @Step
    public void completeBillinAddressStreetField(String street){
        billingAddressPage.setBillingAddressStreetField(street);
    }

    @Step
    public void completeBillingAddressCityField(String city){
        billingAddressPage.setBillingAddressCityField(city);
    }

    @Step
    public void completeBillingAddressZipcodeField(String zipcode){
        billingAddressPage.setBillingAddressZipcodeField(zipcode);
    }

    @Step
    public void completeBillingAddressPhoneField(String phone){
        billingAddressPage.setBillingAddresPhoneField(phone);
    }

    @Step
    public void clickOnSaaveBillingAddressButton(){
        billingAddressPage.clickBillingAddressSaveButton();
    }

    @Step
    public void verifySavedBillingAddress(String name,String street, String city, String zipcode ){
        addressesPage.savedBillingAddress(name,street,city,zipcode);
    }

    @Step
    public void clickOnEditShippingAddressLink(){
        addressesPage.clickEditShippingAddressLink();
    }

    @Step
    public void completeShippingAddressFirstName(String firstname){
        shippingAddressPage.setShippingAddressFirstNameField(firstname);
    }

    @Step
    public void completeShippingAddressLastName(String lastname){
        shippingAddressPage.setShippingAddressLastNameField(lastname);
    }

    @Step
    public void completeShippingAddressStreetField(String street){
        shippingAddressPage.setShippingAddresStreetField(street);
    }

    @Step
    public void completeShippingAddressCityField(String city){
        shippingAddressPage.setShippingAddressCityField(city);
    }

    @Step
    public void completeShippingAddressZipcodeField(String zipcode){
        shippingAddressPage.setShippingAddressZipcodeField(zipcode);
    }

    @Step
    public void clickOnSaveShippingAddressButton(){
        shippingAddressPage.clickSaveShippingAddressBuutton();
    }

    @Step
    public void verifySavedShippingAddress(String name, String street, String city,String zipcode){
        addressesPage.savedShippingAddress(name,street,city,zipcode);
    }

    @Step
    public void clickOnOrdersButton(){
        myAccountPage.clickOrdersButton();
    }

    @Step
    public void verifyOrderStatus(){
        ordersPage.processingOrderStatus();
    }

    @Step
    public void clickOnLogoutButtonMA(){
        myAccountPage.clickLogoutButton();
    }

    @Step
    public void clickOnRecentOrdersLink(){
        myAccountPage.clickRecentOrdersLink();
    }

    @Step
    public void verifyOrdersTable(){
        ordersPage.ordersTableIsDisplayed();
    }

    @Step
    public void clickOnViewButtonOrders(){
        ordersPage.clickViewButton();
    }

    @Step
    public void verifyOrderNumber(){
       ordersPage.orderNumberMatches();
    }

    @Step
    public void verifyOrderDate(){
        ordersPage.orderDateMatches();
    }



}
