package chipotle;
import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver){
        super(driver);
    }

    // X path to find the Navigation Elements a[text()=""] on chipotle.com and click them
    public  void clickNavElements(String navItem) throws Exception{
        driver.findElement(By.xpath("//a[text()=\""+navItem+"\"]")).click();
    }

}
