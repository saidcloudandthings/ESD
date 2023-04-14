package steps;

import io.cucumber.java.en.Given;
import utils.CommonMethods;

public class AddNewStepDefinition extends CommonMethods {

    @Given("user clicks add another")
    public void user_clicks_add_another() throws InterruptedException {
        Thread.sleep(2000);
        dashboardPage.addAnother.click();
    }
}
