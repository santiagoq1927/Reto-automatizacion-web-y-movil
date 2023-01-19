package co.com.choucair.certification.reto.exito.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarCantidadProductos implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return actor.recall("cantidad de productos carro de compras");
    }

    public static ValidarCantidadProductos validarCantidadProductosCarro(){
        return new ValidarCantidadProductos();
    }
}
