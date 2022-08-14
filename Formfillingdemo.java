package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Formfillingdemo {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\maven project selenium\\project1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Gayathri");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Gayu");
		driver.findElement(By.id("sex-1")).click();
		driver.findElement(By.id("exp-2")).click();
		driver.findElement(By.id("datepicker")).sendKeys("13-08-22");
		driver.findElement(By.id("profession-0")).click();
		driver.findElement(By.id("profession-1")).click();
		driver.findElement(By.xpath("//input[@value='Selenium Webdriver']")).click();
		Select dropdown1=new Select(driver.findElement(By.xpath("//select[1]")));
		dropdown1.selectByIndex(0);
		Select dropdown2=new Select(driver.findElement(By.id("selenium_commands")));
		dropdown2.selectByIndex(1);
		driver.findElement(By.id("submit")).click();
		

		
	}

}
