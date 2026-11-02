import java.time.Duration;
import java.util.List;
import java.util.function.Function;

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

class Waits{
	
	public static void main(String args[])
	{
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://rahulshettyacademy.com/loginPagePractise/#/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement userName = driver.findElement(By.cssSelector("#username"));
		WebElement pwd = driver.findElement(By.cssSelector("#password"));
		WebElement signBtn = driver.findElement(By.cssSelector("#signInBtn"));
		WebElement dropdown = driver.findElement(By.cssSelector("div.form-group select.form-control"));
		WebElement termsChkBox = driver.findElement(By.cssSelector("#terms"));
		
		userName.sendKeys("rahulshettyacademy");
		pwd.sendKeys("Learning@830$3mK2");
		termsChkBox.click();
		Select s = new Select(dropdown);
		s.selectByVisibleText("Consultant");
		
		signBtn.click();
		
		List<WebElement> products = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(".card-body")));
		WebElement blackberryBtn = driver.findElement
				(By.xpath("//a[text()='Blackberry']/parent::h4/parent::div/following-sibling::div/button"));
		WebElement chkOutBtn = driver.findElement(By.xpath("//div[@id='navbarResponsive']//a"));
		blackberryBtn.click();
		
		chkOutBtn.click();
		
		
		driver.quit();
	}
	
}