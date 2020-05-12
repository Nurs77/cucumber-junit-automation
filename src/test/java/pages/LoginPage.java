package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;

public class LoginPage extends AbstractBasePage {

    @FindBy(id="login")
    private WebElement username;

    @FindBy(id="password")
    private WebElement password;


    public void login(String usernameValue, String passwordValue){
        username.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);
        BrowserUtils.waitForPageToLoad(10);
        BrowserUtils.wait(2);
    }

    public void login(){
        username.sendKeys(ConfigurationReader.getProperty("username"));
        password.sendKeys(ConfigurationReader.getProperty("password"), Keys.ENTER);
        BrowserUtils.waitForPageToLoad(10);
        BrowserUtils.wait(2);
    }


}
