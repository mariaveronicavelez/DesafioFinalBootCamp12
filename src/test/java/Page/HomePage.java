package Page;

import Base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends SeleniumBase {

    public HomePage(WebDriver driver) {
        super(driver);

        By btnTrenes = By.linkText("Trenes");




    }
}
