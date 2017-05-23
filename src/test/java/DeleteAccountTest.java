import by.htp.git.ui.page.deleteAccount.DeleteAccount1_3;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DeleteAccountTest extends BaseTest{

    private DeleteAccount1_3 deleteAccount = new DeleteAccount1_3();

    private static final By result = By.xpath(".//*[@class='container']");
    private static final String expectedResult = "Account successfully deleted.";

    @Test
    public void test (){

        deleteAccount.
                step1(driver).
                step2(driver).
                step3(driver);

        Assert.assertEquals(expectedResult, driver.findElement(result).getText());
    }

}
