package weddriver_university;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popandalert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver.driver","C:\\Users\\Admin\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");
		driver.manage().window().maximize();
//		WebElement clickme=driver.findElement(By.xpath("//*[@id=\"button1\"]/p"));
//		clickme.click();
//		driver.switchTo().alert().accept();
		
		
//		WebElement clickme1=driver.findElement(By.xpath("//*[@id=\"button2\"]/p"));
//		clickme1.click();
//		driver.switchTo().alert().dismiss();
		
		WebElement clickme1=driver.findElement(By.xpath("//*[@id=\"button3\"]/p/a"));
		clickme1.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement clickme11=driver.findElement(By.xpath("//*[@id=\"button1\"]/p"));
		clickme11.click();
		driver.switchTo().alert().dismiss();
		
//		
//		WebElement clickme1=driver.findElement(By.xpath("//*[@id=\"button4\"]/p"));
		
//		clickme1.click();
//		//driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();


	}

}
