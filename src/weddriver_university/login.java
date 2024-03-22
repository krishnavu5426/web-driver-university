package weddriver_university;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver.driver", "C:\\Users\\Admin\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Login-Portal/index.html");
		driver.manage().window().maximize();
		WebElement Username=driver.findElement(By.id("text"));
		Username.sendKeys("krish");
		WebElement password =driver.findElement(By.id("password"));
		password.sendKeys("5426");
		WebElement login=driver.findElement(By.id("login-button"));
		login.click();
		
		
		

	}

}
