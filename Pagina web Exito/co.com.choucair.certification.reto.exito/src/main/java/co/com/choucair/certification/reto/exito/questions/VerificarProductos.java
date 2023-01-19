package co.com.choucair.certification.reto.exito.questions;

import co.com.choucair.certification.reto.exito.userinterface.CarroCompras;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;


public class VerificarProductos {

    public static Question<String> nombreProducto(){
        return actor -> TextContent.of(CarroCompras.LBLNOMBREPRODUCTO).viewedBy(actor).asString();
    }
    public static Question<String> precioProducto(){
        return actor -> TextContent.of(CarroCompras.LBLPRECIOPRODUCTO).viewedBy(actor).asString();
    }
    public static Question<String> totalProductos(){
        return actor -> TextContent.of(CarroCompras.TOTALPRODUCTOS).viewedBy(actor).asString();
    }
}
