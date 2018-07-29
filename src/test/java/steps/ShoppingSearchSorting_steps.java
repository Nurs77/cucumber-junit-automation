package steps;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;
import pages.ShoppingHomePage;
import pages.ShoppingSearchPage;

public class ShoppingSearchSorting_steps {
	
	ShoppingHomePage shp = new ShoppingHomePage();
	ShoppingSearchPage ssp = new ShoppingSearchPage();

	@Then("user searches for item {string}")
	public void user_searches_for_item(String itemValue) {
	    shp.searchBox.sendKeys(itemValue);
	    shp.searchBtn.click();
	}

	@Then("user verifies a message {string}")
	public void user_verifies_a_message(String resultAmount) {
	    String message = resultAmount + " results have been found.";
	    String actualMessage = ssp.resultMessage.getText();
	    Assert.assertEquals("Result message verification", message, actualMessage);
	}

	@Then("user selects sort by option {string}")
	public void user_selects_sort_by_option(String option) {
	    ssp.selectSortBy(option);
	}

	@Then("user verifies each result is sorted by lowest price first")
	public void user_verifies_each_result_is_sorted_by_lowest_price_first() {
		List<Double> prices = new ArrayList<>();
	    for(WebElement price: ssp.resultPrices) {
	    		String priceStr = price.getText().replace("$", "");
	    		prices.add(Double.valueOf(priceStr));
	    }
	    System.out.println(prices);
	    for(int i = 0; i < prices.size()-1; i++) {
	    		Assert.assertTrue("Ascending order in prices failed: first price: " + prices.get(i) + " second price: " + prices.get(i+1)  ,prices.get(i) <= prices.get(i + 1));
	    }
	}
}









