package co.com.choucair.certification.reto.exito.tasks;

import co.com.choucair.certification.reto.exito.userinterface.CarroCompras;
import co.com.choucair.certification.reto.exito.userinterface.SeleccionarProducto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.springframework.validation.beanvalidation.SpringValidatorAdapter;

import java.util.ArrayList;
import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarPorductosCarroTask implements Task {

    private String cantidad;

    public SeleccionarPorductosCarroTask(String cantidad){
        this.cantidad = cantidad;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        List<String> nombresProductosCarro = new ArrayList<>();
        List<String> preciosProductosCarro = new ArrayList<>();
        for (int i=1; i<=Integer.parseInt(cantidad); i++) {
            String productocarro = CarroCompras.LBLNOMBREPRODUCTOCARRO.of(String.valueOf(i)).resolveFor(actor).getText();
            nombresProductosCarro.add(productocarro);
            String preciocarro = CarroCompras.LBLPRECIOPRODUCTOCARRO.of(String.valueOf(i)).resolveFor(actor).getText();
            preciosProductosCarro.add(preciocarro);
        }
        String cantidadProductos = CarroCompras.TOTALPRODUCTOS.resolveFor(actor).getText();

        System.out.println("***Lista de productos carro de compras: " + nombresProductosCarro);
        System.out.println("***Precios de productos carro de compras: " + preciosProductosCarro);
        System.out.println("***Cantidad de productos en el carrito: " + cantidadProductos);
        actor.remember("nombre de productos carro de compras", nombresProductosCarro);
        actor.remember("precios de productos carro de compras", preciosProductosCarro);
        actor.remember("cantidad de productos carro de compras", cantidadProductos);

    }
    public static SeleccionarPorductosCarroTask seleccionarproductos(String cantidad) {
        return instrumented(SeleccionarPorductosCarroTask.class,cantidad);
    }
}
