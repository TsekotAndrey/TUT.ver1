import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MainPage {
      private WebDriver chromeDriver;
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\IdeaProjects\\untitled\\src\\main\\resources\\drivers\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://brest.jobs.tut.by/");
    }
    @Test
    public void search() {
        chromeDriver.findElement(By.xpath("//span[contains(@class,'bloko-icon_highlighted-default')]"));
           }
    @After
    public void tearDown(){
        chromeDriver.close();
    }
}


