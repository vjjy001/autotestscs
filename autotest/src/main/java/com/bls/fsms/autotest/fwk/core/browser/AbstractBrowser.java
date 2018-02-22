package com.bls.fsms.autotest.fwk.core.browser;

import org.openqa.selenium.WebElement;

public abstract class AbstractBrowser {

	public abstract WebElement findElementByText(String text);
	
	public abstract WebElement findElementByValue(String value);
	
	public abstract WebElement findElementByID(String value);
	
	public abstract WebElement findElementByName(String value);
	
	public abstract WebElement findElementByClass(String value);
	
	public abstract WebElement findElementBySelector(String value);
	
	

}
