import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

class CheckBoxes{
	
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement chkBox1= driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		List<WebElement> chkBoxes = driver.findElements(By.xpath("//div[@id='checkbox-example']//input"));
		chkBox1.click();
		Assert.assertTrue(chkBox1.isSelected());
		chkBox1.click();
		Assert.assertFalse(chkBox1.isSelected());
		int count = 0;
		for(WebElement chkBox: chkBoxes)
		{
			count++;
		}
		System.out.println("Number of checkboxes is:" +count);
		
		driver.quit();
	}
}