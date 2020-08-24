import base.BasePage;
import chipotle.HomePage;
import chipotle.OrderMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ChipotleTest {
   Chipotle chipotle;
    @BeforeSuite
    public void beforeSuite(){
        WebDriver driver = new ChromeDriver();
       chipotle = new Chipotle(driver);


    }
//    @Test(testName = "launch Chipotle Website", description = "",groups = {"Valid data"})
//    public void launchUrlTest() throws  Exception{
//        BasePage.launchUrl("https://www.chipotle.com/");
//
//    }
    @Test(testName = "",description = "",groups = {"Valid data"})
    public void validateOrderTest() throws Exception{

        chipotle.homePage.launchUrl("https://www.chipotle.com/");
        chipotle.homePage.clickNavElements("Order");
        chipotle.orderMenu.clickMenuItems("Burrito");
        chipotle.orderMenu.inputAreaInfo("Mississauga");
    }
    @Test
    public void  orderTest() throws  Exception{

        try{
            chipotle.homePage.launchUrl("https://www.chipotle.com/");
            chipotle.homePage.clickNavElements("Order");
            chipotle.orderMenu.clickMenuItems("Burrito");
            chipotle.orderMenu.inputAreaInfo("Mississauga");
            chipotle.orderMenu.navigateToArea();
            chipotle.orderMenu.pickRandomAddress();
            chipotle.orderMenu.customizeMenuItem("Burrito");
        }
        catch (Exception ex){
            ex.printStackTrace();
            Assert.fail();
        }

    }
}

//-Validating ordering of Burrito- Test Case
//- Launch the website- Test Step/Action
//- Click on order
//- Click On Burrito
//- Enter city
