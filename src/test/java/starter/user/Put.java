package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Put {
    protected static String url = "https://reqres.in/api/";

    @Step("I set PUT api endpoints")
    public String setPutApiEndpoint(){
        return url + "users/2";
    }

    @Step("I send PUT HTTP request")
    public void sendPutHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name","morpheus");
        requestBody.put("job", "zion resident");

        SerenityRest.given().header("Content-Type", "application/json").body(setPutApiEndpoint());
    }
    @Step("I receive valid data for user")
    public void IReceiveValidDataForUser() {
        restAssuredThat(reseponse -> reseponse.body("'name'", equalTo("morpheus")));
        restAssuredThat(reseponse -> reseponse.body("'job'", equalTo("zion resident")));
    }
}
