package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class ApplyStepDefinition extends CommonMethods {

    @Given("user clicks desired business box")
    public void user_clicks_desired_business_box() throws InterruptedException {
        Thread.sleep(4000);
        dashboardPage.box3.click();
    }

    @When("user clicks apply")
    public void user_clicks_apply() throws InterruptedException {
        Thread.sleep(2000);
        dashboardPage.apply.click();
    }
    @And("user clicks start")
    public void user_clicks_start() throws InterruptedException {
        Thread.sleep(2000);
        applyScreens.applyStart.click();
    }
    @And("user confirm checkbox")
    public void user_confirm_checkbox() throws InterruptedException {
        Thread.sleep(2000);
        applyScreens.confirmCheck.click();
    }

    @When("user completes assessment")
    public void user_completes_assessment() throws InterruptedException {
        Thread.sleep(2000);
        for (int i = 0; i < applyScreens.yesRadio.size(); i++){
            applyScreens.yesRadio.get(i).click();
        }

        for (int i = 0; i < applyScreens.noRadio.size(); i++){
            if (i == 3 || i == 6) {
                applyScreens.noRadio.get(i).click();
            }
        }
    }
}
