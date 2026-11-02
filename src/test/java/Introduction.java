import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Introduction {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/client/#/auth/login");

        driver.findElement(By.id("userEmail")).sendKeys("santosh.parida13@gmail.com");
        driver.findElement(By.id("userPassword")).sendKeys("Newuser@123#");
        driver.findElement(By.id("login")).click();

	}

}
