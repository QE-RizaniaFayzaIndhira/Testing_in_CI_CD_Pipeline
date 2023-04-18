package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.method.Register;

public class RegisterSteps {
    @Steps
    Register register;

    @Given("user set valid endpoint")
    public void userSetValidEndpoint() {
        register.setvalidEndpoint();
    }

    @When("user send GET HTTP request")
    public void userSendGETHTTPRequest() {
        register.sendGetHttpRequest();
    }

    @Then("user send post new user data")
    public void userSendPostNewUserData() {
        register.sendPostHttpRequest();
    }

    @And("user received valid HTTP response code {int}")
    public void userReceivedValidHTTPResponseCode(int arg0) {
        register.validateHttpResponseCode200();
    }
}
