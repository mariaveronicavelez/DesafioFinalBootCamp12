package Page;

import Base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends SeleniumBase {

    public HomePage(WebDriver driver) {
        super(driver);
    }
<<<<<<< HEAD
        By btnTrenes = By.linkText("Trenes");
        By btnHoteles = By.xpath("\"//div[@class='d-1ytebqy e10w470p3']//a[.='Hoteles']\"");
        By Origen = By.xpath("//*[@id=\':Riqed6lalallbla2m:\']");
        By Destino = By.xpath("//*[@id=\':Rjaed6lalallbla2m:\']");
        By btnFechaIda = By.xpath("//label[.='Fecha de ida']");
        By numeroIda = By.xpath("//button[@class='d-1z9ad3']");
        By btnBusqueda = By.xpath("//button[@class='d-1jmk4ql']");
        By btnSoloIda = By.xpath("//div[contains(text(),'Solo ida')]");
=======
    By btnTrenes = By.linkText("Trenes");
    By btnHotel = By.xpath("\"//div[@class='d-1ytebqy e10w470p3']//a[.='Hoteles']\"");
    By Origen = By.xpath("//*[@id=\':Riqed6lalallbla2m:\']");
    By Aeropuerto=By.cssSelector("[data-option-index='0'] .d-1qlfm87");
    By Destino = By.xpath("//*[@id=\':Rjaed6lalallbla2m:\']");
>>>>>>> d3227f805219f662d10a5b4bf77be65e9ea50fa7

    By AnadirHotel= By.xpath("//label[contains(text(),'Añadir un hotel')]");

    By Error=By.xpath("//span[contains(text(),'Introduce ciudad o aeropuerto de destino')]");

    By Aeropuerto2= By.xpath("//span[.='Barcelona (BCN) - El Prat']");

    By btnFechaIda = By.xpath("//div[@class='d-15np3tn ed5mks92']");
    By numeroIda = By.xpath("//button[@class='d-1z9ad3']");
    By btnBusqueda = By.xpath("//button[@class='d-1jmk4ql']");
    By btnSoloIda = By.xpath("//div[contains(text(),'Solo ida')]");

    By btnPasajeros= By.xpath("//button[@class='d-1rd1vwn']");

    By BtnCruz=By.xpath("//button[@class='d-1nmp0nm ed5mks90']");

    By btnAceptarTodo = By.xpath("//button[@class='iubenda-cs-accept-btn iubenda-cs-btn-primary']");

    //Funciones

    //////////////////T////////////////////////////
<<<<<<< HEAD

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

       public void SeleccionarOpcionTrenes (){
        clickear(btnTrenes);
        espera();
        }
=======
    public void SeleccionarOpcionTrenes (){
        clickear(btnTrenes);
        espera();
    }

    public void ApretarbtnAceptartodo(){
        clickear(btnAceptarTodo);
    }
    //////////////////V////////////////////////////

    public void ColocarOrigen (){
        clickear(BtnCruz);
        escribir("Madrid",Origen);
        espera();
        scroll(Aeropuerto);
        clickear(Aeropuerto);
    }
>>>>>>> d3227f805219f662d10a5b4bf77be65e9ea50fa7

    public void ColocarDestino (){
        escribir("Barcelona",Destino);
        espera();
        scroll(Aeropuerto2);
        clickear(Aeropuerto2);
    }

    public void ColocarFechaIda(){
        clickear(btnFechaIda);
        espera();

    }


    public void ApretarBotonBusqueda(){
        clickear(btnBusqueda);
    }

    public void ApretarbtnIda(){
        espera();
        clickear(btnSoloIda);
        espera();
    }

    public void seVisualizaElError(){
        estaDesplegado(Error);
    }





}
