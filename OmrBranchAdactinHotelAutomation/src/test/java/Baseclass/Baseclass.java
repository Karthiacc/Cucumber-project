package Baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author karthikeyan
 * @Description used to maintain the reusable methods
 * @Date 19-sep-2022
 */
public class Baseclass {

	public static WebDriver driver;

	public static void getdriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void browserlaunch(String url) {
		driver.get(url);
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public void clear(WebElement element) {
		element.clear();
	}

//	id
	public WebElement FindElementId(String data) {
		WebElement element = driver.findElement(By.id(data));
		return element;
	}

	public WebElement FindElementName(String data) {
		WebElement element = driver.findElement(By.name(data));
		return element;
	}

//	xpath
	public WebElement FindElementXpath(String data) {
		WebElement element = driver.findElement(By.xpath(data));
		return element;
	}

	public void sendkeys(WebElement element, String Text) {
		element.sendKeys(Text);
		;
	}

	public String GettheText(WebElement element) {
		String text = element.getText();
		return text;
	}

	public String GetAttributes(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}

	public void MoveToElement(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}

	public static void click(WebElement element) {
		element.click();
	}
	public void quit() {
		driver.quit();
	}

	public void robotkeyenter() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public void robotkeyTab() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
	}

	public void selectbyvisibletext(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public void sleep(int no) throws InterruptedException {
		Thread.sleep(no);
	}

	public Alert switchToAlertAccept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
		return alert;
	}

	public String getPropertyFileValue(String key) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.load(new FileInputStream(System.getProperty("user.dir") + "\\Config\\Config.properties"));
		String value = (String) properties.get(key);
		return value;

	}

	public static void typeofbrowser(String browsertype) {

		switch (browsertype) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			break;
		}

	}

	public byte[] getscreenshot() {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		byte[] b = screenshot.getScreenshotAs(OutputType.BYTES);
		return b;
	}

	public void implicitwait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

}
