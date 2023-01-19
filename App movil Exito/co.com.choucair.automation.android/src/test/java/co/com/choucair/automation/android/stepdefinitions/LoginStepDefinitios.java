package co.com.choucair.automation.android.stepdefinitions;

import co.com.choucair.automation.android.questions.ValidateProduct;
import co.com.choucair.automation.android.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class LoginStepDefinitios {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that user is on login page$")
    public void thatUserIsOnLoginPage() {
        theActorCalled("David").wasAbleTo(OpenThe.exitoApp());

    }

    @When("^I enter the email and password$")
    public void iEnterTheEmailDavidGmailComAndPassword() {

        theActorInTheSpotlight().wasAbleTo(
                InitialLoginTask.enterLogin(),
                LoginTask.registerDates(),
                ProductSelectTask.pruductSelect(),
                AddProductTask.addProduct(),
                ShopCarTask.productCar()
        );

    }

    @Then("^I should see the product pull$")
    public void iShouldSeeTheProductPull() {
        theActorInTheSpotlight().should(
                //seeThat("", ValidateProduct.validateProd(), equalTo(theActorInTheSpotlight().recall("title product")))
        );

    }

}
