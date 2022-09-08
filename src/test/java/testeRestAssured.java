import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.response.Response;
import org.hamcrest.Matchers.*;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class testeRestAssured {

    @Test
    public void getResponseBody() {
        Response response = given().when().get("http://google.com");
        Assert.assertEquals(200, response.getStatusCode());
    }

}
