package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.method.PUT;

public class PUTSteps {
    @Steps
    PUT put;
    @Given("user set valid PUT endpoint")
    public void userSetValidPUTEndpoint() {
        put.setValidPutEndpoint();
    }

    @When("user send PUT HTTP request")
    public void userSendPUTHTTPRequest() {
        put.sendPUTHTTPRequest();
    }

    @Then("user send update user data")
    public void userSendUpdateUserData() {
        put.validateValidPostDataUpdated();
    }

    @And("user received HTTP response code {int}")
    public void userReceivedHTTPResponseCode(int arg0) {
        put.validatePUTHTTPResponseCode200();
    }
}
