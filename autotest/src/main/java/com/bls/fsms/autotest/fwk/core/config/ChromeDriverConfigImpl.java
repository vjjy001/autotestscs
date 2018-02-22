package com.bls.fsms.autotest.fwk.core.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * This Chrome driver capacities/options configuration based on
 * properties file
 * 
 * @author JIAN_J
 *
 */
public class ChromeDriverConfigImpl  {

	private Map<String,Boolean> props;
	
	public DesiredCapabilities getChromeCapabilities(){
		
		try {
			props = readProps();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DesiredCapabilities chromeCapabilities = DesiredCapabilities.chrome();
				
		for(Map.Entry<String, Boolean> entry :props.entrySet()){
			
			chromeCapabilities.setCapability(entry.getKey(),entry.getValue());
		}
		return chromeCapabilities;
	}
	
	public ChromeOptions getChromeOptions(){
		
		try {
			props = readProps();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ChromeOptions copts = new ChromeOptions();
		copts.setExperimentalOption("useAutomationExtension", false);
		for(Map.Entry<String, Boolean> entry :props.entrySet()){
			
			copts.setCapability(entry.getKey(),entry.getValue());
		}
		
		return copts;
	}
	 
	
	private Map<String,Boolean> readProps() throws IOException{
		
		Map<String, Boolean> tmpMap= new HashMap<String, Boolean>();
		Properties ps = new Properties();
		InputStream inStream = new FileInputStream("src/main/resources/selenium-config/web-driver/Chrome/DriverConfig.properties");
		ps.load(inStream);
		Iterator<Map.Entry<Object, Object>> iterator =  ps.entrySet().iterator();
		while(iterator.hasNext()){
			Map.Entry<Object, Object> element = iterator.next();
			String value = (String)element.getValue();
			String key = (String)element.getKey();
			tmpMap.put(key, stringToBoolean(value));
			System.out.println(key+value);
		}
		return tmpMap;
	}
	
	private Boolean stringToBoolean(String str){
		
		
		if(str.trim().equalsIgnoreCase("true")){
			return true;
			
		}else{
			return false;
		}
		
		
	}
}
