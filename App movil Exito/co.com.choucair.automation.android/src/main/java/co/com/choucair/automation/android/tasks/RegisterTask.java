package co.com.choucair.automation.android.tasks;

import co.com.choucair.automation.android.userinterface.RegisterPage;
import io.appium.java_client.TouchAction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;

public class RegisterTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("David").into(RegisterPage.NOMBRES),
                Enter.theValue("Quijano").into(RegisterPage.APELLIDOS),
                Enter.theValue("C.C").into(RegisterPage.TIPODOCUMENTO),
                Enter.theValue("123456789").into(RegisterPage.DOCUEMENTO),
                Enter.theValue("1995").into(RegisterPage.ANIONACIMIENTO),
                Enter.theValue("08").into(RegisterPage.MESNACIMIENTO),
                Enter.theValue("27").into(RegisterPage.DIANACIMIENTO),
                Enter.theValue("3225684165").into(RegisterPage.CELULAR),
                Enter.theValue("david@correo.com").into(RegisterPage.EMAIL),
                Click.on(RegisterPage.TERMINOSCONDICIONES),
                Click.on(RegisterPage.POLITICAS),
                Click.on(RegisterPage.BTNCONFIRMAR)

        );
    }

    public static RegisterTask registerDates(){

        return Tasks.instrumented(RegisterTask.class);
    }
}
