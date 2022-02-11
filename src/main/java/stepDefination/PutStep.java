package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PutStep {

    String payloadeForPutPet;

    String URL;

    Response response;

    @Given("I have valid URL with all valid data")

    public void iHaveValidURLWithAllValidData(){

        URL="https://petstore.swagger.io/v2/pet";

        payloadeForPutPet = "{\n" +
                "  \"id\": 1,\n" +
                "  \"category\": {\n" +
                "    \"id\": 1,\n" +
                "    \"name\": \"husky\"\n" +
                "  },\n" +
                "  \"name\": \"tom\",\n" +
                "  \"photoUrls\": [\n" +
                "    \"string\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\": 1,\n" +
                "      \"name\": \"string\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"status\": \"available\"\n" +
                "}";
    }


    @When("I send the put request with valid header")

     public void iSendThePutRequestWithValidHeader(){

        response= RestAssured.given().accept(ContentType.JSON).contentType(ContentType.JSON)

                .when()
                .body(payloadeForPutPet).then().log().all().when()
                .put(URL);

    }

    @Then("I validate the successful response")

    public void iValidateTheSuccessfulResponse(){

        response.then().statusCode(200);

        response.then().log().all();
    }

    @Given("I have invalid URL with invalid data")

    public void iHaveInvalidURLWithInvalidData(){

        URL= "https://petstore.swagger.io/v2/pet";

        payloadeForPutPet = "{\n" +
                "  \"id\": 1,\n" +
                "  \"category\": {\n" +
                "    \"id\": 1,\n" +
                "    \"name\": \"husky\"\n" +
                "  },\n" +
                "  \"name\": \"tom\",\n" +
                "  \"photoUrls\": [\n" +
                "    \"string\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\": 1,\n" +
                "      \"name\": \"string\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"status\": \"available\"\n" +
                "}";
    }

    @When("I send the put request with invalid header")

    public void iSendThePutRequestWithInvalidHeader(){

        response= RestAssured.given().accept(ContentType.JSON).contentType(ContentType.JSON)

                .when()
                .body(payloadeForPutPet).then().log().all().when()
                .put(URL);
        
    }


    @Then("I validate the sucsecfull response")


    public void iValidateTheSucsecfullRespons(){


    }
}

