package com.bestbuy.crudtest;

import com.bestbuy.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class StoresCURDTest extends TestBase {
    @Test
    public void getAllStoreInfo() {

        Response response = given()
                .when()
                .get();
        response.then().statusCode(200);
        response.prettyPrint();
    }

}
