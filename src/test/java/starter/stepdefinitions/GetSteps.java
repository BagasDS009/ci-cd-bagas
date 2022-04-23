package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.GetSingleUser;

public class GetSteps {
    @Steps
    GetSingleUser getUser;

    @Given("I set GET api endpoints")
    public void setGetApiEndpoints(){
        getUser.setApiEndpoint();
    }
    @When("I send GET HTTP request")
    public void sendGetHttpRequest(){
        getUser.sendGetHttpRequests();
    }
    @Then("I receive valid HTTP response code 200")
    public void receiveValidHttpResponseCode(){
        getUser.receiveValidfHttpResponseCode200();
    }
    @And("I receive valid data for detail user")
    public void receiveValidDataForDetailUser(){
        getUser.receiveValiDataForDetailUser();
    }
}
