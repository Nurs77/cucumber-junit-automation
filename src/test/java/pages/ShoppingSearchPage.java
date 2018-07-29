package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.Driver;

public class ShoppingSearchPage {

WebDriver driver;
	
	public ShoppingSearchPage() {
		driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[@class='heading-counter']")
	public WebElement resultMessage;
	
	@FindBy(id = "selectProductSort")
	public WebElement sortByDropdown;
	
	@FindBy(xpath = "//ul[@class='product_list grid row']/li//div[@class='right-block']//span[@class='price product-price']")
	public List<WebElement> resultPrices;
	
	
	public void selectSortBy(String option) {
		Select sortBy = new Select(sortByDropdown);
		sortBy.selectByVisibleText(option);
	}
	
	
}




















