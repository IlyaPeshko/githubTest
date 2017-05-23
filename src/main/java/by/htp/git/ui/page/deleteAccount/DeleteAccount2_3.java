package by.htp.git.ui.page.deleteAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteAccount2_3 {
    private static final By accountTarget = By.xpath(".//*[@class='js-selected-navigation-item menu-item'][1]");

    public DeleteAccount3_3 step2 (WebDriver driver) {
            driver.findElement(accountTarget).click();
        return new DeleteAccount3_3 ();
    }
}
