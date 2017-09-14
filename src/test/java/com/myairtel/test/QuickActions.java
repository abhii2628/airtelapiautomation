package com.myairtel.test;

import com.myairtel.framework.BaseClass;
import com.myairtel.framework.Config;
import common.ApiEvent;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static io.restassured.path.json.JsonPath.from;

/**
 * Created by B0095770 on 09/09/17.
 */
public class QuickActions extends BaseClass {

    String density = "xhdpi";

    @Test(enabled = false)
    //1) Verify the Quick Actions API returns success,
    //2) Url returns 200,
    //3) Density same as passed in request.

    public void quickActions() {
        String response = given().spec(requestSpec()).when().queryParam("density", Config.xhdpi)
                .get(ApiEvent.QUICK_ACTIONS_CARD)
                .then().extract().asString();
        List<String> uri = from(response).getList("data.actions.iconUri");
        for (String iconUri : uri) {
            if (iconUri != null && iconUri != "") {
                System.out.println(iconUri);
                SoftAssert softAssert = new SoftAssert();
                softAssert.assertEquals(given().get(iconUri).statusCode(), 200);
                softAssert.assertTrue(iconUri.contains(density));
                softAssert.assertAll();
            }
        }
        System.out.println(given().spec(requestSpec()).when().queryParam("density", density)
                .get(ApiEvent.QUICK_ACTIONS_CARD).then().log().headers());
    }

    @Test(enabled = false)
    // Check Schema against a pre defined format.
    public void checkSyntax() {
        System.out.println(this.getClass().getResource("/").getPath());
        given().spec(requestSpec().when().queryParam("density", density))
                .get(ApiEvent.QUICK_ACTIONS_CARD).then()
                .assertThat().body(matchesJsonSchemaInClasspath("QuickActions.json"));
    }

    @Test()
    //Check builders.
    public void checkBuilder() {
        given().spec(requestSpec()).when().queryParam("density", density)
                .get(ApiEvent.QUICK_ACTIONS_CARD).then()
                .assertThat().spec(responseSpec());
    }
}

