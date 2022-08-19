package co.com.certification.proyectoprueba.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.certification.proyectoprueba.models.cargardatos.DatosPrueba.obtener;
import static co.com.certification.proyectoprueba.userinterfaces.AlojamientoPage.FECHA;
import static co.com.certification.proyectoprueba.userinterfaces.AlojamientoPage.FLECHA_MES;
import static co.com.certification.proyectoprueba.utils.constantes.Constantes.FECHA_FINAL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class avanzar implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        while (!(FECHA.of(obtener(FECHA_FINAL))).resolveFor(actor).isPresent()){
            actor.attemptsTo(
                    Click.on(FLECHA_MES)
            );
        }

    }
    public static avanzar tablaMes() {
        return instrumented(avanzar.class);
    }

}
