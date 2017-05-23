package by.htp.git.ui.page.createAccount;

import by.htp.git.utility.Pairwise.entitty.Pair;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccount3_3 {
    private static final By submitButton = By.xpath(".//*[@class='btn btn-primary']");

    public void step3 (WebDriver driver){

        driver.findElement(submitButton).click();
    }

    public void step3_pairwise (WebDriver driver, Pair pair){
        driver.findElement(pair.getPair_1().getBy()).click();
        driver.findElement(pair.getPair_2().getBy()).click();
        driver.findElement(pair.getPair_3().getBy()).click();

        driver.findElement(submitButton).click();
    }

}
