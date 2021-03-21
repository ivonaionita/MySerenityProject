package org.fasttrackit.features.search;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.SearchSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class SearchTest extends BaseTest {

    @Steps
    private SearchSteps searchSteps;

    @Test
    public void searchForExistingProduct(){
        searchSteps.completeSearchBar("beanie");
        searchSteps.enterSearch();
        searchSteps.searchedProductDisplayed("beanie");
    }

    @Test
    public void searchInexistentProduct(){
        searchSteps.completeSearchBar("asas");
        searchSteps.enterSearch();
        searchSteps.searchMessageDisplayed();
    }




}
