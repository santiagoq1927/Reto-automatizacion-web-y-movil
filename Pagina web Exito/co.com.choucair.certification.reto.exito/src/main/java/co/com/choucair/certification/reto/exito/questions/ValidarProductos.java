package co.com.choucair.certification.reto.exito.questions;

import co.com.choucair.certification.reto.exito.userinterface.CarroCompras;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ValidarProductos implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return actor.recall("nombre de productos carro de compras");
    }

    public static ValidarProductos validarProductosCarro(){
        return new ValidarProductos();
    }

}
