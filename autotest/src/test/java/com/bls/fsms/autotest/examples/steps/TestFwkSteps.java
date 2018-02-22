package com.bls.fsms.autotest.examples.steps;

import org.sikuli.script.Screen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;

import com.bls.fsms.autotest.Application;
import com.bls.fsms.autotest.fwk.core.browser.BaseBrowser;
import com.bls.fsms.autotest.fwk.core.factory.BrowserFactory;
import com.bls.fsms.autotest.fwk.core.skulix.factory.ScreenFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 * This example shows how to use cucumber-java based framework to test web application.
 * <br>
 * After learning from this example, tester able to know how to automatically access the website 
 * and complete the basic browser opertation like type text and click button.
 * 
 * <br>
 * The last example shows how to using sikulix to handle the non-html tag automation.
 * 
 * @author JIAN_J
 *
 */
public class TestFwkSteps{

	//test browser
	private BaseBrowser iedriver;  
	private BaseBrowser chromedriver;  		
	private Screen sc; 
	
	
	public TestFwkSteps(){
		sc = ScreenFactory.getScreen();
		iedriver = BrowserFactory.getIEBrowser();
		//chromedriver = BrowserFactory.getChromeBrowser();
	}
	
	
	@Given("i test Fwk")
	public void testCuke() throws Throwable{
		System.out.println("test cucumber complete");
		
	}
	
	
	/**
	 * Example for scripting login page
	 * @throws Throwable
	 */
	@Given("i test IE browser")
	public void testIE() throws Throwable{
		//iedriver.get("http://cfaptst01.psb.bls.gov:7402/LAUSToo/");
		iedriver.get("https://www.google.com/");
		//wait until page loaded
		//iedriver.waitUntilPresentByEelement(iedriver.findElementByName("userid"));
		//look up the input by id
		//iedriver.findElementByName("userid").sendKeys("state_in");
	
		//iedriver.findElementByName("passwd").sendKeys("Welcome1$");
		//click the button by value attribute
		//iedriver.findElementByValue("Login").click();
		
	}
		
	@Given("i test Chrome browser")
	public void testChrome() throws Throwable{
		//chromedriver.get("https://www.google.com/");
		//chromedriver.get("http://cfaptst01.psb.bls.gov:7402/LAUSToo/");
		//chromedriver.findElementByID("lst-ib").sendKeys("Hello Chrome");
		//chromedriver.findElementBySelector("#lst-ib").sendKeys("hello world");
	}
		
	@Given("i test the images")
	public void testScreen() throws Throwable{
		
		//Screen sc  = ScreenFactory.getScreen();
		
			//System.out.println("test thread");
			//ImagePath.setBundlePath("src/test/resources/images/");
			//String str = ImagePath.getBundlePath();
			//System.out.println(str);
			//System.out.println(Screen.getNumberScreens());
				 
			//sc.wait(15);
			//Pattern imgp = new Pattern("testText.PNG");
			System.out.println(sc.getCenter());
			//sc.click(imgp);
			
			//sc.click("testText.PNG");
			//sc.highlight();
		
		//ImagePath.add("src/test/resources/images");
		
	}
	
	
	
}
