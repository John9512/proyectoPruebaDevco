package co.com.certification.proyectoprueba.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AlojamientoPage {
    public static final Target LABEL_DESTINO = Target.the("campo para ingresar el destino del viaje").
            located(By.xpath("//label/input[contains(@aria-label,'destino')]"));

    public static final Target LABEL_FECHA_INICIO = Target.the("campo para que abra las opciones de fecha").
            located(By.xpath("//div[contains(@class,'xp__dates-inner')]"));
    public static final Target FECHA = Target.the("campo para seleccionar fecha de la tabla").
                //locatedBy("//td/span[contains(@aria-label,'{0}')]");
                        locatedBy("//td[@data-date = '{0}']");


    public static final Target LABEL_PERSONAS = Target.the("campo para apertura de menú para opciones de persoas").
            located(By.xpath("//label[contains(@id,'xp__guests__toggle')]"));

}


