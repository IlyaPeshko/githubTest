package by.htp.git.utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.ScreenshotException;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;

public class ScreenShot {
    private static Date timeShot = new Date();

    public void shoot(WebDriver driver, String testName){
        try {
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File(Permanent.SCREENSHOT_PATH, testName + " " + timeShot + ".png"));
        } catch (ScreenshotException e) {
            throw new ScreenshotException("");
        } catch (IOException e){
            System.out.println("second catch (IOException e) " + e);
        }
    }

    public void shootByElement(WebDriver driver){
        try {
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            BufferedImage img = ImageIO.read(screenshot);
            BufferedImage dest = img.getSubimage(400,500,400,500);
            Rectangle rect = new Rectangle(1000, 1000);
            ImageIO.write(dest, "png", screenshot);

            FileUtils.copyFile(screenshot, new File("/Users/user/Desktop", "screenByElement"+timeShot+".png"));

        } catch (IOException e) {
            throw new ScreenshotException("ScreenshotException " + e);
        }
    }
}
