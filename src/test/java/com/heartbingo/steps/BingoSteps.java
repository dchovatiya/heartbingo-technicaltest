package com.heartbingo.steps;

import com.heartbingo.pages.FormPage;
import com.heartbingo.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * By Dimple Patel
 **/
public class BingoSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage()
    {
        System.out.println("I am on homepage");
    }

    @When("^I click on login link \"([^\"]*)\"$")
    public void iClickOnLoginLink(String loginLnk)
    {
        new HomePage().clickOnTheLink(loginLnk);
    }
    @And("^enter Username \"([^\"]*)\"$")
    public void enterUsername(String userNm) throws InterruptedException {

        new FormPage().sendUserNm(userNm);
    }

    @And("^password \"([^\"]*)\"$")
    public void password(String password)
    {
       new FormPage().sendPassWord(password);
    }
    @And("^Click on login button$")
    public void clickOnLoginButton() throws InterruptedException {
        Thread.sleep(2000);
        new FormPage().clickOnLoginBtn();

    }
    @Then("^error message is displayed$")
    public void errorMessageIsDisplayed() throws InterruptedException
    {
        String expectedMsg="The username or password you entered is incorrect. Please try again.";
        String actualMsg=new FormPage().verifyTheErrMsg();
        Assert.assertEquals("Results are matched:-",expectedMsg,actualMsg);
        new FormPage().switchToHomePage();
    }
}
