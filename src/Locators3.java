import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\614087664\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//sibling- parent to child //("//div/button[1]/following-sibling::button[1]")
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.xpath("/html/body/header/div/button[1]/following-sibling::button[1]")).getText());
		
		// child to parent ("//header/div/button[1]/parent::div")
		//System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/parent::header/div/button/1")).getText());
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/parent::header/parent::body/header/div/button/following-sibling::button[1]")).getText());
		driver.close();
		
		
	}

}