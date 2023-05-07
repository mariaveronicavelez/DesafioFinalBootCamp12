package test;

import Page.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.PageFactory;
import Page.PageHotel;


public class tc_001_hoteles  {

    WebDriver driver;

    HomePage homepage;
    PageHotel pageHotel;

    protected PageHotel paginaHotel;

    @BeforeAll
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setupTest() {
        driver = new ChromeDriver();
        PageFactory.initElements(driver, this);
        driver.get("https://www.rumbo.es/");
        driver.manage().window().maximize();
    }


    @AfterEach
    void teardown() throws InterruptedException {
        // driver.quit();
    }



    @Test
    public void Test() throws InterruptedException {
        paginaHotel = new PageHotel(driver);


        homepage = new HomePage(driver);

        paginaHotel.aceptar();
        paginaHotel.SeleccionarOpcionHoteles();
        paginaHotel.textdestino();
        paginaHotel.ingresDestino();
        paginaHotel.primeraOpcion();
//        Thread.sleep(5000);
        paginaHotel.seleccionFechaEntrada();
        paginaHotel.seleccionFechaSalida();
        paginaHotel.cantidadHuesped();
        paginaHotel.lupa();
        Thread.sleep(5000);

//        paginaHotel.ValidarText();
        paginaHotel.todosLosFiltros();
        Thread.sleep(5000);
        paginaHotel.cerrarfiltros();
//        paginaHotel.filtroEstrellas();
//        paginaHotel.cantidadHuesped();
//        paginaHotel.AplicarFiltro();

    }
}
