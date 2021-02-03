package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.ProductDescriptionPage;
import org.fasttrackit.pages.ProductsPage;
import org.fasttrackit.steps.serenity.ProductDescriptionSteps;
import org.fasttrackit.steps.serenity.ProductSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class ProductsTest {
   @Managed
    private WebDriver webDriver;
   @Steps
   private ProductDescriptionSteps productDescriptionSteps;
   @Steps
   private ProductSteps productsSteps;
   @Steps
   private ProductDescriptionPage productDescriptionPagesPage;

   @Test
    public void addProductToCart(){
      // productDescriptionSteps.addToCartProduct();

        productsSteps.selectProduct();
        productDescriptionSteps.selectProductSize();
        productDescriptionSteps.selectProductColor();
        productDescriptionPagesPage.clickAddToCartButton();
   }


}
