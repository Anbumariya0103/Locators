package Task16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		String link="https://www.guvi.in/register/";
		//Initialization and Launch the browser
		WebDriver driver= new ChromeDriver();
		 // Load the respective URL
		driver.get(link);
		// this step is used too manage the window to maximize
		driver.manage().window().maximize();
		//wait is added to prevent from the exception
		Thread.sleep(3000);
		//Located the element by using the locator Id with the data anbu
        driver.findElement(By.id("firstName")).sendKeys("Anbu");
		//Located the element by using the locator cssSelector with the data Mariya
        driver.findElement(By.cssSelector("input[id='lastName']")).sendKeys("Mariya");
		//Located the element by using the locator Classname with the data anbumariya@gmail.com
        driver.findElement(By.className("form-control")).sendKeys("anbumariya@gmail.com");
		//Located the element by using the locator tagname 
        driver.findElement(By.tagName("input"));
		//Located the element by using the locator xpath with the data 98745612350
        driver.findElement(By.xpath("//input[@id='mobileNumberInput']")).sendKeys("9874561250");
     // When all the function  executed  this is used to close the browser
        driver.close();

}
}