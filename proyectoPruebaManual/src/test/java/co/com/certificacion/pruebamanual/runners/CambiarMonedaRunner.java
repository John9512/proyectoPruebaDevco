package co.com.certificacion.pruebamanual.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/cambiar_moneda.feature",
        glue = "co.com.certificacion.pruebamanual.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class CambiarMonedaRunner {
}
