package co.com.certification.proyectoprueba.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/crear_cuenta_de_usuario.feature",
        //tags = "@tag1",
        glue = "co.com.certification.proyectoprueba.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class CrearCuentaDeUsuario {
}
