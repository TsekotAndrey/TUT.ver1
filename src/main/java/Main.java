import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\IdeaProjects\\untitled\\src\\main\\resources\\drivers\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://brest.jobs.tut.by/");
        chromeDriver.findElement(By.xpath("//a[contains(@class,'bloko-icon-link')]")).click();
        chromeDriver.findElement(By.xpath("//input[@id='advancedsearchmainfield']")).sendKeys("QA");
        chromeDriver.findElement(By.xpath("//input[@id='advancedsearchmainfield']")).sendKeys(Keys.RETURN);
        List<WebElement> vacancy = chromeDriver.findElements(By.xpath("//div[@class='vacancy-serp']"));
        //Косячный xPath на 17 строчке)))))))))
        if (vacancy.size() > 1) System.out.println("It is good day");
        else System.out.println("It is not good day");
        chromeDriver.close();
    }
}
