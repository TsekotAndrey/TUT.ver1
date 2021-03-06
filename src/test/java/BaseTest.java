import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTest {

    @Test
    public void searchFunctionality() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\IdeaProjects\\untitled\\src\\main\\resources\\drivers\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://brest.jobs.tut.by/");
        chromeDriver.findElement(By.xpath("//span[contains(@class,'bloko-icon_highlighted-default')]")).click();
        chromeDriver.findElement(By.xpath("//input[@id='advancedsearchmainfield']")).sendKeys("QA");
        chromeDriver.findElement(By.xpath("//input[@id='advancedsearchmainfield']")).sendKeys(Keys.RETURN);
        chromeDriver.findElement(By.xpath("//span[@class='clusters-value__name clusters-value__name_truncate']")).click();
        List<WebElement> vacancy = chromeDriver.findElements(By.xpath("//div[@Class='vacancy-serp-item ']"));
        if (vacancy.size() >= 1) System.out.println("It is good day");
        else System.out.println("It is not good day");
        chromeDriver.close();
    }
}
