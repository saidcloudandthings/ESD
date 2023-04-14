package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class ApplyScreens extends CommonMethods {

    @FindBy(xpath = "//span[contains(text(), 'Apply')]")
    public WebElement applyGreeting;

    @FindBy(xpath = "//span[contains(text(), 'Back')]")
    public WebElement applyBack;

    @FindBy(xpath = "//button[contains(text(), 'Start')]")
    public WebElement applyStart;

    @FindBy(xpath = "//label[contains(text(), 'confirm')]")
    public WebElement confirmCheck;

//    @FindBy(xpath = "//span[contains(text(), 'Next')]")
//    public WebElement applyNext;


    @FindBy(xpath = "//button[contains(text(), 'Yes')]")
    public List<WebElement> yesRadio;

    @FindBy(xpath = "//button[contains(text(), 'No')]")
    public List<WebElement> noRadio;





    @FindBy(css = "#l1-32_0-ButtonGroupItem_Yes")
    public WebElement firstYes;

    @FindBy(css = "#l1-32_0-ButtonGroupItem_No")
    public WebElement firstNo;

    @FindBy(css = "#l1-32_1-ButtonGroupItem_Yes")
    public WebElement secondYes;

    @FindBy(css = "#l1-32_1-ButtonGroupItem_No")
    public WebElement secondNo;

    @FindBy(css = "#l1-32_2-ButtonGroupItem_Yes")
    public WebElement thirdYes;

    @FindBy(css = "#l1-32_2-ButtonGroupItem_No")
    public WebElement thirdNo;

    @FindBy(css = "#l1-32_3-ButtonGroupItem_Yes")
    public WebElement fourthYes;

    @FindBy(css = "#l1-32_3-ButtonGroupItem_No")
    public WebElement fourthNo;

    @FindBy(css = "#l1-32_4-ButtonGroupItem_Yes")
    public WebElement fifthYes;

    @FindBy(css = "#l1-32_4-ButtonGroupItem_No")
    public WebElement fifthNo;

    @FindBy(css = "#l1-32_5-ButtonGroupItem_Yes")
    public WebElement sixthYes;

    @FindBy(css = "#l1-32_5-ButtonGroupItem_No")
    public WebElement sixthNo;

    @FindBy(css = "#l1-32_6-ButtonGroupItem_Yes")
    public WebElement seventhYes;

    @FindBy(css = "#l1-32_6-ButtonGroupItem_No")
    public WebElement seventhNo;

    @FindBy(css = "#l1-32_7-ButtonGroupItem_Yes")
    public WebElement eighthYes;

    @FindBy(css = "#l1-32_7-ButtonGroupItem_No")
    public WebElement eighthNo;

    @FindBy(css = "#l1-32_8-ButtonGroupItem_Yes")
    public WebElement ninthYes;

    @FindBy(css = "#l1-32_8-ButtonGroupItem_No")
    public WebElement ninthNo;

    @FindBy(css = "#l1-32_9-ButtonGroupItem_Yes")
    public WebElement tenthYes;

    @FindBy(css = "#l1-32_9-ButtonGroupItem_No")
    public WebElement tenthNo;

    public ApplyScreens() {
        PageFactory.initElements(driver, this);
    }

}
