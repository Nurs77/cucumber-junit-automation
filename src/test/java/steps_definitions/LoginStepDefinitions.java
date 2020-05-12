package steps_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LoginStepDefinitions {
    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("Open login page");
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user logs in as an inventory manager")
    public void user_logs_in_as_an_inventory_manager() {
        System.out.println("Login as user");
        loginPage.login();
    }

    @Then("user should verify that title is {string}")
    public void user_should_verify_that_title_is(String string) {
        System.out.println("Verify that Inbox is displayed");
        BrowserUtils.waitForPageToLoad(10);
        BrowserUtils.wait(2);
        Assert.assertEquals(string, Driver.getDriver().getTitle());
    }

}
