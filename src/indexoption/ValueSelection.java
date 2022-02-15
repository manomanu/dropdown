package indexoption;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ValueSelection {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\dropdown\\Driver\\chromedriver.exe");

WebDriver driver=new ChromeDriver();
driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
driver.manage().window().maximize();

WebElement findElement = driver.findElement(By.name("selenium_commands"));
Select select=new Select(findElement);
//multi value selection

//select.selectByIndex(0);
//select.selectByIndex(1);
//select.selectByIndex(2);

//iterate all options
List<WebElement> options = select.getOptions();
for (int i = 0; i < options.size(); i++) {
select.selectByIndex(i);
	}
















}
	
}
