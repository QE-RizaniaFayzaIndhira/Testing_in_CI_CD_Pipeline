package starter.method;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Register {
    public String endpoint = "https://reqres.in/api/register";

    @Step("user set valid endpoint")
    public String setvalidEndpoint() {
        return endpoint;
    }

    @Step("user send GET HTTP request")
    public void sendGetHttpRequest() {
        SerenityRest.given().get(setvalidEndpoint());
    }

    @Step("user send post new user data")
    public void sendPostHttpRequest() {

        String body = "{\"email\":\"eve.holt@reqres.in\", \"password\": \"pistol\"}";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setvalidEndpoint());
    }

    @Step("user received valid HTTP response code 200")
    public void validateHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
