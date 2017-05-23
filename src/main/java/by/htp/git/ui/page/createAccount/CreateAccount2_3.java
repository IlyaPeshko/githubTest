package by.htp.git.ui.page.createAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccount2_3 {
    private static final By continueButtonTarget = By.xpath(".//*[@class='btn btn-primary js-choose-plan-submit']");

    public CreateAccount3_3 step2 (WebDriver driver){

        driver.findElement(continueButtonTarget).click();
        return new CreateAccount3_3();
    }


}
