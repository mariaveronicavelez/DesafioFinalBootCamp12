package Page;

import Base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PagePasajes extends SeleniumBase {
    public PagePasajes(WebDriver driver) {
        super(driver);
    }
    By btnmasbarato = By.className("Tabs__ListElement-cncr__sc-61rlvo-1 iPjVHz");
    By btnmasrapido = By.className("Tabs__ListElement-cncr__sc-61rlvo-1 ezUVfc");
    By pasaje = By.className("FullTripCard__SelectedPriceContainer-sc-z8znd4-4 cbaIot");

    //Funciones

    public void seleccionarMasBarato(){
        clickear(btnmasbarato);
    }

    public void seleccionarMasRapido(){
        clickear(btnmasrapido);
    }

    public void seleccionarPasaje(){
        clickear(pasaje);
    }

    }

