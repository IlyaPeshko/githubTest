package by.htp.git.utility.Pairwise;

import by.htp.git.utility.Pairwise.entitty.Pair;
import by.htp.git.utility.Permanent;
import org.openqa.selenium.By;
import java.util.List;

public class Pairwise {

    private CSVReader reader;
    private List <Pair> list;

    private static final By veryExperienced = By.xpath(Permanent.veryExperienced);
    private static final By somewhatExperienced = By.xpath(Permanent.somewhatExperienced);
    private static final By totallyNewToProgramming = By.xpath(Permanent.totallyNewToProgramming);
    private static final By design = By.xpath(Permanent.design);
    private static final By development = By.xpath(Permanent.development);
    private static final By schoolProjects = By.xpath(Permanent.schoolProjects);
    private static final By projectManagement = By.xpath(Permanent.projectManagement);
    private static final By research = By.xpath(Permanent.research);
    private static final By other = By.xpath(Permanent.other);
    private static final By hobbyist = By.xpath(Permanent.hobbyist);
    private static final By professional = By.xpath(Permanent.professional);
    private static final By student = By.xpath(Permanent.student);
    private static final By otherOption = By.xpath(Permanent.otherOption);

    public List<Pair> pairs (){
        reader = new CSVReader();
        list = reader.fetchPair();

        for (int i=0; i<list.size();i++){
            list.get(i).getPair_1().setBy(
                    assignXPath(list.get(i).getPair_1().getName()));

            list.get(i).getPair_2().setBy(
                    assignXPath(list.get(i).getPair_2().getName()));

            list.get(i).getPair_3().setBy(
                    assignXPath(list.get(i).getPair_3().getName()));
        }

        return list;
    }

    private By assignXPath (String name) {
        By xpath = null;

        switch (name){
            case "veryExperienced":
                xpath = veryExperienced;
                break;

            case "somewhatExperienced":
                xpath = somewhatExperienced;
                break;

            case "totallyNewToProgramming":
                xpath = totallyNewToProgramming;
                break;

            case "design":
                xpath = design;
                break;

            case "development":
                xpath = development;
                break;

            case "schoolProjects":
                xpath = schoolProjects;
                break;

            case "projectManagement":
                xpath = projectManagement;
                break;

            case "research":
                xpath = research;
                break;

            case "other":
                xpath = other;
                break;

            case "hobbyist":
                xpath = hobbyist;
                break;

            case "professional":
                xpath = professional;
                break;

            case "student":
                xpath = student;
                break;

            case "otherOption":
                xpath = otherOption;
                break;
            default:
                System.out.println("WARNING / wrong variable");
                break;
        }

        return xpath;
    }

}
