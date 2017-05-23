
import by.htp.git.bo.Account;
import by.htp.git.ui.page.createAccount.CreateAccount1_3;

import by.htp.git.ui.page.deleteAccount.DeleteAccount1_3;
import by.htp.git.utility.Pairwise.Pairwise;
import by.htp.git.utility.Pairwise.entitty.Pair;
import by.htp.git.utility.Permanent;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.List;

public class CreateAccountTest extends BaseTest {

    private CreateAccount1_3 createAccount = new CreateAccount1_3();
    private DeleteAccount1_3 deleteAccount = new DeleteAccount1_3();

    private static final By result = By.xpath(".//*[@class='shelf-title']");
    private static final String expectedResult = "Learn Git and GitHub without any code!";

    private static final By resultNegative = By.xpath(".//*[@class='flash flash-error my-3']");
    private static final String expectedResultNegative = "There were problems creating your account.";

    private Account account = new Account(Permanent.LOGIN, Permanent.EMAIL, Permanent.PASSWORD);
    private Account account_underscore = new Account(Permanent.LOGIN_SYMBOL_UNDERSCORE, Permanent.EMAIL, Permanent.PASSWORD);
    private Account account_sql = new Account(Permanent.LOGIN_SYMBOL_SQO, Permanent.EMAIL, Permanent.PASSWORD);
    private Account account_rus = new Account(Permanent.LOGIN_SYMBOL_RUS, Permanent.EMAIL, Permanent.PASSWORD);
    private Account account_max = new Account(Permanent.LOGIN_SYMBOL_MAX, Permanent.EMAIL, Permanent.PASSWORD);
    private Account account_min = new Account(Permanent.LOGIN_SYMBOL_MIN, Permanent.EMAIL, Permanent.PASSWORD);
    private Account account_symbol = new Account(Permanent.LOGIN_SYMBOL, Permanent.EMAIL, Permanent.PASSWORD);

    @Test
    private void test () throws InterruptedException {

        createAccount.
                step1(driver, account).
                step2(driver).
                step3(driver);

        Assert.assertEquals(expectedResult, driver.findElement(result).getText());

    }

    @Test
    private void testAlreadyExist () throws InterruptedException {

        createAccount.step1(driver,account);
        
        Thread.sleep(500);
        Assert.assertEquals(expectedResultNegative, driver.findElement(resultNegative).getText());

    }

    @Test
    private void testUnderscore () throws InterruptedException {

        createAccount.step1(driver, account_underscore);

        Thread.sleep(500);
        Assert.assertEquals(expectedResultNegative, driver.findElement(resultNegative).getText());
    }

    @Test
    private void testSQLInjection () throws InterruptedException {

        createAccount.step1(driver, account_sql);

        Thread.sleep(500);
        Assert.assertEquals(expectedResultNegative, driver.findElement(resultNegative).getText());
    }

    @Test
    private void testRus () throws InterruptedException {

        createAccount.step1(driver, account_rus);

        Thread.sleep(500);
        Assert.assertEquals(expectedResultNegative, driver.findElement(resultNegative).getText());
    }

    @Test
    private void testMaxQuantity () throws InterruptedException {

        createAccount.step1(driver, account_max);

        Thread.sleep(500);
        Assert.assertEquals(expectedResultNegative, driver.findElement(resultNegative).getText());
    }

    @Test
    private void testMinQuantity () throws InterruptedException {

        createAccount.step1(driver, account_min);

        Thread.sleep(500);
        Assert.assertEquals(expectedResultNegative, driver.findElement(resultNegative).getText());
    }

    @Test
    private void testSymbol () throws InterruptedException {

        createAccount.step1(driver, account_symbol);

        Thread.sleep(500);
        Assert.assertEquals(expectedResultNegative, driver.findElement(resultNegative).getText());
    }

    @Test
    private void pairwiseStep3 () throws InterruptedException {
        Pairwise pairwise = new Pairwise();
        List<Pair> list = pairwise.pairs();

        for (Pair pair : list) {

            createAccount.
                    step1(driver, account).
                    step2(driver).
                    step3_pairwise(driver, pair);

            Thread.sleep(500);
            Assert.assertEquals(expectedResult, driver.findElement(result).getText());

            deleteAccount.
                    step1(driver).
                    step2(driver).
                    step3(driver);
        }
    }
}
