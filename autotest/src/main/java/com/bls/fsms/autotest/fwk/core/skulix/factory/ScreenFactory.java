package com.bls.fsms.autotest.fwk.core.skulix.factory;

import org.sikuli.script.ImagePath;
import org.sikuli.script.Screen;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * This is Screen Factory based on Sikulix
 * 
 * @author JIAN_J
 *
 */
public class ScreenFactory extends AbstractImageFactory {

	public ScreenFactory(){
		
	}
	
	public static Screen getScreen(){
		ImagePath.add("src/test/resources/images/");
		return Screen.getPrimaryScreen();
	}

	
}



