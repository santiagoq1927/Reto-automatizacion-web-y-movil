package co.com.choucair.automation.android.tasks;

import co.com.choucair.automation.android.userinterface.AddProductoPage;
import co.com.choucair.automation.android.userinterface.ProductSelectPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class AddProductTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        String titleProduct= AddProductoPage.TITTLEPRDUCT.resolveFor(actor).getText();
        actor.remember("title product", titleProduct);
        System.out.println("*Title producto: " + titleProduct);
        actor.attemptsTo(
                WaitUntil.the(AddProductoPage.ADDPRODUCT, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(AddProductoPage.ADDPRODUCT),
                Click.on(AddProductoPage.SHOPCAR)
        );

    }

    public static AddProductTask addProduct(){
        return Tasks.instrumented(AddProductTask.class);
    }
}
