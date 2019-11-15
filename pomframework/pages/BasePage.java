package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

	public static WebDriver driver;
	
	public BasePage() {}
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void click(By locator)
	{
		driver.findElement(locator).click();
	}
	
	public void enterText(By locator,String text)
	{
		driver.findElement(locator).sendKeys(text);
	}
}