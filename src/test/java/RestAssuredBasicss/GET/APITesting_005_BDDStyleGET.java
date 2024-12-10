package RestAssuredBasicss.GET;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_005_BDDStyleGET {

    @Test
    public void test_GET_Req_POSTIVE() {

        String pin_code = "587101";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pin_code)
                .when()
                .log()
                .all()
                .get()
                .then()
                .log().all()
                .statusCode(200);
    }

    @Test
    public void test_GET_Req_NAGATIVE() {

        String pin_code = "-1";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pin_code)
                .when()
                .log()
                .all()
                .get()
                .then()
                .log().all()
                .statusCode(200);

    }
}
