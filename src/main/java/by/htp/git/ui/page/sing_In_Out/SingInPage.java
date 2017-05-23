package by.htp.git.ui.page.sing_In_Out;

import by.htp.git.utility.Permanent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SingInPage {
    private static final By loginTarget = By.xpath(".//*[@id='login_field']");
    private static final By passwordTarget = By.xpath(".//*[@id='password']");
    private static final By buttonTarget = By.xpath(".//*[@class='btn btn-primary btn-block']");

    public Object singIn (WebDriver driver){

        driver.findElement(loginTarget).sendKeys(Permanent.LOGIN);
        driver.findElement(passwordTarget).sendKeys(Permanent.PASSWORD);
        driver.findElement(buttonTarget).click();

        return new Object();
    }
}
