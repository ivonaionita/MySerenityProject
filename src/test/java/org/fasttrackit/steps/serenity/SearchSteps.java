package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.SearchResultPage;

public class SearchSteps {

    private HomePage homePage;
    private SearchResultPage searchResultPage;

    @Step
    public void completeSearchBar(String text){
        homePage.open();
        homePage.typeSearchText(text);
    }

    @Step
    public void enterSearch(){
        homePage.clickSearchButton();
    }

    @Step
    public void searchProduct(String product){
        completeSearchBar(product);
        enterSearch();
    }

    @Step
    public void searchMessageDisplayed(){
        searchResultPage.searchMessageisDisplayed();

    }

    @Step
    public void searchedProductDisplayed(String productname){
        searchResultPage.isProductDisplayed(productname);
    }


}
