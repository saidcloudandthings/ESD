package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class BusinessDetails extends CommonMethods {

    @FindBy(xpath = "//button[contains(text(), 'Yes')]")
    public WebElement yesRadioBD;

    @FindBy(xpath = "//button[contains(text(), 'No')]")
    public WebElement noRadioBD;

    @FindBy(xpath = "//*[@id='TextArea_MeetingMinsNoReason']")
    public WebElement minuteStatement;

    @FindBy(xpath = "//input[@placeholder='Enter DOS ID']")
    public WebElement dosField;

    @FindBy(xpath = "//button[contains(text(), 'Validate')]")
    public WebElement dosValidate;

    @FindBy(xpath = "//input[@id='Input_DateBusinessEstablished']")
    public WebElement dateEst;

    @FindBy(xpath = "//*[@id=\"Dropdown_MethodOfAcquisition\"]")
    public WebElement dropEst;

    @FindBy(xpath = "//span[contains(text(), 'All Regions')]")
    public WebElement allRegions;

    @FindBy(xpath = "//span[contains(text(), 'Central NY')]")
    public WebElement centralNewYork;

    @FindBy(xpath = "//span[contains(text(), 'Western NY')]")
    public WebElement westernNewYork;

    @FindBy(xpath = "//span[contains(text(), 'Mid-Hudson')]")
    public WebElement midHudson;

    @FindBy(xpath = "//span[contains(text(), 'Long Island')]")
    public WebElement longIsland;

    @FindBy(xpath = "//span[contains(text(), 'New York City')]")
    public WebElement newYorkCity;


    public BusinessDetails() {
        PageFactory.initElements(driver, this);
    }
}
