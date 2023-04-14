package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class AppSummaryStepDefinition extends CommonMethods {

    @Given("user clicks resume dash")
    public void user_clicks_resume_dash() throws InterruptedException {
        Thread.sleep(4000);
        dashboardPage.resume.click();
    }

    @When("user clicks resume app sum")
    public void user_clicks_resume_app_sum() throws InterruptedException {
        Thread.sleep(2000);
        applicationSummary.resumeSummary.click();
    }
}
