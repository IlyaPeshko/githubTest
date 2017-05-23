package by.htp.git.utility;


public class Permanent {

    public static final String INDEX_PAGE = "https://github.com/";
    public static final String ACCOUNT_PAGE = "https://github.com/join?source=header-home";


    //Login may only contain alphanumeric characters or single hyphens, and cannot begin or end with a hyphen
    //positive
    public static final String LOGIN = "Tst3-5";
    public static final String EMAIL = "TestGitEntity@git.com";
    public static final String PASSWORD = "TestGitEntity123";

    //negative
    public static final String LOGIN_SYMBOL_UNDERSCORE = "Tst_35";
    public static final String LOGIN_SYMBOL_SQO = "T'st35";
    public static final String LOGIN_SYMBOL_RUS = "тест";
    public static final String LOGIN_SYMBOL = "ЏЌЊƒ";
    public static final String LOGIN_SYMBOL_MAX = "qwertyuiopasdfghjklzxcvbnm1234567890QWEQ";
    public static final String LOGIN_SYMBOL_MIN = "tst";

    //xPath for 3 step of registration
    public static final String PICT_DOCUMENT_PATH = "/Users/user/Library/Mobile Documents/com~apple~CloudDocs/IdeaProjects/githubTest/src/main/resources/pair.csv";

    public static final String veryExperienced = ".//*[@id='js-pjax-container']/div/div[2]/div/form/fieldset[1]/div/div[1]/label";
    public static final String somewhatExperienced = ".//*[@id='js-pjax-container']/div/div[2]/div/form/fieldset[1]/div/div[2]/label";
    public static final String totallyNewToProgramming= ".//*[@id='js-pjax-container']/div/div[2]/div/form/fieldset[1]/div/div[3]/label";
    public static final String design = ".//*[@id='js-pjax-container']/div/div[2]/div/form/fieldset[2]/div/div[1]/label";
    public static final String development = ".//*[@id='js-pjax-container']/div/div[2]/div/form/fieldset[2]/div/div[4]/label";
    public static final String schoolProjects = ".//*[@id='js-pjax-container']/div/div[2]/div/form/fieldset[2]/div/div[2]/label";
    public static final String projectManagement = ".//*[@id='js-pjax-container']/div/div[2]/div/form/fieldset[2]/div/div[5]/label";
    public static final String research = ".//*[@id='js-pjax-container']/div/div[2]/div/form/fieldset[2]/div/div[3]/label";
    public static final String other = ".//*[@id='js-pjax-container']/div/div[2]/div/form/fieldset[2]/div/div[6]/label";
    public static final String hobbyist = ".//*[@id='js-pjax-container']/div/div[2]/div/form/fieldset[3]/div/div[1]/label";
    public static final String professional = ".//*[@id='js-pjax-container']/div/div[2]/div/form/fieldset[3]/div/div[2]/label";
    public static final String student = ".//*[@id='js-pjax-container']/div/div[2]/div/form/fieldset[3]/div/div[3]/label";
    public static final String otherOption= ".//*[@id='js-pjax-container']/div/div[2]/div/form/fieldset[3]/div/div[4]/label";

    public static final String SCREENSHOT_PATH = "/Users/user/Desktop/gitTest";
    public static final String FIREFOX_DRIVER_PATH = "/drivers/geckodriver";
    public static final String CHROME_DRIVER_PATH = "/drivers/chromedriver";
    //public static final String CHROME_DRIVER_PATH = "//resources/driver/chromedriver";

    private Permanent () {}
}
