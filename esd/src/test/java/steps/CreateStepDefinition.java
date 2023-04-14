package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.CommonMethods;
import utils.ConfigReader;

public class CreateStepDefinition extends CommonMethods {
    @Given("user clicks create business button")
    public void user_clicks_create_business_button() throws InterruptedException {
        Thread.sleep(2000);
        createScreens.createBusiness.click();
        Assert.assertTrue(createScreens.taxInput.isDisplayed());
    }

    @When("user enters unregistered valid tax id or ssn")
    public void user_enters_unregistered_valid_tax_id_or_ssn() throws InterruptedException {
        Thread.sleep(2000);
        createScreens.taxInput.sendKeys(ConfigReader.getPropertyValue("taxID"));
    }

    @And("user clicks next")
    public void user_clicks_next() throws InterruptedException {
        Thread.sleep(2000);
        createScreens.nextCreate.click();
    }

    @And("user selects type from dropdown")
    public void user_selects_type_from_dropdown() throws InterruptedException {
        Thread.sleep(2000);
        dropdownSelect(createScreens.typeSelectionDrop, ConfigReader.getPropertyValue("bizStructure"));
    }

    @And("user enters business name")
    public void user_enters_business_name() throws InterruptedException {
        Thread.sleep(2000);
        createScreens.bizNameField.sendKeys(ConfigReader.getPropertyValue("bizName"));
    }

    @And("user enters dba")
    public void user_enters_dna() throws InterruptedException {
        Thread.sleep(2000);
        createScreens.dbaField.sendKeys(ConfigReader.getPropertyValue("dba"));
    }

    @And("user enters valid address")
    public void user_enters_valid_address() throws InterruptedException {
        Thread.sleep(2000);
        createScreens.address1.sendKeys(ConfigReader.getPropertyValue("address1"));
        createScreens.address2.sendKeys(ConfigReader.getPropertyValue("address2"));
        createScreens.city.sendKeys(ConfigReader.getPropertyValue("City"));
        dropdownSelect(createScreens.stateDrop, ConfigReader.getPropertyValue("state"));
        createScreens.zip.sendKeys(ConfigReader.getPropertyValue("zip"));
    }

    @And("user enters valid phone and website")
    public void user_enters_valid_phone_and_website() throws InterruptedException {
        Thread.sleep(2000);
        createScreens.phone.sendKeys(ConfigReader.getPropertyValue("phone"));
        createScreens.website.sendKeys(ConfigReader.getPropertyValue("website"));
    }

    @And("user enters social account")
    public void user_enters_social_account() throws InterruptedException {
        Thread.sleep(2000);
        createScreens.instagram.sendKeys(ConfigReader.getPropertyValue("social"));
    }

    @And("user enters contact person")
    public void user_enters_contact_person() throws InterruptedException {
        Thread.sleep(2000);
        createScreens.isPrimary.click();
        Thread.sleep(2000);
        createScreens.contactFirst.sendKeys(ConfigReader.getPropertyValue("first"));
        createScreens.contactLast.sendKeys(ConfigReader.getPropertyValue("last"));
        createScreens.contactEmail.sendKeys(ConfigReader.getPropertyValue("email"));
        createScreens.contactPhone.sendKeys(ConfigReader.getPropertyValue("phone"));
    }

    @And("user clicks submit")
    public void user_clicks_submit() {
        createScreens.submit.click();
    }
}
