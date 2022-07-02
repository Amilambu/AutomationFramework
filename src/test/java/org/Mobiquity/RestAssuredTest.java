package org.Mobiquity;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;


public class RestAssuredTest {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    GetResponseBody();
  }
  @Test
  public static void GetResponseBody() {

    given().
            when().
            get("https://jsonplaceholder.typicode.com/").then().statusCode(200);



  }


}