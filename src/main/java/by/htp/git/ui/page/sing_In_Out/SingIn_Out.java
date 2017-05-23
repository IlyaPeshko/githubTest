package by.htp.git.ui.page.sing_In_Out;

import by.htp.git.utility.Permanent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SingIn_Out {

    private static final By singInTarget = By.xpath (".//*[@class = 'text-bold site-header-link'][1]");

    private static final By dropDownMenuTarget = By.xpath (".//*[@id='user-links']/li[3]/a/img");
    private static final By singOutTarget = By.xpath (".//*[@class='dropdown-item dropdown-signout']");


    public SingInPage indexSingIn (WebDriver driver) {

        driver.get(Permanent.INDEX_PAGE);
        driver.findElement(singInTarget).click();

        return new SingInPage();
    }

    public void indexSingOut (WebDriver driver){

        driver.get(driver.getCurrentUrl());

        driver.findElement(dropDownMenuTarget).click();
        driver.findElement(singOutTarget).click();
    }
}
