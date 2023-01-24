package StepDefinitions;

import Pages.DialogPages;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LanguageFunctionality {

    DialogPages dp=new DialogPages();

    @Given("Navigate to Etiya WebSite")
    public void navigateToEtiyaWebSite() {

        GWD.getDriver().get("https://www.etiya.com/en");
        GWD.getDriver().manage().window().maximize();
    }

    @When("Click language button")
    public void clickLanguageButton() {


    }

    @Then("User should be able to change language")
    public void userShouldBeAbleToChangeLanguage() {

        dp.urlAssertion("tr");


    }





}
