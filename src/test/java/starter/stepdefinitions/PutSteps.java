package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.GetSingleUser;
import starter.user.Put;

public class PutSteps {
    @Steps
    Put put;
    @Steps
    GetSingleUser get;
    @Given("I set PUT api endpoints")
    public void iSetPUTApiEndpoints() {
        put.setPutApiEndpoint();
    }

    @When("I send PUT HTTP request")
    public void iSendPUTHTTPRequest() {
        put.sendPutHttpRequest();
    }

    @And("I receive valid data for update user")
    public void iReceiveValidDataForUpdateUser() {
        put.IReceiveValidDataForUser();
    }
}
