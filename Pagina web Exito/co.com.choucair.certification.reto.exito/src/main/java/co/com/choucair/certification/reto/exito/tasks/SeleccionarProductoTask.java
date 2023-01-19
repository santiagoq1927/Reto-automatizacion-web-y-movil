package co.com.choucair.certification.reto.exito.tasks;
import co.com.choucair.certification.reto.exito.userinterface.SeleccionarProducto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class SeleccionarProductoTask implements Task {

    private String cantidad;

    public SeleccionarProductoTask(String cantidad){
        this.cantidad = cantidad;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        List<String> nombresProductos = new ArrayList<>();
        List<String> preciosProductos = new ArrayList<>();
        for (int i=1; i<=Integer.parseInt(cantidad); i++) {
            actor.attemptsTo(
                    WaitUntil.the(SeleccionarProducto.AGREGARPRODUCTOS.of(String.valueOf(i)), isClickable()).forNoMoreThan(5).seconds(),
                    Click.on(SeleccionarProducto.AGREGARPRODUCTOS.of(String.valueOf(i)))
            );
            String producto = SeleccionarProducto.LBLPRODUCTO.of(String.valueOf(i)).resolveFor(actor).getText();
            nombresProductos.add(producto);
            String precio = SeleccionarProducto.LBLPRECIOPRODUCTO.of(String.valueOf(i)).resolveFor(actor).getText();
            preciosProductos.add(precio);
        }
        String cantidadProd = cantidad.toString().concat(" Productos");
        actor.attemptsTo(Click.on(SeleccionarProducto.CARROCOMPRAS));
        System.out.println("***Lista de productos: " + nombresProductos);System.out.println("***Precio de productos: " + preciosProductos);System.out.println("***Cantidad de productos seleccionado: " + cantidadProd);
        actor.remember("nombre de productos", nombresProductos);actor.remember("precio de productos", preciosProductos);actor.remember("cantidad de productos", cantidadProd);
    }

    public static SeleccionarProductoTask seleccionproductos(String cantidad) {
        return instrumented(SeleccionarProductoTask.class,cantidad);
    }
}
