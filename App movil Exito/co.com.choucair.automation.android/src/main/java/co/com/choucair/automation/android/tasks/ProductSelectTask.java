package co.com.choucair.automation.android.tasks;

import co.com.choucair.automation.android.userinterface.AddProductoPage;
import co.com.choucair.automation.android.userinterface.LoginPage;
import co.com.choucair.automation.android.userinterface.ProductSelectPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class ProductSelectTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ProductSelectPage.SEARCHER, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(ProductSelectPage.SEARCHER),
                WaitUntil.the(ProductSelectPage.DELIVERY, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(ProductSelectPage.DELIVERY),
                WaitUntil.the(ProductSelectPage.BTNCONTINUE, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(ProductSelectPage.BTNCONTINUE),
                WaitUntil.the(ProductSelectPage.SEARCHERII, isClickable()).forNoMoreThan(10).seconds(),
                Enter.theValue("Consola Playstation 5").into(ProductSelectPage.SEARCHERII),
                Click.on(ProductSelectPage.BTNSEARCHER)
        );
    }

    public static ProductSelectTask pruductSelect(){
        return Tasks.instrumented(ProductSelectTask.class);
    }
}
