package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Post;

public class PostSteps {
    @Steps
    Post post;

    @Given("I set POST api endpoints")
    public void iSetPOSTApiEndpoints() {
        post.setPostApiEndpoint();
    }

    @When("I send POST HTTP request")
    public void iSendPOSTHTTPRequest() {
        post.sendPostHttpRequest();
    }

    @Then("I receive valid HTTP response code 201")
    public void iReceiveValidHTTPResponseCode() {
        post.validHttpResponseCode201();
    }

    @And("I receive valid data for user")
    public void iReceiveValidDataForUser() {
        post.IReceiveValidDataForUser();
    }

}
