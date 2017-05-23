package by.htp.git.xStaff;

import by.htp.git.bo.Account;
import by.htp.git.ui.page.createAccount.CreateAccount1_3;
import by.htp.git.ui.page.deleteAccount.DeleteAccount1_3;
import by.htp.git.utility.Pairwise.Pairwise;
import by.htp.git.utility.Pairwise.entitty.Pair;
import by.htp.git.utility.Permanent;
import by.htp.git.ui.webDriver.Driver;
import by.htp.git.ui.webDriver.DriverTypes;
import org.openqa.selenium.WebDriver;

import java.util.List;


public class Main {

    private CreateAccount1_3 createAccount = new CreateAccount1_3();
    private DeleteAccount1_3 deleteAccount = new DeleteAccount1_3();

    private Account account = new Account(Permanent.LOGIN, Permanent.EMAIL, Permanent.PASSWORD);

    public static void main(String[] args) throws InterruptedException {

        Main main = new Main();
        main.accountPairwise();
    }

    private void accountPairwise () throws InterruptedException {
        WebDriver driver = Driver.getWebDriverInstance("chrome", DriverTypes.GC);

        Pairwise pairwise = new Pairwise();
        List<Pair> list = pairwise.pairs();

        for (Pair pair : list) {
            createAccount.
                    step1(driver,account).
                    step2(driver).
                    step3_pairwise(driver, pair);

            deleteAccount.
                    step1(driver).
                    step2(driver).
                    step3(driver);
        }
    }
}
