package co.com.choucair.certification.reto.exito.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarPrecioProductos implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return actor.recall("precios de productos carro de compras");
    }

    public static ValidarPrecioProductos validarPrecioProductosCarro(){
        return new ValidarPrecioProductos();
    }
}
