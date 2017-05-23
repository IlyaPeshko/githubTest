package by.htp.git.ui.page.deleteAccount;

import by.htp.git.bo.Account;
import by.htp.git.utility.Permanent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class DeleteAccount3_3 {
    private static final By deleteAccountButtonTarget = By.xpath(".//*[@class='btn btn-danger']");
    private static final By userNameTarget = By.xpath(".//*[@id='sudo_login']");
    private static final By buttonTarget = By.xpath(".//*[@id='delete_account_confirmation']/form/button");
    private static final By confirmationTarget = By.xpath(".//*[@id='confirmation_phrase']");

    private static final String confirmationText = "delete my account";
    private static final String exScript = "document.getElementById('delete_account_confirmation').style.display='block';";

    private Account account = new Account(Permanent.LOGIN);

    public void step3 (WebDriver driver) {
        driver.findElement(deleteAccountButtonTarget).click();

        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript(exScript);

        driver.findElement(userNameTarget).sendKeys(account.getLogin());
        driver.findElement(confirmationTarget).sendKeys(confirmationText);
        driver.findElement(buttonTarget).submit();
    }
}
