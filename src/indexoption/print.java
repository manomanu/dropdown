package indexoption;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class print {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\dropdown\\Driver\\chromedriver.exe");
		
WebDriver driver =new ChromeDriver();
driver.get("https://adactinhotelapp.com/");
driver.manage().window().maximize();
		
WebElement hotel = driver.findElement(By.id("username"));
hotel.sendKeys("bluejaffer");
		
WebElement adactin = driver.findElement(By.id("password"));
adactin.sendKeys("1234567890");

WebElement findElement = driver.findElement(By.id("login"));
findElement.click();
		
WebElement findElement2 = driver.findElement(By.id("location"));
Select select = new Select(findElement2);
select.selectByIndex(5);		
		
WebElement findElement3 = driver.findElement(By.name("hotels"));
Select select1 = new Select(findElement3);
select1.selectByIndex(2);

WebElement findElement4 = driver.findElement(By.name("room_type"));
Select select2 = new Select(findElement4);
select2.selectByIndex(4);

WebElement findElement5 = driver.findElement(By.name("room_nos"));
Select select3 = new Select(findElement5);
select3.selectByIndex(5);

WebElement findElement6 = driver.findElement(By.name("adult_room"));
Select select4 = new Select(findElement6);
select4.selectByIndex(4);

WebElement findElement7 = driver.findElement(By.id("child_room"));
Select select5 = new Select(findElement7);
select5.selectByIndex(1);

WebElement findElement8 = driver.findElement(By.id("Submit"));
//Select select6 = new Select(findElement8);
findElement8.click();

WebElement findElement9 = driver.findElement(By.name("radiobutton_0"));
		findElement9.click();
		
WebElement findElement10 = driver.findElement(By.name("continue"));
findElement10.click();

WebElement findElement11 = driver.findElement(By.name("first_name"));
findElement11.sendKeys("manojkumar");

WebElement findElement12 = driver.findElement(By.name("last_name"));
findElement12.sendKeys("Dhanasekar");

WebElement findElement13 = driver.findElement(By.name("address"));
findElement13.sendKeys("korrukupet,chennai21");

WebElement findElement14 = driver.findElement(By.name("cc_num"));
findElement14.sendKeys("9876543219876543");

WebElement findElement15 = driver.findElement(By.name("cc_type"));
Select select6 = new Select(findElement15);
select6.selectByIndex(3);

WebElement findElement16 = driver.findElement(By.name("cc_exp_month"));
Select select7 = new Select(findElement16);
select7.selectByIndex(11);

WebElement findElement17 = driver.findElement(By.name("cc_exp_year"));
Select select8 = new Select(findElement17);
select8.selectByIndex(10);

WebElement findElement18 = driver.findElement(By.name("cc_cvv"));
findElement18.sendKeys("123");

WebElement findElement19 = driver.findElement(By.id("book_now"));
findElement19.click();

Thread.sleep(5000);

WebElement ordPrint = driver.findElement(By.id("order_no"));
String printtxt = ordPrint.getAttribute("value");
System.out.println(printtxt);}}


