package Page;


import Base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageVuelos extends SeleniumBase{
    public PageVuelos(WebDriver driver) {
        super(driver);
    }

    //Mejor vuelo
    By btnMasBarato = By.xpath("//*[@id=\'top-listing-container\']/div[10]/div/ul/li[2]");
    By btnElMejor = By.xpath("//*[@id=\'top-listing-container\']/div[10]/div/ul/li[1]");

    //Funciones

    public void PresionarMasBarato(){
        clickear(btnMasBarato);
    }

    public void PresionarElMejor(){
        clickear(btnElMejor);
    }



}