import landingPage.HomeAmazon;
import org.testng.annotations.Test;

public class TestHome extends HomeAmazon
{


    @Test(priority = 1)
    public void getTitle()
    {
        System.out.println(" Title is : "+driver.getTitle());
    }

}
