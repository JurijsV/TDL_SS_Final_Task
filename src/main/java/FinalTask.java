import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class FinalTask extends TestBase {
    private WebDriver driver;

    @Test
    public void firstTest(){

        driver.get ("https://www.globalsqa.com/demo-site/");
        WebElement dialogBoxButton = driver.findElement(By.xpath(
                "//*[@id=\"post-2715\"]/div[2]/div/div/div[2]/div[1]/ul/li[6]/a"
        ));
    }
    @AfterTest
    public void exitTest(){
        driver.close();
        driver.quit();
    }



}