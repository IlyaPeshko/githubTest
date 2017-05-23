import by.htp.git.ui.page.sing_In_Out.SingIn_Out;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SingIn extends BaseTest{

    private SingIn_Out singIn_out = new SingIn_Out();

    private static final By result = By.xpath(".//*[@class='shelf-title']");
    private static final String expectedResult = "Learn Git and GitHub without any code!";

    private static final By resultNegative = By.xpath(".//*[@class='container']");
    private static final String expectedResultNegative = "Incorrect username or password.";

    @Test
    public void singInTest (){

        singIn_out.indexSingIn(driver).
                singIn(driver);

        Assert.assertEquals(expectedResult, driver.findElement(result).getText());
    }

    @Test
    public void singInNotExist (){

        singIn_out.indexSingIn(driver).
                singIn(driver);

        Assert.assertEquals(expectedResultNegative, driver.findElement(resultNegative).getText());
    }
}
