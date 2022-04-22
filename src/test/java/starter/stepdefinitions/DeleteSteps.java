package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Delete;

public class DeleteSteps {
    @Steps
    Delete delete;
    @Given("I set DELETE api endpoints")
    public void iSetDELETEApiEndpoints() {
        delete.setDeleteApiEndpoint();
    }

    @When("I send DELETE HTTP request")
    public void iSendDELETEHTTPRequest() {
        delete.sendDeleteHttpRequests();
    }

    @Then("I receive valid HTTP response code 204")
    public void iReceiveValidHTTPResponseCode() {
        delete.receiveValidfHttpResponseCode204();
    }
}
