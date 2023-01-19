package co.com.choucair.certification.reto.exito.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaInicio {

    public static final Target MENU = Target.the("menu").
            locatedBy("//div[contains(@class,'vtex-button__label')]");
    public static final Target CATEGORIA = Target.the("categoria").
            locatedBy("//div/p[contains(@id,'Tecnología')]");
    public static final Target SUBCATEGORIA = Target.the("subcategoria").
            locatedBy("//div/a/p[contains(.,'Computadores portátiles')]");

}
