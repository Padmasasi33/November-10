package com.Maven.Maven_Oct30;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static WebDriver driver;
	public static JavascriptExecutor js;
		

	public static WebDriver getBrowser(String type) {

		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//Driver//chromedriver_win32 (1)//chromedriver.exe");
			driver = new ChromeDriver();

		} else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "Driver\\chromedriver_win32 (1)\\geckodriver.exe");
			driver = new FirefoxDriver();

		}
		driver.manage().window().maximize();
		return driver;

	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void userName(WebElement element, String type) {
		element.sendKeys(type);

	}

	public static void passWord(WebElement element, String type) {

		element.sendKeys(type);

	}

	public static void click(WebElement ele) {

		ele.click();
	}

	public static void dropDown(String type, WebElement element, String value) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("byValue")) {
			s.selectByValue(value);
		} else if (type.equalsIgnoreCase("byVisibleText")) {
			s.selectByVisibleText(value);
		} else if (type.equalsIgnoreCase("byIndex")) {
			int index = Integer.parseInt(value);
			s.selectByIndex(index);
		}

	}

	public static void thread_Sleep(int value) throws InterruptedException {

		Thread.sleep(value);

	}
	public static void scroll(WebElement ele) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);

	}
	public static void takeScreenShot() throws IOException {
		// TODO Auto-generated method stub
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\PATAMA\\eclipse-workspace\\Selenium_Start\\Screenshot\\maven.png");
		FileUtils.copyFile(source, destination);

	}
	public static void close() {
		// TODO Auto-generated method stub
		driver.close();

	}

}
