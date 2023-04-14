package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class ApplicationSummary extends CommonMethods {

    @FindBy(xpath = "//span[contains(text(), 'Resume')]")
    public WebElement resumeSummary;

    @FindBy(xpath = "//div[contains(text(), 'Application Overview')]")
    public WebElement appOver;

    @FindBy(xpath = "//div[contains(text(), 'Supporting')]")
    public WebElement supportDoc;

    @FindBy(xpath = "//div[contains(text(), 'Timeline')]")
    public WebElement timeline;

    public ApplicationSummary() {
        PageFactory.initElements(driver, this);
    }
}
