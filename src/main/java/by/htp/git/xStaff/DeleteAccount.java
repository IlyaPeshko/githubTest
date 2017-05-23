package by.htp.git.xStaff;

import by.htp.git.ui.page.deleteAccount.DeleteAccount1_3;
import by.htp.git.ui.page.sing_In_Out.SingIn_Out;
import by.htp.git.ui.webDriver.Driver;
import by.htp.git.ui.webDriver.DriverTypes;
import org.openqa.selenium.WebDriver;

/**
 * Created by user on 21.05.17.
 */
public class DeleteAccount {
    private static int count = 1;
    private DeleteAccount1_3 deleteAccount = new DeleteAccount1_3();
    private WebDriver driver = Driver.getWebDriverInstance("chrome", DriverTypes.GC);


    public static void main(String[] args) throws InterruptedException {
        DeleteAccount testMain = new DeleteAccount();
        testMain.executeDelete();
    }



    public void executeDelete (){
        SingIn_Out singIn_out = new SingIn_Out();
        singIn_out.indexSingIn(driver).
                singIn(driver);
        deleteAccount.
                step1(driver).
                step2(driver).
                step3(driver);

    }

    public void executeDeletePairwise (WebDriver driver){

        deleteAccount.
                step1(driver).
                step2(driver).
                step3(driver);

    }
}
