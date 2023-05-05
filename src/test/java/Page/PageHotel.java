package Page;

import Base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageHotel extends SeleniumBase {
    public PageHotel(WebDriver driver) {
        super(driver);
    }

    By btnHotel = By.xpath("//div[@class='d-1ytebqy e10w470p3']//a[.='Hoteles']");
    By btnBuscarAlojamiento = By.xpath("//*[@id=\":R8qjalalaqlql2m:\"]");
    By FechaDeEntrada = By.xpath("//button[@aria-label='Fecha de entrada' and span/text()='lun, 8 may']");
    By FechaDeSalida = By.xpath("//button[@aria-label='Fecha de salida' and span/text()='dom, 28 may']");
    By PersonasHabitaciones = By.xpath("//button[@class='d-1rd1vwn']");
    By btnBuscar = By.xpath("//button[@class='d-1jmk4ql']");
    By btnEstrllas = By.xpath("//div[@id='Pill-StarsContainer']");
    By btnAplicar = By.xpath("//div[@class='sc-eZYOHW khSA-dJ']");


    public void Seleccionar_btnHotel () {

        clickear(btnHotel);

    }


    public void BuscarAlojamieto (){
        escribir("Roma, Italia", btnBuscarAlojamiento);
    }
    public void SeleccionaFechaDeEntrada () {
        clickear(FechaDeEntrada);

    }

    public void SeleccionarFechaDeSalida () {
        clickear(FechaDeSalida);
    }

    public void SeleccionarPersonasHabitaciones () {
        clickear(PersonasHabitaciones);
    }

    public void SeleccionarbtnBuscar () {
        clickear(btnBuscar);
    }

    public void SeleccionarbtnEstrllas () {
        clickear(btnEstrllas);
    }

    public void SeleccionarbtnAplicar () {
        clickear(btnAplicar);
    }














}