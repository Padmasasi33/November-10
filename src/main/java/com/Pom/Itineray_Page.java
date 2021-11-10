package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itineray_Page {
	public WebDriver driver;
	@FindBy(id="my_itinerary")
	private WebElement my_itinerary;

	public Itineray_Page(WebDriver driver4) {
		// TODO Auto-generated constructor stub
		this.driver=driver4;
		PageFactory.initElements(driver, this);
	}

	public WebElement getMy_itinerary() {
		return my_itinerary;
	}
	

}
