package seleproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rijas\\Downloads\\EXE\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gmail.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("identifierId")).sendKeys("sid.aka.beacon@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.className("Cwak9")).click();
        Thread.sleep(1000);
        String at = driver.getTitle();
        String et = "gmail";
        System.out.println(at);
        driver.close();
        if(at.equalsIgnoreCase(et)) {
            System.out.println("Test Successful");
        } else {
            System.out.println("Test Failure");
        }
    }
}
