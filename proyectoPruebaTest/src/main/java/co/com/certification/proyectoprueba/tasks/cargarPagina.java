package co.com.certification.proyectoprueba.tasks;

import co.com.certification.proyectoprueba.userinterfaces.BookingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class cargarPagina implements Task {
    private BookingPage bookingPage;

    public static cargarPagina cargarPaginaParaCrearCuenta (){
        return instrumented(cargarPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(bookingPage));

    }
}
