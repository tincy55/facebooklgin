package Testsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class faacebooklogin {
          
	public static void main(String[] args) {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\ASUS\\eclipse-workspace\\TestProject\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/login/");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9030080723");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("ALexol");
        driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
        
	}

}
