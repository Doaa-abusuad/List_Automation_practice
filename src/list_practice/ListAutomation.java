package list_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListAutomation {

	public static void main(String[] args) {
		//*** VSCode name ListPractice

		System.setProperty("webdriver.chrome.driver", "D:\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:5500/index.html");

		String Title = driver.getTitle();
		System.out.println(Title);
		//*** we use Asset in testng to confirm the result

		// String myOptionTag = driver.findElement(By.tagName("option")).getText();
		// System.out.println(myOptionTag);

		//*** list is data types
		//***ctrl+shift+F to arrange format
		
		//String myListOptions = driver.findElements(By.tagName("option")).get(2).getText();
		//System.out.println(myListOptions);
		//*** we need to print the third option
		
		List <WebElement> myOptionList = driver.findElements(By.tagName("option"));
		System.out.println(myOptionList.size());
		for(int i=0; i<myOptionList.size(); i++) {	
			System.out.println(myOptionList.get(i).getText());
		}
	}
}


