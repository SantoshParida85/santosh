import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

class SpiceJet {

	public static void main(String args[]) throws InterruptedException {

		String from = "ATQ";
		String to = "PNQ";

		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<>();
		// 1 = Allow geolocation
		prefs.put("profile.default_content_setting_values.geolocation", 1);
		options.setExperimentalOption("prefs", prefs);

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.spicejet.com/");

		WebElement tripRadioBtnOneway = driver
				.findElement(By.cssSelector("Div[data-testid='one-way-radio-button'] div svg"));
		WebElement fromBtn = driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']"));
		WebElement toBtn = driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']"));
		
		

		tripRadioBtnOneway.click();
		fromBtn.click();
		WebElement fromInput = driver.findElement(By.xpath("//div[text()='" + from + "']"));
		fromInput.click();
		toBtn.click();
		WebElement toInput = driver.findElement(By.xpath("//div[text()='" + to + "']"));
		toInput.click();

		driver.quit();
	}
}