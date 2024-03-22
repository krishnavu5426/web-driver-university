package weddriver_university;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver.driver", "C:\\Users\\Admin\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Datepicker/index.html");
		driver.manage().window().maximize();
		WebElement clickme=driver.findElement(By.xpath("//*[@id=\"datepicker\"]/input"));
    	clickme.click();
    	WebElement clickme1=driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[4]/td[5]"));
    	clickme1.click();

	}

}
