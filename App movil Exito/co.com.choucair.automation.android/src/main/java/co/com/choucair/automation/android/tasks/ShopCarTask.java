package co.com.choucair.automation.android.tasks;

import co.com.choucair.automation.android.userinterface.AddProductoPage;
import co.com.choucair.automation.android.userinterface.ShopCarPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class ShopCarTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        String titleProductCar= ShopCarPage.TITLEPRODUCTCAR.resolveFor(actor).getText();
        actor.remember("title product car", titleProductCar);
        System.out.println("*Title product car: " + titleProductCar);
    }

    public static ShopCarTask productCar() {
        return Tasks.instrumented(ShopCarTask.class);
    }
}
