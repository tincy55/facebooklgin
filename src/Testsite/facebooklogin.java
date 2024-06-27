package Testsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebooklogin {
	
	//Created a new account to login FB

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\ASUS\\eclipse-workspace\\TestProject\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.facebook.com/login.php");
        driver.findElement(By.xpath("//*[@class='_97w5']")).click();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Alex");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Oliver");
        driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("9030080723");
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("ALexol");
        WebElement AA= driver.findElement(By.xpath("//*[@name='birthday_day']"));
        Select obj=new Select(AA);
        obj.selectByVisibleText("2");
        WebElement BB=driver.findElement(By.xpath("//*[@name='birthday_month']"));
        Select obj1=new Select(BB);
        obj1.selectByVisibleText("May");
        WebElement CC=driver.findElement(By.xpath("//*[@name='birthday_year']"));
        Select obj2 =new Select(CC);
        obj2.selectByVisibleText("2005");
        driver.findElement(By.xpath("(//input[@class='_8esa'])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@name='websubmit']")).click();
       
	}

}
