import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path {
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ronal\\eclipse-workspace\\Selenium1\\New\\chromedriver.exe");
		
		WebDriver yo = new ChromeDriver();
		yo.get("https://www.gmail.com");
		
		Thread.sleep(2000);
		yo.manage().window().maximize();
		Thread.sleep(1000);
		
		yo.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]")).click();
		Thread.sleep(1000);
		
		yo.findElement(By.xpath("(//span[@jsname='K4r5Ff'])[1]")).click();
		yo.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]")).sendKeys("ronald");
		yo.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("durai");
		
		Thread.sleep(2000);
		
		yo.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[4]")).sendKeys("Xyz@wyy");
		
		
		
	}

}
