import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aler_ts {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ronal\\eclipse-workspace\\Selenium1\\New\\chromedriver.exe");
		
		WebDriver RD = new ChromeDriver();
		RD.get("http://demo.automationtesting.in/Frames.html");
		RD.manage().window().maximize();
		RD.switchTo().frame("SingleFrame");
		RD.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Ronald");
		System.out.println("SingleFrame Launched");
		Thread.sleep(2000);
		RD.switchTo().defaultContent();
		RD.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		WebElement frame1 = RD.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
		RD.switchTo().frame(frame1);
		Thread.sleep(1000);
		WebElement frame2 = RD.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
	    RD.switchTo().frame(frame2);
	    System.out.println("Frame 2 switched");
	    RD.findElement(By.xpath("//input[@type='text']")).sendKeys("Durai");
	    Thread.sleep(2000);
	    RD.manage().window().minimize();
	    RD.quit();
	    
		
		
	}

}
