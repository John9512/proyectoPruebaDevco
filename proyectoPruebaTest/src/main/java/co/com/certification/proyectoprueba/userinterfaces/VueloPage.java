package co.com.certification.proyectoprueba.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class VueloPage {

    public static final Target SELECT_TIPO = Target.the("campo para seleccionar el tipo de vuelo a viajar").
            locatedBy("//div/select/option[@value='{0}']");
    public static final Target LBL_PERSONAS = Target.the("select para que aparezca el menú de cantidad personas").
            located(By.xpath("//div[@data-testid=\"input_occupancy_desktop_passengers_trigger\"]"));
    public static final Target LABEL_ADULTOS = Target.the("label para conocer el número de adultos a reservar").
            located(By.xpath("((//div[@class=\"css-1uzx2ul\"])[1]"));
    public static final Target FLECHA_ADULTOS = Target.the("flecha para avanzar en número de adultos a reservar").
            located(By.xpath("(//button[contains(@data-testid,\"adults\")])[2]"));
    public static final Target LABEL_NINOS = Target.the("label para conocer el número de niños a reservar").
            located(By.xpath("(//div[@class=\"css-1uzx2ul\"])[2 ]"));
    public static final Target FLECHA_NINOS = Target.the("flecha para avanzar en número de niños a reservar").
            located(By.xpath("(//button[contains(@data-testid,\"children\")])[2]"));
    public static final Target BTN_LISTO = Target.the("botón para ingresar la cantidad de personas a viajar").
            located(By.xpath("//button[contains(@data-testid,\"desktop_done\")]"));
    public static final Target BTN_ORIGEN = Target.the("campo para que aparezca input de origen").
            located(By.xpath(" //div[contains(@class,\"css-k008qs\")]"));
    public static final Target LABEL_ORIGEN = Target.the("campo para ingresar la ciudad de origen").
            located(By.xpath("//div/input[contains(@data-testid,\"origin_input\")]"));
    public static final Target LABEL_DESTINO = Target.the("campo para ingresar la ciudad de destino").
            located(By.xpath("//div/input[contains(@class,\"SearchboxInput\")]"));
    public static final Target LABEL_FECHA_INICIO_VUELO = Target.the("campo para que aparezca el menú fechas").
            located(By.xpath("//button/div[contains(@data-testid,\"desktop_calendar\")]"));
    public static final Target FECHA_VUELO = Target.the("campo para seleccionar fecha de la tabla").
            locatedBy("//span/span[@data-date-cell='{0}']");
    public static final Target FLECHA_MES_VUELO = Target.the("flecha para avanzar en meses de calendario").
            located(By.xpath("//button[contains(@class,'Calendar-module__control--next')]"));
    public static final Target BOTON_BUSCAR_VUELO = Target.the("botón para ingresar a buscar vuelos").
            located(By.xpath("//button[contains(@class,'Calendar-module__control--next')]"));





}
