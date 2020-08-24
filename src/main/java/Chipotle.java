import chipotle.HomePage;
import chipotle.OrderMenu;
import org.openqa.selenium.WebDriver;

public class Chipotle {
    HomePage homePage;
    OrderMenu orderMenu;
    public Chipotle(WebDriver driver){
        homePage = new HomePage(driver);
        orderMenu= new OrderMenu(driver);
    }
}
