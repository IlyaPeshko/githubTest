import by.htp.git.utility.ScreenShot;
import by.htp.git.ui.webDriver.Driver;
import by.htp.git.ui.webDriver.DriverTypes;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest {
    private static ScreenShot screenShot = new ScreenShot();
    protected static WebDriver driver;

    @BeforeClass
    public void init (){

        driver = Driver.getWebDriverInstance("chrome", DriverTypes.GC);

    }

    @Before
    public void start () {
        driver.manage().window().fullscreen();
    }


    @AfterClass
    public void cleanUp () {

        //driver.navigate().refresh();
        screenShot.shoot(driver, getClass().toString());
        //driver.manage().window().fullscreen();
        //driver.quit();
    }
}
