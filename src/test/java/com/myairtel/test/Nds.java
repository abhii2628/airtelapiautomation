package com.myairtel.test;

import com.myairtel.bin.NdsUserInfo;
import com.myairtel.framework.BaseClass;
import com.myairtel.framework.Config;
import common.ApiEvent;
import common.MockableMapping;
import io.restassured.http.ContentType;
import io.restassured.http.Cookie;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

/**
 * Created by B0095770 on 12/08/17.
 */
public class Nds extends BaseClass {

  @Test()
    public void getUid(){
        //given().get("http://myairtelapp-stage.bsbportal.com/myairtelapp")
        //.then().statusCode(200).log().all();
       given().get(ApiEvent.GET_UID).then().statusCode(200).log().all();
    }

    @Test(groups = {"demo", "response"})
    public void getUidQuery() {
       // RequestSpecification requestSpecification = new BaseClass().getRequestSpecification();
        //requestSpecification.queryParam("msisdn", "7042127666").log().all();
        //requestSpecification.queryParam("uhm", false).log().all();
        given().queryParam("msisdn","7042127666").get(ApiEvent.GET_UID)
                .then().statusCode(200).log().all();

    }

    @Test
    public void getNdsUserInfo(){
       //Response response = given().accept(ContentType.JSON).when().queryParam("msisdn","7042127666").get(ApiEvent.GET_UID);
       // Response response = given().queryParam("msisdn","7042127666").get(ApiEvent.GET_UID);

        Response response = given().accept(ContentType.JSON).when().queryParam("msisdn","9599822187")
                .get(ApiEvent.NDS_USER_INFO);
        response.then().assertThat().statusCode(HttpStatus.SC_OK);
        response.then().body("preferredLanguage",equalTo("English")).log().all();
        NdsUserInfo info = response.as(NdsUserInfo.class, ObjectMapperType.GSON);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(!info.getPreferredLanguage().equalsIgnoreCase(""),"Field is empty");
        softAssert.assertTrue(!info.getCircle().equalsIgnoreCase(null),"Field is null");
        softAssert.assertTrue(info.getUserType().equalsIgnoreCase("prepaid"),"Field is not a lob");
        softAssert.assertAll();
 }
    @Test
    public void getNdsUserInfoWithHeaders() {

       // Map<String,String > headers = new HashMap<String, String>();
       // headers.put("Accept","application/json");
       // headers.put("x-bsy-bn","560");

        Response response = given().headers(setHeaders()).when().queryParam("msisdn", Config.prepaidNumber)
                .get(ApiEvent.NDS_USER_INFO);
        System.out.println(setHeaders());
        response.then().assertThat().statusCode(HttpStatus.SC_OK)
        .and().body("preferredLanguage", equalTo("English"),"circle","Delhi").log().all();

    }

    @Test
    public void getPostRequest() {
        given().body(MockableMapping.whitelistJson).when().contentType(ContentType.JSON)
                .post(ApiEvent.WHITELIST_NUMBER)
                .then().assertThat().statusCode(HttpStatus.SC_OK).log().all();

        Cookie cookie = new Cookie.Builder("","").setSecured(true).setComment("asd").build();
        given().contentType(ContentType.JSON).cookie(cookie).get("asd").then().statusCode(400);
        given().get("").then().time(lessThan(300L));
    }

}