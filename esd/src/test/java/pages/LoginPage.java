package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;
import utils.ConfigReader;

public class LoginPage extends CommonMethods {
    @FindBy(id = "Input_UsernameVal")
    public WebElement usernameField;
    @FindBy(id = "Input_PasswordVal")
    public WebElement passwordField;
    @FindBy(id = "b6-Button")
    public WebElement signInButton;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void login(String username, String password){
        sendText(usernameField, ConfigReader.getPropertyValue("username"));
        sendText(passwordField, ConfigReader.getPropertyValue("password"));
    }
}
