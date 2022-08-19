package co.com.certification.proyectoprueba.taks.alojamiento;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebElement;

import static co.com.certification.proyectoprueba.models.cargardatos.DatosPrueba.obtener;
import static co.com.certification.proyectoprueba.userinterfaces.AlojamientoPage.*;
import static co.com.certification.proyectoprueba.utils.constantes.Constantes.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ReservarAlojamiento implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LABEL_DESTINO),
                Type.theValue(obtener(DESTINO)).into(LABEL_DESTINO),
                Click.on(LABEL_FECHA_INICIO),
                WaitUntil.the(FECHA, WebElementStateMatchers.isVisible()).forNoMoreThan(9).seconds(),
                Click.on(FECHA.of(obtener(FECHA_INICIAL))),
                Click.on(FECHA.of(obtener(FECHA_FINAL)))

        );
    }

    public static ReservarAlojamiento sinNinos(){
        return instrumented(ReservarAlojamiento.class);
    }
}
