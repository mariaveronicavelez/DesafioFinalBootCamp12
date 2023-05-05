package Page;

import Base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageHotel extends SeleniumBase {
    public PageHotel(WebDriver driver) {
        super(driver);

        By btnhoteles1 = By.xpath("//div[@class='d-1ytebqy e10w470p3']//a[.='Hoteles']");
        By btnBuscarAlojamiento = By.xpath("//*[@id=\":R8qjalalaqlql2m:\"]");
        By FechaDeEntrada = By.xpath("//button[@class='d-i9zc7t']");
        By FechaDeSalida = By.xpath("//button[@class='d-i9zc7t']");
        By PersonasHabitaciones = By.xpath("//button[@class='d-1rd1vwn']");
        By btnBuscar = By.xpath("//button[@class='d-1jmk4ql']");
        By btnEstrllas = By.xpath("//div[@id='Pill-StarsContainer']");
        By btnAplicar = By.xpath("//div[@class='sc-eZYOHW khSA-dJ']");


    }
}