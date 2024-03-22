package weddriver_university;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class contactus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver.driver","C:\\Users\\Admin\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
		driver.manage().window().maximize();
		WebElement firstname =driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[1]"));
		firstname.sendKeys("krishna");
		WebElement Lastname=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[2]"));
		Lastname.sendKeys("Unnikrishnana");
		
		WebElement Email =driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[3]"));
		Email.sendKeys("krish@gmail.com");
		WebElement Comment=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/textarea"));
		Comment.sendKeys("Its_very_helpful");
		WebElement submit=driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]"));
		submit.click();


	}

}
