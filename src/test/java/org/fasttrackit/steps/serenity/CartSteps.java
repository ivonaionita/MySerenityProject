package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.ProductDescriptionPage;
import org.fasttrackit.pages.ProductsPage;

public class CartSteps {
    private CartPage cartpage;
    private HomePage homePage;
    private ProductsPage productsPage;
    private ProductDescriptionPage productDescriptionPage;

    @Step
    public void proceedToCheckout(){
        homePage.open();
        homePage.clickProductCategory();
        productsPage.selectProduct();
        productDescriptionPage.selectProductColor();
        productDescriptionPage.selectproductSize();
        productDescriptionPage.clickAddToCartButton();
        cartpage.clickCheckoutButton();
    }

}
