package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class CreateScreens extends CommonMethods {
    @FindBy(xpath = "//span[contains(text(),'Hello')]")
    public WebElement userGreeting;

    @FindBy(css = "#b4-Column1 > div > div:nth-child(6) > button")
    public WebElement createBusiness;

    @FindBy(id = "Input_TaxId_SSN")
    public WebElement taxInput;

    @FindBy(css = "#Dropdown_BusinessStructureTypeId")
    public WebElement typeSelectionDrop;

    @FindBy(css = "#Input_Name")
    public WebElement bizNameField;

    @FindBy(css = "#Input_DBA")
    public WebElement dbaField;

    @FindBy(xpath = "//input[@placeholder='Address Line 1']")
    public WebElement address1;

    @FindBy(xpath = "//input[@placeholder='Address Line 2']")
    public WebElement address2;

    @FindBy(xpath = "//input[@placeholder='City']")
    public WebElement city;

    @FindBy(css = "#b6-Dropdown_State")
    public WebElement stateDrop;

    @FindBy(xpath = "//input[@placeholder='ZIP']")
    public WebElement zip;

    @FindBy(xpath = "//*[@id='Input_PhoneNumber2']")
    public WebElement phone;

    @FindBy(xpath = "//*[@id='Input_Website']")
    public WebElement website;

    @FindBy(xpath = "//*[@id='Input_InstagramProfile']")
    public WebElement instagram;

    @FindBy(xpath = "//*[@id='Checkbox_IsPrimaryContact']")
    public WebElement isPrimary;

    @FindBy(xpath = "//*[@id='Input_FirstName']")
    public WebElement contactFirst;

    @FindBy(xpath = "//*[@id='Input_LastName']")
    public WebElement contactLast;

    @FindBy(xpath = "//*[@id='Input_Email']")
    public WebElement contactEmail;

    @FindBy(xpath = "//*[@id='Input_MobilePhone']")
    public WebElement contactPhone;

    @FindBy(css = "button[type='submit']")
    public WebElement submit;

    @FindBy(xpath = "//span[contains(text(), 'Back')]")
    public WebElement backButton;

    @FindBy(xpath = "//span[contains(text(), 'Next')]")
    public WebElement nextCreate;

    public CreateScreens() {
        PageFactory.initElements(driver, this);
    }
}
