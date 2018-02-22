package com.bls.fsms.autotest.fwk.core.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * This IE driver capacities/options configuration based on
 * properties file
 * 
 * @author JIAN_J
 *
 */
public class IEDriverConfigImpl implements IautoTestConfig{

	private Map<String,Boolean> props;
	
	/**
	 * 
	 * 
	 */
	@Deprecated
	public DesiredCapabilities getIECapabilities(){
		
		try {
			props = readProps();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
		for(Map.Entry<String, Boolean> entry :props.entrySet()){
			
			ieCapabilities.setCapability(entry.getKey(),entry.getValue());
		}
		//DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
		//ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		return ieCapabilities;
	}
	
	/**
	 * Upgrade set IE browser before start with InternetExplorerOptions
	 * 
	 * @return
	 */
	public InternetExplorerOptions getIEOptions(){
		try {
			props = readProps();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		InternetExplorerOptions ieopts = new InternetExplorerOptions();
		
		for(Map.Entry<String, Boolean> entry :props.entrySet()){
			
			ieopts.setCapability(entry.getKey(),entry.getValue());
		}
		//DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
		//ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		return ieopts;
	}
	
	private Map<String,Boolean> readProps() throws IOException{
		
		Map<String, Boolean> tmpMap= new HashMap<String, Boolean>();
		Properties ps = new Properties();
		InputStream inStream = new FileInputStream("src/main/resources/selenium-config/web-driver/InternetExplorer/DriverConfig.properties");
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
