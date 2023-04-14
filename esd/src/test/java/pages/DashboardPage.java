package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class DashboardPage extends CommonMethods {

    @FindBy(xpath = "//div[contains(text(), 'business may')]")
    public WebElement apply;

    @FindBy(xpath = "//span[contains(text(), 'Add another')]")
    public WebElement addAnother;

    @FindBy(xpath = "//span[contains(text(), 'Add additional')]")
    public WebElement addUser;

    @FindBy(xpath = "//span[contains(text(), 'Resume')]")
    public WebElement resume;

    @FindBy(xpath = "//span[contains(text(), 'Corp')]")
    public WebElement box1;

    @FindBy(xpath = "//span[contains(text(), 'LLC')]")
    public WebElement box2;

    @FindBy(xpath = "//span[contains(text(), 'LLP')]")
    public WebElement box3;

    @FindBy(xpath = "//span[contains(text(), 'Dashboard')]")
    public WebElement dashboard;

    @FindBy(xpath = "//span[contains(text(), 'Business Profile')]")
    public WebElement bizProfile;

    @FindBy(xpath = "//div[contains(text(), 'Edit Business Profile')]")
    public WebElement edit;

    @FindBy(xpath = "//div[contains(text(), 'New Business Profile')]")
    public WebElement addNew;

    @FindBy(xpath = "//span[contains(text(), 'Business Details')]")
    public WebElement bizProfileSide;

    @FindBy(xpath = "//span[contains(text(), 'Addresses')]")
    public WebElement addressesSide;

    @FindBy(xpath = "//div[contains(text(), 'Contact Info')]")
    public WebElement contactInfoSide;

    @FindBy(xpath = "//div[contains(text(), 'Social Media')]")
    public WebElement socialSide;

    @FindBy(xpath = "//div[contains(text(), 'Contact Person')]")
    public WebElement contactPersonSide;

    @FindBy(xpath = "//span[contains(text(), 'Save')]")
    public WebElement save;

    @FindBy(xpath = "//span[contains(text(), 'Cancel')]")
    public WebElement cancel;

    @FindBy(xpath = "//div[contains(text(), 'Certifications')]")
    public WebElement certifications;

    @FindBy(xpath = "//div[contains(text(), 'Manage Users')]")
    public WebElement manageUsers;

    public DashboardPage() {
        PageFactory.initElements(driver, this);
    }

}
