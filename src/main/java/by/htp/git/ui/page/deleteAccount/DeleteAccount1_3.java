package by.htp.git.ui.page.deleteAccount;

import by.htp.git.utility.Permanent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteAccount1_3 {

    private static final By dropDownMenuTarget = By.xpath (".//*[@id='user-links']/li[3]/a/img");
    private static final By profileButtonTarget = By.xpath(".//*[@id='user-links']/li[3]/div/div/a[5]");

    public DeleteAccount2_3 step1 (WebDriver driver) {

        driver.get(Permanent.INDEX_PAGE);
        driver.findElement(dropDownMenuTarget).click();
        driver.findElement(profileButtonTarget).click();

        return new DeleteAccount2_3();
    }
}
