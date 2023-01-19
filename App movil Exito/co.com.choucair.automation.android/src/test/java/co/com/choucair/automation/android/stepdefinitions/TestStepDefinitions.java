package co.com.choucair.automation.android.stepdefinitions;

import co.com.choucair.automation.android.tasks.InitialPageTask;
import co.com.choucair.automation.android.tasks.OpenThe;
import co.com.choucair.automation.android.tasks.RegisterTask;
import co.com.choucair.automation.android.userinterface.InitialPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class TestStepDefinitions {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that user is on register page$")
    public void thatUserIsOnRegisterPage() {

        theActorCalled("David").wasAbleTo(OpenThe.exitoApp());
    }


    @When("^I enter the name david and lastname quijano$")
    public void iEnterTheEmailDavidGmailComAndPassword() {
        theActorInTheSpotlight().wasAbleTo(
                InitialPageTask.register(),
                RegisterTask.registerDates()
        );

    }

    @Then("^I should see the home page$")
    public void iShouldSeeTheHomePage() {

    }
}
