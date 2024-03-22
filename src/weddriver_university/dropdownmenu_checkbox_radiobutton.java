package weddriver_university;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownmenu_checkbox_radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver.driver", "C:\\Users\\Admin\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
	   WebElement Dropdown_menu=driver.findElement(By.xpath("/html/body/div/div[2]/div/h2"));
		//WebElement java=driver.findElement(By.id("dropdowm-menu-1"));
		Select dropjava=new Select(driver.findElement(By.id("dropdowm-menu-1")));
	
		dropjava.selectByVisibleText("SQL");
		Select drophtml=new Select(driver.findElement(By.id("dropdowm-menu-3")));
		drophtml.selectByVisibleText("CSS");
    	Select dropeclipse=new Select(driver.findElement(By.id("dropdowm-menu-2")));
     	dropeclipse.selectByVisibleText("Eclipse");
    	//dropjava.selectByValue("SQL");
//		dropgender.selectByIndex(2);
     	
//     	WebElement check3= driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[3]"));
//     	check3.click();
     	
     	
//     	WebElement check1= driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[1]"));
//     	check1.click();
//     	
//     	WebElement check2= driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[2]/input"));
//     	check2.click();
//     	
//     	WebElement check4= driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[4]/input"));
//     	check4.click();
     	
     	
//     	WebElement radiobutton1=driver.findElement(By.name("color"));
//     	radiobutton1.click();
     	
//     	WebElement radiobutton2=driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[3]"));
//     	 radiobutton2.click();
//     	 
//     	 WebElement radiobutton3=driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[2]"));
//     	 radiobutton3.click();
     	
//     	WebElement radiobutton4=driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[4]\r\n"));
//     	radiobutton4.click();
//     	
//     	WebElement radiobutton5=driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[5]"));
//     	 radiobutton5.click();
     	
//     	
//     	WebElement lettuce =driver.findElement(By.xpath("//*[@id=\"radio-buttons-selected-disabled\"]/input[1]"));
//     	lettuce.click();
     	
     	WebElement pumpkin=driver.findElement(By.xpath("//*[@id=\"radio-buttons-selected-disabled\"]/input[3]"));
     	pumpkin.click();
     	
	}

}
