package Page;
import Base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import javax.xml.xpath.XPath;

public class PageHotel extends SeleniumBase {
    public PageHotel(WebDriver driver) {super(driver);
    }

//    XPath
    By btnHoteles = By.xpath("//div[@class='d-1ytebqy e10w470p3']//a[.='Hoteles']");
    By fecha = By.xpath("//span[.='lun, 8 may']");
    By fecha17 = By.xpath(" //div[@class='d-mog2ng']/div[2]//button[.='17']");
    By btnlupa = By.xpath("//button[@class='d-1jmk4ql']");

    By btnAceptarTodo = By.xpath("//button[@class='iubenda-cs-accept-btn iubenda-cs-btn-primary']");

   By destino = By.xpath("//input[@class='d-1o7da3w ed5mks91']");

    By primeraOP = By.cssSelector("[data-option-index='0']");
    By fecha31 = By.xpath("//button[.='31']");
    By iconoagregarhuspeded = By.xpath("//div[@class='d-1ea2lc2']/button[2]");

    By afuera = By.xpath("//div[@class='MuiBackdrop-root MuiBackdrop-invisible d-1my3fkn']");

    By Estrella = By.xpath("//ul[@id='lb_list_hotel_stars']/li[@class='styled__LiContainer-sc-1v4e66q-0 leObzb focused whith-label two-columns']//div[@class='sc-cyRfQX fxQeqI']");
    By SelectFiltro = By.xpath("//li[@class='styled__LiContainer-sc-1v4e66q-0 leObzb focused whith-label']");
    By btnAplicar = By.xpath("//ul[@id='lb_list_hotel_stars']/li[@class='styled__LiContainer-sc-1v4e66q-0 leObzb focused whith-label two-columns']//div[@class='sc-cyRfQX fxQeqI']\n");

    By Mensaje = By.xpath("//div[@class='sc-fGFwAa ljuqoA']");

    By btntodoslosfiltros = By.xpath("//div[@id='Pill-undefined']");

    By cerrarPrecio = By.xpath("//div[@id='PriceContainer']/div[@class='styled__ContainerLabel-sc-sugfyn-1 fmYqDG container-label']");
    By cerrarTipoAlojamiento = By.xpath("//div[@id='PropertyTypeContainer']/div[@class='styled__ContainerLabel-sc-sugfyn-1 fmYqDG container-label']");
    By cerrarNombreAlojamiento = By.xpath("//div[@id='PropertyTypeContainer']/div[@class='styled__ContainerLabel-sc-sugfyn-1 fmYqDG container-label']");


//    Metodos/Steps

    public void aceptar() {clickear(btnAceptarTodo);}
    public void SeleccionarOpcionHoteles() {clickear(btnHoteles);}
    public void textdestino() { clickear(destino);}
    public void ingresDestino() { escribir("roma", destino);}
    public void primeraOpcion() { clickear(primeraOP);}
    public void seleccionFechaEntrada() {clickear(fecha17);}
    public void seleccionFechaSalida() {clickear(fecha31);}
    public void cantidadHuesped(){clickear(iconoagregarhuspeded);clickear(afuera);}
    public void lupa() {clickear(btnlupa);}

    public void ValidarText() {
        validacionText(Mensaje, "Alojamientos en Roma");
    }

    public void todosLosFiltros() {clickear(btntodoslosfiltros);}
    public void cerrarfiltros()throws InterruptedException {
        clickear(cerrarPrecio);
        Thread.sleep(2000);
        clickear(cerrarTipoAlojamiento);
        Thread.sleep(2000);
        clickear(cerrarNombreAlojamiento);
        Thread.sleep(2000);
        clickear(Estrella);
        Thread.sleep(2000);
        clickear(btnAplicar);
    }


//    public void filtroEstrellas() {clickear(btnlupa);}
//    public void CantidadEstrellas() {clickear(btnlupa);}
//    public void AplicarFiltro() {clickear(btnlupa);}


}