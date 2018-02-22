package com.bls.fsms.autotest.fwk.core.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.bls.fsms.autotest.fwk.core.browser.BaseBrowser;
import com.bls.fsms.autotest.fwk.core.browser.ChromeBrowser;
import com.bls.fsms.autotest.fwk.core.browser.IEBrowser;
import com.bls.fsms.autotest.fwk.core.config.ChromeDriverConfigImpl;
import com.bls.fsms.autotest.fwk.core.config.IEDriverConfigImpl;
import com.bls.fsms.autotest.fwk.core.config.IautoTestConfig;


/**
 * This is singleton browser factory for IE/Chrome
 * 
 * @author JIAN_J
 *
 */
public class BrowserFactory extends AbstractBrowserFactory {

	private static IEBrowser ieBrowser;
	private static ChromeBrowser chromBrowser;
	
	public static BaseBrowser getIEBrowser(){
		
//		IautoTestConfig iConfig = new IEDriverConfigImpl();
//		DesiredCapabilities cappabilities = iConfig.getIECapabilities();
		IEDriverConfigImpl ieConfig = new IEDriverConfigImpl();
		InternetExplorerOptions ieOpts = ieConfig.getIEOptions();
		if(ieBrowser == null){
			WebDriver driver = new InternetExplorerDriver(ieOpts);
			ieBrowser = new IEBrowser(driver);
			return ieBrowser;
		}else{
			return ieBrowser;
		}
		
		
	}
	
	public static BaseBrowser getChromeBrowser(){
		
		ChromeDriverConfigImpl chromeConfig = new ChromeDriverConfigImpl();
		ChromeOptions copts = chromeConfig.getChromeOptions();
		
		if(chromBrowser == null){
			//ChromeOptions options = new ChromeOptions();			
			WebDriver driver = new ChromeDriver(copts);
			chromBrowser = new ChromeBrowser(driver);
			return chromBrowser;
		}else{
			return chromBrowser;
		}
		
		
	}
	
	public static void getIEBrowserTest(){
		
		IautoTestConfig iConfig = new IEDriverConfigImpl();
		DesiredCapabilities cappabilities = iConfig.getIECapabilities();
		
		
	}
}
