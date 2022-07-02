package org.Mobiquity;

import org.junit.jupiter.api.Test;




public class RestAssuredTest1 {

  @Test

  public static void GetResponseBody() {

    given().
            when().
            Get("https://jsonplaceholder.typicode.com/").

            then().

  }

  
}