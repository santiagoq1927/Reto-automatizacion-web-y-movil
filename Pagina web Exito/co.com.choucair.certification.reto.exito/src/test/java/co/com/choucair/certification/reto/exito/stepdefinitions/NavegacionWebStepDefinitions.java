package co.com.choucair.certification.reto.exito.stepdefinitions;
import co.com.choucair.certification.reto.exito.questions.ValidarCantidadProductos;
import co.com.choucair.certification.reto.exito.questions.ValidarPrecioProductos;
import co.com.choucair.certification.reto.exito.questions.ValidarProductos;
import co.com.choucair.certification.reto.exito.questions.VerificarProductos;
import co.com.choucair.certification.reto.exito.tasks.NavegacionWebTask;
import co.com.choucair.certification.reto.exito.tasks.SeleccionarPorductosCarroTask;
import co.com.choucair.certification.reto.exito.tasks.SeleccionarProductoTask;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class NavegacionWebStepDefinitions {

    @Managed(driver ="chrome")
    WebDriver driver;

    @Before
    public void setThestage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("David");
    }

    @Dado("^que un usuario navega por las categorias de la pagina web del exito$")
    public void queUnUsuarioNavegaPorLasCategoriasDeLaPaginaWebDelExito() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.exito.com/"));
        theActorInTheSpotlight().wasAbleTo(NavegacionWebTask.navegarPagina());
    }

    @Cuando("^agrega al carro de compras (.*) productos$")
    public void agregaAlCarroDeComprasProductos(String cantidad)  {
        theActorInTheSpotlight().wasAbleTo(
                SeleccionarProductoTask.seleccionproductos(cantidad),
                SeleccionarPorductosCarroTask.seleccionarproductos(cantidad)
        );
    }

    @Entonces("^estos se ven reflejados al seleccionar el carro de compras$")
    public void estosSeVenReflejadosAlSeleccionarElCarroDeCompras()  {
        theActorInTheSpotlight().should(
                seeThat("Verificar productos carrito", ValidarProductos.validarProductosCarro(), equalTo(theActorInTheSpotlight().recall("nombre de productos"))),
                seeThat("Verificar precio productos carrito", ValidarPrecioProductos.validarPrecioProductosCarro(), equalTo(theActorInTheSpotlight().recall("precio de productos"))),
                seeThat("Verificar cantidad productos carrito", ValidarCantidadProductos.validarCantidadProductosCarro(), equalTo(theActorInTheSpotlight().recall("cantidad de productos")))
        );
    }

}
