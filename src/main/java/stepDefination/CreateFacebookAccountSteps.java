package stepDefination;

import base.Base;
import facebook.FacebookHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import static org.testng.Assert.*;

public class CreateFacebookAccountSteps<fill, form, firstName, last, name, and, lastname, email> extends Base {

    FacebookHomePage facebookHomePage = new FacebookHomePage (driver, wait);


    @Given("^I am in Facebook home page")

    public void i_am_in_Facebook_home_page(){
        driver.get("https://www.facebook.com");
    }

    @When("^I click on create account button")


    public void i_click_on_create_account_button(){

        facebookHomePage.createAccountButton.click();
    }

    @Then("^I able to see the sign up form")

    public void i_able_to_see_the_sign_up_form(){

        assertEquals(facebookHomePage.signupPopHeader.getText(),"Sign Up");
    }

    @When("^ i fill form wait firstName (.*) lastName(.*) and email (.*) and age {int} $")

    public void iFillUpAllTheInformationWithValidData(String firstName, String lastName, String email, int age ){

        facebookHomePage.firstname.sendKeys(firstName);
        facebookHomePage.lastname.sendKeys(lastName);
        facebookHomePage.email.sendKeys(email);



    }
    












}


