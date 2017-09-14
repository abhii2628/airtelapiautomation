package com.myairtel.test;

import com.myairtel.framework.BaseClass;
import com.myairtel.framework.TestInfo;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import common.ApiEvent;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

/**
 * Created by B0095770 on 15/08/17.
 */
public class PostpaidMainAccountCard extends BaseClass {

    private static ExtentReports extent;
    private static ExtentTest test;

    @BeforeSuite
    public void beforeSuite(){
        extent = new ExtentReports("/Users/abhishek/Desktop/reports/try.html", true);
        extent.loadConfig(new File(System.getProperty("user.dir") + "/src/main/resources/LoadConfig.xml"));
    }

    @BeforeMethod
    public void beforeMethod(){
        test = extent.startTest(TestInfo.getID(),TestInfo.getNAME());
        test.assignAuthor("Abhishek");
        test.assignCategory("Sanity suite");
        test.log(LogStatus.PASS, "Got response");
    }

    @Test(enabled = true)
    public void getMainCard(){
        TestInfo.setID("MainAcc01");
        TestInfo.setNAME("Checking if the status code is 200");
        given().headers(setHeaders()).queryParam("spoof",true)
                .when().contentType(ContentType.JSON)
                .get(ApiEvent.MAIN_ACC_CARD)
                .then().statusCode(HttpStatus.SC_OK).log().all();
        test.log(LogStatus.PASS,"Test is successfully");
    }
    @Test(enabled = true)
    public void getMock(){
        System.out.println();
        given().headers(setHeaders()).queryParam("spoof",true)
                .when().contentType(ContentType.JSON)
                .get(ApiEvent.MAIN_ACC_CARD)
                .then().assertThat().body(matchesJsonSchemaInClasspath("/mocks/postpaidAccCard.json"))
        .log().all();
    }

    @Test(enabled = true)
    public void testRoot(){

        given().headers(setHeaders()).when().get(ApiEvent.MAIN_ACC_CARD).then().root("").log().all();

    }


    @AfterSuite
    public void afterSuite(){
        extent.endTest(test);
        extent.flush();
        extent.close();
    }

}
