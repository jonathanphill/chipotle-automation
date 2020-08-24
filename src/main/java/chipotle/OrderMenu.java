package chipotle;
import base.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class OrderMenu extends BasePage{
    public OrderMenu(WebDriver driver){
        super(driver);
    }
    // X path to find Menu items and select a given menu items on chipotle.com, //div[text()=""]
    public  void clickMenuItems(String menuItem) {
        driver.findElement(By.xpath("//div[text()=\"" + menuItem + "\"]")).click();
    }
    public void inputAreaInfo (String areaInfo){
        driver.findElement(By.xpath("//input[@class=\"input\"]")).sendKeys(areaInfo, Keys.ENTER);
    }

    public void navigateToArea() throws Exception{
        WebDriverWait wait = new WebDriverWait(driver, 40);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.className("restaurant-address")));


//        List<WebElement> elements=driver.findElements(By.xpath("//div[@class=\"address\"]"));
//        System.out.println(elements.isEmpty());
//        for(WebElement element: elements){
//            System.out.println(element.getText());
//        }
    }
    public void pickRandomAddress() throws Exception {
        List<WebElement> elements = driver.findElements(By.className("restaurant-address"));
        int size =elements.size();
       for(int i = 0; i < size; i++){
           elements = driver.findElements(By.className("restaurant-address"));
           elements.get(i).click();

           if(driver.getPageSource().contains("CURRENTLY CLOSED")){
               driver.findElement(By.className("close")).click();
           }
           else{
               driver.findElement(By.xpath("//div[contains(text(),'pickup from this restaurant')]")).click();
               while (true){
                   if(driver.getCurrentUrl().equals("https://www.chipotle.ca/order/#menu")){
                       break;
                   }
               }
               WebDriverWait wait = new WebDriverWait(driver, 30);
               WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu")));
               break;
           }
       }
    }
    public void customizeMenuItem(String menuItem){

        try{
           driver.findElement(By.id("menu")).findElement(By.tagName("img")).click();
           //driver.findElement(By.xpath("//div[@data-qa-group-name=\"Burrito\"]")).click();
            // act.moveToElement(driver.findElement(By.xpath("//div[@data-qa-group-name=\"Burrito\"]"))).click().build().perform();
        }
        catch (Exception ex){
           ex.printStackTrace();
        }

    }

  

}
