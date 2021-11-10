package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotels {
	public WebDriver driver;
	
	@FindBy(xpath="//select[@id='location']")
	 private WebElement location;
	@FindBy(xpath="//select[@id='hotels']")
	private WebElement  hotels;
	@FindBy(xpath="//select[@id='room_type']")
	 private WebElement room_Type;
	@FindBy(xpath="//select[@id='room_nos']")
	 private WebElement room_nos;
	@FindBy(xpath="//input[@name='datepick_in']")
	 private WebElement datepick_in;
	@FindBy(xpath="//input[@name='datepick_out']")
	 private WebElement datepick_out;
	@FindBy(xpath="//select[@name='adult_room']")
	 private WebElement adult_room;
	@FindBy(xpath="//select[@name='child_room']")
	 private WebElement child_room;
	@FindBy(xpath="//input[@id='radiobutton_0']")
	 private WebElement radio;
	@FindBy(xpath="//input[@id='continue']")
	 private WebElement con;
	
	public WebElement getRadio() {
		return radio;
	}	
	
	public WebElement getCon() {
		return con;
	}
	public void setCon(WebElement con) {
		this.con = con;
	}
	public Search_Hotels(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoom_Type() {
		return room_Type;
	}
	public WebElement getRoom_nos() {
		return room_nos;
	}
	public WebElement getDatepick_in() {
		return datepick_in;
	}
	public WebElement getDatepick_out() {
		return datepick_out;
	}
	public WebElement getAdult_room() {
		return adult_room;
	}
	public WebElement getChild_room() {
		return child_room;
	}
	public WebElement getSearch() {
		return Search;
	}
	@FindBy(xpath="//input[@name='Submit']")
	 private WebElement Search;


}
