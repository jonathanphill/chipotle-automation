package base;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BasePage {
    // declaring a ChromeDriver object;
    public  WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    // Method to launch given URL
    public void launchUrl(String Url) throws  Exception{
        driver.get(Url);
        driver.manage().window().maximize();
    }




//    public static void main(String[] args) throws Exception {
//            BasePage bp = new BasePage();
//            bp.launchUrl("https://www.chipotle.com/");
////            bp.clickNavElements("Order");
//            bp.clickMenuItems("Burrito");
//            bp.inputAreaInfo("Mississauga");
//
//            Thread.sleep(5000);
//            List<WebElement> addressElements = driver.findElementsByXPath("//div[@class=\"bold\"] ");
//
//            for(int i =0; i < addressElements.size(); i++){
//                addressElements.get(i).click();
//                Thread.sleep(3000);
//            }
//
//            for (WebElement element : addressElements) {
//                    element.click();
//                    Thread.sleep(5000);
////                System.out.println("Paragraph text:" + element.getText());
//            }
//            driver.quit();
//
//
//    }

}

