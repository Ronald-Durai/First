import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ronal\\eclipse-workspace\\Selenium1\\New\\chromedriver.exe");
		
		WebDriver RD = new ChromeDriver();
		RD.get("http://demo.automationtesting.in/Alerts.html");
		RD.manage().window().maximize();
		RD.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Thread.sleep(1000);
		RD.switchTo().alert().accept();
		Thread.sleep(1000);
		RD.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		Thread.sleep(1000);
		RD.findElement(By.xpath("(//button[@onclick='confirmbox()'])")).click();
		Thread.sleep(1000);
		RD.switchTo().alert().dismiss();
		RD.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		RD.findElement(By.xpath("(//button[@class='btn btn-info'])")).click();
		System.out.println("TESTED SUCCESSFULLY");
		Thread.sleep(1000);
		org.openqa.selenium.Alert CC = RD.switchTo().alert();
		CC.sendKeys("RONALD");
		CC.accept();
		Thread.sleep(2000);
		RD.quit();
		
		
	}

}
