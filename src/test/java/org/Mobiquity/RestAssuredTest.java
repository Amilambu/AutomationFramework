package org.Mobiquity;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class RestAssuredTest {
  @Test
  public static void GetResponseBody() {

    given().
        when()
            .get("https://jsonplaceholder.typicode.com/users")
            .then()
            .statusCode(200)
            .log()
            .all();
           // .body("",);





  }


}