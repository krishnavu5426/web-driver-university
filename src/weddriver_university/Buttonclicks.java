package weddriver_university;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttonclicks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver.driver", "C:\\Users\\Admin\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");
		driver.manage().window().maximize();
//		WebElement clickme=driver.findElement(By.xpath("//*[@id=\"button1\"]/p"));
//		clickme.click();
//     	WebElement clickme1=driver.findElement(By.id("button2"));
//     	clickme1.click();
    	WebElement clickme11=driver.findElement(By.id("button3"));
    	clickme11.click();
//		

	}

}
