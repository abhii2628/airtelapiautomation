package com.myairtel.framework;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by B0095770 on 12/08/17.
 */
public class BaseClass {


    ResponseSpecification responseSpecification;
    ResponseSpecification responseBuilder;

    @BeforeClass
  /*  public void setUp(){
       RestAssured.baseURI = "http://apitest2mycloud.bsbportal.com";
       //RestAssured.port = 8080;
      // RestAssured.basePath = "/myairtelapp";
   } */

    public Map<String, String> setHeaders() {
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("x-bsy-bn", Config.buildNumber);
        headers.put("x-bsy-os", Config.os);
        // headers.put("x-bsy-uid",Config.uid);
        headers.put("x-bsy-utkn", getUtkn());
        headers.put("x-bsy-did", Config.deviceId);
        headers.put("x-bsy-dt", Config.dynamicToken);
        headers.put("Accept", "application/json");
        System.out.println(headers);
        return headers;
    }

    private String getUtkn() {
        String utkn = Config.uid + ":" + Config.token;
        return utkn;
    }

    public RequestSpecification requestSpec() {
        RequestSpecification requestSpecification;
        RequestSpecBuilder builder;
        builder = new RequestSpecBuilder();
        builder.setBaseUri(Config.prod);
        builder.setBasePath("/myairtelapp");
        builder.addQueryParam("spoof", true);
        builder.addHeaders(setHeaders());
        requestSpecification = builder.build();
        return requestSpecification;
    }

    public ResponseSpecification responseSpec(){
        ResponseSpecification responseSpecification;
        ResponseSpecBuilder builder;
        builder = new ResponseSpecBuilder();
        builder.expectStatusCode(200);
        builder.expectStatusLine("HTTP/1.1 200 OK");
        builder.expectHeader("cache-control","min-age, max-age");
        responseSpecification = builder.build();
        return responseSpecification;
    }

}


