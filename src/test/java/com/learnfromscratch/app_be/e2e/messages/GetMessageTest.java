package com.learnfromscratch.app_be.e2e.messages;



import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetMessageTest {
    public static final String BaseURL = "http://localhost:8080";
    @Test
    public void getMessage() {
        given().baseUri(BaseURL)
                .get("/message")
                .then().assertThat().statusCode(200)
                .and()
                .body(containsString("Hi from backend!!"));
    }

}
