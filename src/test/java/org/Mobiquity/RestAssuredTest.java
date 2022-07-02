package org.Mobiquity;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class RestAssuredTest extends Main {
  @Test
  public  void SearchForUsernameTest() {
    searchForUserByUsername();

  }
  public void searchForUserByUsername(){
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