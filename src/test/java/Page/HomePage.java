package Page;

import Base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends SeleniumBase {

    public HomePage(WebDriver driver) {
        super(driver);
    }
        By btnTrenes = By.linkText("Trenes");
        By btnVuelos = By.xpath("\"//div[@class='d-1ytebqy e10w470p3']//a[.='Vuelos']\"");
        By btnHotel = By.xpath("\"//div[@class='d-1ytebqy e10w470p3']//a[.='Hoteles']\"");
        By btnIdayVuelta = By.xpath("//div[@class='d-vfn33k']");
        By Origen = By.xpath("//input[@class='d-1o7da3w ed5mks91']");
        By Destino = By.xpath("//fieldset[@class='d-1kq2bom']/div[3]//input[@class='d-1o7da3w ed5mks91']");
        By btnFechaIda = By.xpath("//label[.='Fecha de ida']");
        By btnFechaVuelta = By.xpath("//label[.='Fecha de vuelta']");
        By numeroDePasajeros = By.xpath("//label[.='Pasajero']");
        By addAdultos = By.xpath("//label[.='Pasajero']");
        By addNinios = By.xpath("//li[.='6 años']");
        By addBebes = By.xpath(" //li[.='Bebé, 0-11 meses']");
        By btnBusqueda = By.xpath("//button[@class='d-1jmk4ql']");

        //Funciones

        public void SeleccionarOpcionTrenes (){
            clickear(btnTrenes);
        }





    }

