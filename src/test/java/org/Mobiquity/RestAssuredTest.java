package org.Mobiquity;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
public class RestAssuredTest extends Main {
  @Test
  /**public  void SearchForUsernameTest() {
    searchForUserByUsername();

  }*/

  /**Search for the user with username “Delphine”.*/

  public void searchForUserByUsername(){
    given().
            when()
            .get("https://jsonplaceholder.typicode.com/users")
            .then()
            .statusCode(200)
            .body("username", hasItems("Delphine"));

  }
  /**Use the details fetched to make a search for the posts written by the
  user.*/
  @Test
  public void  searchforpostswrittenbytheuser(){
    given().
            when()
            .get("https://jsonplaceholder.typicode.com/posts")
            .then()
            .statusCode(200)
            .body("id[8]", equalTo(9));

  }
  /**For each post, fetch the comments and validate if the emails in the
  comment section are in the proper format.*/
/**public void validateComments(){
  given().
          when()
          .fetch ("https://jsonplaceholder.typicode.com/posts/1/comments")
          .then()
          .statusCode(200)
          .body("id[8]", equalTo(9));
}*/
}