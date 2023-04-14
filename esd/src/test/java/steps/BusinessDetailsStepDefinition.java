package steps;

import io.cucumber.java.en.And;
import utils.CommonMethods;
import utils.ConfigReader;

public class BusinessDetailsStepDefinition extends CommonMethods {

    @And("user clicks yes")
    public void user_clicks_yes() throws InterruptedException {
        Thread.sleep(2000);
        businessDetails.yesRadioBD.click();
    }

    @And("user enters valid dos")
    public void user_enters_valid_dos() throws InterruptedException {
        Thread.sleep(2000);
        businessDetails.dosField.clear();
        businessDetails.dosField.sendKeys("1234");
        Thread.sleep(2000);
        businessDetails.dosValidate.click();
    }

    @And("user gives meeting minutes statement")
    public void user_gives_meeting_minutes_statement() throws InterruptedException {
        Thread.sleep(2000);
        businessDetails.noRadioBD.click();
        Thread.sleep(2000);
        businessDetails.minuteStatement.sendKeys(ConfigReader.getPropertyValue("statement"));
    }

    @And("user enters date and method est")
    public void user_enters_date_and_method_est() throws InterruptedException {
        Thread.sleep(2000);
        businessDetails.dateEst.sendKeys(ConfigReader.getPropertyValue("whenEst"));
        dropdownSelect(businessDetails.dropEst, ConfigReader.getPropertyValue("methodEst"));
    }

    @And("user selects counties")
    public void user_selects_counties() throws InterruptedException {
        Thread.sleep(2000);
        businessDetails.newYorkCity.click();
        businessDetails.longIsland.click();
    }
}
