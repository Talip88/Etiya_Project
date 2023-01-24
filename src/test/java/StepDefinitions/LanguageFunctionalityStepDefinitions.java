package StepDefinitions;

import Pages.DialogPages;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class LanguageFunctionalityStepDefinitions {

    DialogPages dp=new DialogPages();

    @Given("Navigate to Etiya WebSite")
    public void navigateToEtiyaWebSite() {

        GWD.getDriver().get("https://www.etiya.com/en");
        GWD.getDriver().manage().window().maximize();
    }

    @When("Click language button")
    public void clickLanguageButton(DataTable elemanlar) {
        List<String> listElemanlar = elemanlar.asList(String.class);

        for (String strButtonName : listElemanlar) {
            dp.findAndClick(strButtonName);

        }

    }
        @Then("User should be able to change language")
        public void userShouldBeAbleToChangeLanguage ( ) {

            dp.urlAssertion("tr");


        }

    }

