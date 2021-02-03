package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.ProductsPage;

 public class ProductSteps {

    private HomePage homePage;
    private ProductsPage productsPage;

    @Step
    public void selectProduct(){
        homePage.open();
        homePage.clickProductCategory();
        productsPage.selectProduct();
    }
}
