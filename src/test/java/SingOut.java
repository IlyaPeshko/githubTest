import by.htp.git.ui.page.sing_In_Out.SingIn_Out;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SingOut extends BaseTest{

    private SingIn_Out singIn_out = new SingIn_Out();

    private static final By result = By.xpath(".//*[@class='alt-h0 text-white lh-condensed-ultra mb-3']");
    private static final String expectedResult = "Built for developers";

    @Test
    public void singOutTest () {

        singIn_out.indexSingOut(driver);

        Assert.assertEquals(expectedResult, driver.findElement(result).getText());
    }
}
