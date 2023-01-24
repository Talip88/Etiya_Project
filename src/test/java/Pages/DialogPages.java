package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DialogPages extends Parent{

    public DialogPages(){
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "[class='lang-active']")
    private WebElement languageButton;

    @FindBy(linkText = "TR")
    private WebElement turkish;


    //https://www.etiya.com/tr









    WebElement myElement;

//    public void findAndSend(String strlement, String value) {
//
//        switch (strlement) {
//            case "username":
//                myElement = username;
//                break;
//        }
//
//        sendKeysFunction(myElement, value);
//        }


    public void findAndClick(String strlement) {

        switch (strlement) {
            case "languageButton":
                myElement = languageButton;
                break;

            case "turkish":
                myElement = turkish;
                break;

    }
    clickFunction(myElement);
}


    public void findAndClick2(String strlement) {

        switch (strlement) {
            case "languageButton":
                myElement = languageButton;
                break;

            case "turkish":
                myElement = turkish;
                break;

        }
        clickFunction(myElement);
    }




    public void urlAssertion(String value)

    {

        Assert.assertTrue(GWD.getDriver().getCurrentUrl().contains(value));

    }



}
