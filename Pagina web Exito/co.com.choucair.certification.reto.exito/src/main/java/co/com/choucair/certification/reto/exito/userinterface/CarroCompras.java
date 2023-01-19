package co.com.choucair.certification.reto.exito.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class CarroCompras {

    public static final Target LBLNOMBREPRODUCTO = Target.the("lbl producto nombre").
            locatedBy("(//td[contains(@class,'product-name')]//a[contains(@class,'exito-checkout-product-name')])[1]");

    public static final Target LBLNOMBREPRODUCTOCARRO = Target.the("lbl producto nombre carro").
            locatedBy("(//tr[contains(@class,'product-item')]//td/a[contains(@class,'exito-checkout-product-name')])[{0}]");

    public static final Target LBLPRECIOPRODUCTOCARRO = Target.the("lbl producto nombre carro").
            locatedBy("(//td[contains(@class,'quantity-price')]//span[contains(@class,'total-selling-price')])[{0}]");

    public static final Target LBLPRECIOPRODUCTO = Target.the("lbl producto precio").
            locatedBy("(//td[contains(@class,'quantity-price')]//span[contains(@class,'total-selling-price')])[1]");

    public static final Target TOTALPRODUCTOS = Target.the("lbl total productos").
            locatedBy("//div[contains(@class,'totalItems')]");



}
