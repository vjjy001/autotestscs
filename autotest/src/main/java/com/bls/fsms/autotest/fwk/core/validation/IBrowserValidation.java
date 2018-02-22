package com.bls.fsms.autotest.fwk.core.validation;
import org.openqa.selenium.WebElement;

/**
 * Defined interface methods for Basebrowser class
 * 
 * 
 * @author JIAN_J
 *
 */
public interface IBrowserValidation {

	public boolean validate(WebElement iElement,IFWKValidation iValidation);
	public void waitUntilPresentByEelement(WebElement ele);
}
