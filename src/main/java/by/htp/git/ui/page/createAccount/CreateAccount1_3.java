package by.htp.git.ui.page.createAccount;

import by.htp.git.bo.Account;
import by.htp.git.utility.Permanent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccount1_3 {

    private static final By usernameTarget = By.xpath (".//*[@id='user_login']");
    private static final By emailAddressTarget = By.xpath (".//*[@id='user_email']");
    private static final By passwordTarget = By.xpath (".//*[@id='user_password']");
    private static final By createAccountButtonTarget = By.xpath (".//*[@id='signup_button']");

    //private Account account = new Account(Permanent.LOGIN, Permanent.EMAIL, Permanent.PASSWORD);
    //private static final String page = "https://github.com/join?source=header-home";


    public CreateAccount2_3 step1 (WebDriver driver, Account account) throws InterruptedException {

        driver.get(Permanent.ACCOUNT_PAGE);

        WebElement u = driver.findElement(usernameTarget);
        u.sendKeys(account.getLogin());

        WebElement e = driver.findElement(emailAddressTarget);
        e.sendKeys(account.getEmail());

        WebElement p = driver.findElement(passwordTarget);
        p.sendKeys(account.getPassword());
        //p.sendKeys(Keys.ENTER);

        Thread.sleep(1000);
        driver.findElement(createAccountButtonTarget).click();

        return new CreateAccount2_3 ();
    }
}
