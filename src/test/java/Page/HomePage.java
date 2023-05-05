package Page;

import Base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends SeleniumBase {

    public HomePage(WebDriver driver) {
        super(driver);
    }
        By btnTrenes = By.linkText("Trenes");
        By btnHotel = By.xpath("\"//div[@class='d-1ytebqy e10w470p3']//a[.='Hoteles']\"");
        By Origen = By.xpath("//*[@id=\':Riqed6lalallbla2m:\']");
        By Destino = By.xpath("//*[@id=\':Rjaed6lalallbla2m:\']");
        By btnFechaIda = By.xpath("//label[.='Fecha de ida']");
        By numeroIda = By.xpath("//button[@class='d-1z9ad3']");
        By btnBusqueda = By.xpath("//button[@class='d-1jmk4ql']");
        By btnSoloIda = By.xpath("//div[contains(text(),'Solo ida')]");

        By btnAceptarTodo = By.xpath("//button[@class='iubenda-cs-accept-btn iubenda-cs-btn-primary']");

        //Funciones

    //////////////////T////////////////////////////
        public void SeleccionarOpcionTrenes (){
            clickear(btnTrenes);
            espera();
        }

        public void ApretarbtnAceptartodo(){
            clickear(btnAceptarTodo);
        }
        //////////////////V////////////////////////////

        public void ColocarOrigen (){
            escribir("Madrid (MAD) - Adolfo Suárez Barajas, España",Origen);
            clickear(Origen);
        }

        public void ColocarDestino (){
            escribir("Barcelona (BCN) - Todos los aeropuertos, España",Destino);
            clickear(Destino);
        }

        public void ColocarFechaIda(){
            clickear(btnFechaIda);
            clickear(numeroIda);

        }

        public void ApretarBotonBusqueda(){
          clickear(btnBusqueda);
        }

        public void ApretarbtnIda(){
            espera();
            clickear(btnSoloIda);
            espera();
        }





    }

