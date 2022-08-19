package co.com.certification.proyectoprueba.stepdefinitions;

import co.com.certification.proyectoprueba.exceptions.creacionFallida;
import co.com.certification.proyectoprueba.questions.creacion.verificarFlujoExitoso;
import co.com.certification.proyectoprueba.taks.alojamiento.ReservarAlojamiento;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static co.com.certification.proyectoprueba.exceptions.creacionFallida.CREACION_FALLIDA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AlojamientoStepDefinition {

    @Cuando("^el usuario ingresa el destino, fecha y personas a viajar$")
    public void elUsuarioIngresaElDestinoFechaYPersonasAViajar() {
        theActorInTheSpotlight().attemptsTo(ReservarAlojamiento.sinNinos());

    }

    @Entonces("^deberia mirar el resultado de la busqueda$")
    public void LaAutenticacionDeberiaSerExitosa() {
        theActorInTheSpotlight().should(seeThat(verificarFlujoExitoso.creacionCuenta()).orComplainWith(creacionFallida.class, CREACION_FALLIDA));
    }
}
