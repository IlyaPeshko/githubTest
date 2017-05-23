package by.htp.git.xStaff;

import by.htp.git.utility.Pairwise.Pairwise;
import by.htp.git.utility.Pairwise.entitty.Pair;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class TestMain {
    private WebDriver driver = null;
    public static void main(String[] args) {
        TestMain testMain = new TestMain();
        testMain.run();
    }

    public void run (){
        Pairwise pairwise = new Pairwise();
        List <Pair> list = pairwise.pairs();

        for (Pair pair : list) {
            System.out.println(pair);
        }


    }
}
