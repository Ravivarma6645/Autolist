package com.Pages;

import org.openqa.selenium.By;

import com.Base.browser;

public class make_model extends browser{
	
	
	public By makemodel = By.xpath("//button[@class=\"jsx-2881544814 search-by-type-button first jsx-2527416160\"]");
	public By entermodelName = By.xpath("//input[@placeholder=\"Search make\"]");
	public By hyundaidropdown = By.xpath("//div[text()='Hyundai']");
	
	public void make_model_Click() throws Exception
	
	{
		launch_Url();
		click_Element(makemodel);
		
		
	}
	
	public void modelSelection() throws Exception
	{
		launch_Url();
		click_Element(makemodel);
		enter_Text(entermodelName, "hyundai");
		delay(5);
		element_Display(hyundaidropdown);
		click_Element(hyundaidropdown);
		
	}
	

}
