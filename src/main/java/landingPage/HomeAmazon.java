package landingPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeAmazon
{
    public static WebDriver driver = null;

    @Parameters({"url"})

    @BeforeMethod
    public void setUp(@Optional("http://www.amazon.com") String url)
    {
        //System.setProperty("webdriver.chrome.driver", "/Users/juwel/Desktop/prac2021/Amazon/driver/chromedriver");
        //driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        driver = new ChromeDriver(options);



        driver.navigate().to("http://www.amazon.com");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @AfterMethod
    public void quite()
    {

        driver.close();

    }


}
