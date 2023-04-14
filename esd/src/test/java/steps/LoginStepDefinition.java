package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.CommonMethods;
import utils.ConfigReader;

public class LoginStepDefinition extends CommonMethods {
    @Given("user is navigated to login page")
    public void user_is_navigated_to_login_page() {
        Assert.assertTrue(loginPage.usernameField.isEnabled());
    }
    @When("user enters valid login and password")
    public void user_enters_valid_login_and_password() {
        loginPage.usernameField.sendKeys(ConfigReader.getPropertyValue("username"));
        loginPage.passwordField.sendKeys(ConfigReader.getPropertyValue("password"));
        click(loginPage.signInButton);
    }
    @Then("user is successfully logged in and land on dashboard")
    public void user_is_successfully_logged_in_and_land_on_dashboard() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(createScreens.userGreeting.isDisplayed());
    }
}
