package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Post {
    protected static String url = "https://reqres.in/api/";

    @Step("I set DELETE api endpoints")
    public String setPostApiEndpoint(){
        return url + "users";
    }

    @Step("I send POST HTTP request")
    public void sendPostHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name","morpheus");
        requestBody.put("job", "leader");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpoint());
    }
    @Step("I receive valid HTTP response code 201")
    public void validHttpResponseCode201(){
        restAssuredThat(response -> response.statusCode(201));
    }
    @Step("I receive valid data for user")
    public void IReceiveValidDataForUser() {
        restAssuredThat(reseponse -> reseponse.body("'name'", equalTo("morpheus")));
        restAssuredThat(reseponse -> reseponse.body("'job'", equalTo("leader")));
    }
}
