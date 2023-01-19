package co.com.choucair.certification.reto.exito.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class SeleccionarProducto {

    public static final Target LBLNOMBREPRODUCTO = Target.the("lbl name product").
            locatedBy("(//article//h3[contains(@class,'productNameContainer')]/span)[{0}]");

    public static final Target LBLPRODUCTO = Target.the("lbl name product").
            locatedBy("(//article)[{0}]//h3");
    public static final Target LBLPRECIOPRODUCTO = Target.the("lbl name product").
            locatedBy("(//div[contains(@class,'exito-vtex-components-4-x-selling-price flex items-center ')])[{0}]");
    public static final Target AGREGARPRODUCTOS = Target.the("add product").
            locatedBy("(//article)[{0}]//div[contains(@class,'productSummaryBuyButtonProductRich')]/button");
    public static final Target CARROCOMPRAS = Target.the("car").
            locatedBy("//a[contains(@class,'3-x-minicartLink')]");
}
