import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_Name {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ronal\\eclipse-workspace\\Selenium1\\New\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("identifierId")).sendKeys("p23071989@gmail.com");	
		Thread.sleep(2000);
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		
		
	}

}
