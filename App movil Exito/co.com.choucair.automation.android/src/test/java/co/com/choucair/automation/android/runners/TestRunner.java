package co.com.choucair.automation.android.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/login.feature",
        tags = "@Login",
        glue = "co.com.choucair.automation.android.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class TestRunner {
}
