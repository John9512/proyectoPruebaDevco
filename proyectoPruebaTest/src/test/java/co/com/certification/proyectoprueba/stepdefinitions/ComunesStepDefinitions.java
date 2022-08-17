package co.com.certification.proyectoprueba.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

import static co.com.certification.proyectoprueba.tasks.cargarPagina.cargarPaginaParaCrearCuenta;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

//import static co.com.certification.proyectoprueba.tasks.cargarPagina.cargarPaginaParaCrearCuenta;
//import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class ComunesStepDefinitions {

   @Before
   public void setStage (){

       setTheStage(new OnlineCast());
       theActorCalled("usuario").wasAbleTo(
                         cargarPaginaParaCrearCuenta()
                   );
   }

    @Dado("^que el (.*) ingresa en la opcion Hazte una cuenta$")
    public void queElUsuarioIngresaEnLaOpcion(String actor) {

    }

    @Cuando("^el usuario ingresa su correo y contrasena$")
    public void elUsuarioIngresaSuCorreoYContrasena(List<Map<String,Object>> datos) {

    }

    @Entonces("^deberia ver el mensaje de creacion exitosa$")
    public void deberiaVerElMensajeDeCreacionExitosa() {

    }

}
