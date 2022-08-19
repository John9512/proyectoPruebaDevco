package co.com.certification.proyectoprueba.questions.vuelo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.certification.proyectoprueba.models.cargardatos.DatosPrueba.getMap;
import static co.com.certification.proyectoprueba.userinterfaces.AlojamientoPage.LABEL_BUSQUEDA_COMPLETA;

public class verificarBusquedaVuelo implements Question<Boolean> {
    public static verificarBusquedaVuelo vuelo()  {
        return new verificarBusquedaVuelo();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String resultadoEsperado = getMap().get("destino").toString().trim();
        String resultadoObtenido = LABEL_BUSQUEDA_COMPLETA.resolveFor(actor).getText();
        return resultadoObtenido.contains(resultadoEsperado);
    }

}
