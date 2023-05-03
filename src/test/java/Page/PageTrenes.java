package Page;

import Base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageTrenes extends SeleniumBase {
    public PageTrenes(WebDriver driver) {
        super(driver);

        By btnIda = By.xpath("//div[contains(text(),'Solo ida')]");
        By btnIdayVuelta = By.xpath("//div[contains(text(),'Ida y vuelta')]");
        By Origen = By.xpath("//input[@id=':Rmhl6lalaqlql2m:']");
        By Destino = By.xpath("//input[@id=':Rqhl6lalaqlql2m:']");
        By FechadeIda = By.className("d-aziqil");
        By numeroida = By.className("d-1z9ad3");
        By numerovuelta = By.className("d-1dj49va");
        By FechadeVuelta = By.className("d-15np3tn ed5mks92");
        By Pasajero = By.className("d-1rd1vwn");



    }
}
