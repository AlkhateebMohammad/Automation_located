package Auto_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Second_project {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String testEmail = "mohammed199761@yahoo.com";
		String testPass="mhmmed12345";

		System.setProperty("webdriver.chrome.driver", "E:\\alkhateeb\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.booking.com/");

		driver.findElement(By.xpath("//*[@id=\"b2indexPage\"]/header/nav[1]/div[2]/div[5]/a")).click();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys(testEmail);
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys(testPass);
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();

	}

}
