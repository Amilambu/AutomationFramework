package org.Mobiquity;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
public class RestAssuredTest extends Main {

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
  public void  searchForPostsWrittenByTheUser(){
    given().
            when()
            .get("https://jsonplaceholder.typicode.com/posts")
            .then()
            .statusCode(200)
            .body("id[8]", equalTo(9));

  }
  /**For each post, fetch the comments and validate if the emails in the
   comment section are in the proper format.*/
  @Test
  public void fetchCommentsAndValidateEmail(){
    given()

            .get("https://jsonplaceholder.typicode.com/posts/1/comments")
            .then()
            .assertThat()
            .body("email", hasItem("Eliseo@gardner.biz"));


  }
  @Test
  public void  verifyPhotos(){
    given().
            when()
            .get("https://jsonplaceholder.typicode.com/photos")
            .then()

            .body("id[0]", equalTo(1));

  }
  @Test
  public void SearchAlbumsTitle(){
    given().
            when()
            .get("https://jsonplaceholder.typicode.com/albums")
            .then()
            .statusCode(200)
            .body("title", hasItems("quidem molestiae enim"));

  }





}