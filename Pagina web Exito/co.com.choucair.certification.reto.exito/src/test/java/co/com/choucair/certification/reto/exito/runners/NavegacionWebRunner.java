package co.com.choucair.certification.reto.exito.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/navegacionweb.feature",
        glue="co.com.choucair.certification.reto.exito.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class NavegacionWebRunner {
}
