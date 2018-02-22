package com.bls.fsms.autotest.fwk.core.browser;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.bls.fsms.autotest.fwk.core.validation.IBrowserValidation;
import com.bls.fsms.autotest.fwk.core.validation.IFWKValidation;

/**
 * 
 * This is BaseBrowser which is integrated with selenium WebDriver
 * and Customized browser based validation.<br>
 * Tester will call this class to control browser
 * 
 * @author JIAN_J
 *
 */
public class BaseBrowser extends AbstractBrowser implements IBrowserValidation,WebDriver{
	
	
	private WebDriver driver;
	private FluentWait<WebDriver> fWait;
	public BaseBrowser(){
		this(null);
	}
	
	
	public  BaseBrowser(WebDriver driver) {
			this.driver = driver;
//			List<Object> list = new ArrayList<Object>();
//		
//			list.add( NoSuchElementException.class);
//			list.add(StaleElementReferenceException.class);
//			list.add(TimeoutException.class);
			fWait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS)
					.pollingEvery(5, TimeUnit.SECONDS)					
					.ignoring(NoSuchElementException.class);					
					
					
				
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean validate(WebElement iElement, IFWKValidation iValidation) {
		// TODO Auto-generated method stub
		return iValidation.validate(iElement);
	}


	public WebElement findElementByText(String text) {
		// TODO Auto-generated method stub
		
		String pattern ="//*[text()='"+ text +"']";
		return driver.findElement(By.xpath(pattern));
		
	}

	
	public WebElement findElementByValue(String value) {
		// TODO Auto-generated method stub
		
		return driver.findElement(By.xpath("//*[@value='"+value+"']"));
	}
	@Override
	public void close() {
		// TODO Auto-generated method stub
		driver.close();
	}
	@Override
	public WebElement findElement(By arg0) {
		// TODO Auto-generated method stub
		return driver.findElement(arg0);
	}
	@Override
	public List<WebElement> findElements(By arg0) {
		// TODO Auto-generated method stub
		return driver.findElements(arg0);
	}
	@Override
	public void get(String arg0) {
		// TODO Auto-generated method stub
		driver.get(arg0);
	}
	@Override
	public String getCurrentUrl() {
		// TODO Auto-generated method stub
		return driver.getCurrentUrl();
	}
	@Override
	public String getPageSource() {
		// TODO Auto-generated method stub
		return driver.getPageSource();
	}
	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}
	@Override
	public String getWindowHandle() {
		// TODO Auto-generated method stub
		return driver.getWindowHandle();
	}
	@Override
	public Set<String> getWindowHandles() {
		// TODO Auto-generated method stub
		return driver.getWindowHandles();
	}
	@Override
	public Options manage() {
		// TODO Auto-generated method stub
		return driver.manage();
	}
	@Override
	public Navigation navigate() {
		// TODO Auto-generated method stub
		return driver.navigate();
	}
	@Override
	public void quit() {
		// TODO Auto-generated method stub
		driver.quit();
	}
	@Override
	public TargetLocator switchTo() {
		// TODO Auto-generated method stub
		return driver.switchTo();
	}
	@Override
	public WebElement findElementByID(String value) {
		// TODO Auto-generated method stub
		return driver.findElement(By.id(value));
				
	}
	@Override
	public WebElement findElementByName(String value) {
		// TODO Auto-generated method stub
		return driver.findElement(By.name(value));
	}
	@Override
	public WebElement findElementByClass(String value) {
		// TODO Auto-generated method stub
		return driver.findElement(By.className("value"));
	}
	@Override
	public WebElement findElementBySelector(String value) {
		// TODO Auto-generated method stub
		return driver.findElement(By.cssSelector(value));
	}


	@Override
	public void waitUntilPresentByEelement(WebElement ele) {
		// TODO Auto-generated method stub
		try{
		fWait.until(ExpectedConditions.visibilityOf(ele));
		fWait.until(ExpectedConditions.elementToBeClickable(ele));
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	
	
}
