package com.bls.fsms.autotest.examples.steps;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.sikuli.script.Screen;

//import com.gargoylesoftware.htmlunit.javascript.host.Set;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 * This examples shows how to using cucumber advanced syntax to pass definition 
 * variable/collection to steps which will robust the script
 * 
 * 
 * @author JIAN_J
 *
 */
public class CukeSteps {

	@Given("i test cucumber")
	public void testCuke() throws Throwable{
		System.out.println("test cucumber complete");
	}
	
	@And("i test cuke list:")
	public void i_test_cuke_list(List<String> list){
		
		ListIterator<String> iterator = list.listIterator();
		while(iterator.hasNext())
		System.out.println(iterator.next());
	}
	
	@Then("i test cuck data table:")
	public void i_test_data_table(DataTable table){
		//use the data table as list object
		List<Person> list = table.asList(Person.class);
		for(Person p : list){
			System.out.println(p+"from list");
		}
		
		//test data table as list map
		
		List<Map<String, String>> listMap = table.asMaps(String.class, String.class);
		
		ListIterator< Map<String, String>> lmapIterator = listMap.listIterator();
		while(lmapIterator.hasNext()){
			Map<String, String> map = lmapIterator.next();
			/*Set<> sets = map.entrySet();*/
			Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
			while (iterator.hasNext()) {
				Map.Entry<String, String> entry =(Map.Entry<String, String>)(iterator.next());
				String key = entry.getKey();
				String value = entry.getValue();
				System.out.println(key+value +"from keyentry");
			}
			//System.out.println(map.get("name")+map.get("age"));
			
			//System.out.println("From map" +entry.getKey()+":"+entry.getValue());
		}
		
	}
	
	@And("i test the input string \"(.*)\"")
	public void test_input_string(String str){
		System.out.println(str);
	}
	
	@And("i input (\\d+) in the cuck")
	public void input_d_in_the_cuck(int num){
		System.out.println(num);
	}
	
	@Given("i test hello")
	public void test_hello(){
		System.out.println("Second test feature");
	}
}
