package co.com.choucair.certification.reto.exito.tasks;

import co.com.choucair.certification.reto.exito.userinterface.PaginaInicio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NavegacionWebTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PaginaInicio.MENU),
                Click.on(PaginaInicio.CATEGORIA),
                Click.on(PaginaInicio.SUBCATEGORIA)
        );
    }

    public static NavegacionWebTask navegarPagina() {
        return instrumented(NavegacionWebTask.class);
    }
}
