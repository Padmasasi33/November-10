package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	public WebDriver driver;	
	public Book_Hotel(WebDriver driver3) {
		// TODO Auto-generated constructor stub
		this.driver=driver3;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//input[@id='first_name']")
    private WebElement firstname;	
	@FindBy(xpath = "//input[@id='last_name']")
	 private WebElement lastname;
	@FindBy(xpath ="//textarea[@id='address']")
	private WebElement address;
	@FindBy(xpath ="//input[@id='cc_num']")
	private WebElement cc_num;
	@FindBy(xpath ="//select[@id='cc_type']")
	private WebElement cc_type;
	@FindBy(xpath ="//select[@id='cc_exp_month']")
	private WebElement cc_exp_month;
	@FindBy(xpath ="//select[@id='cc_exp_year']")
	private WebElement cc_exp_year;
	@FindBy(xpath ="//input[@id='cc_cvv']")
	private WebElement cc_cvv;
	@FindBy(xpath ="//input[@id='book_now']")
	private WebElement book_now;
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCc_num() {
		return cc_num;
	}
	public WebElement getCc_type() {
		return cc_type;
	}
	public WebElement getCc_exp_month() {
		return cc_exp_month;
	}
	public WebElement getCc_exp_year() {
		return cc_exp_year;
	}
	public WebElement getCc_cvv() {
		return cc_cvv;
	}
	public WebElement getBook_now() {
		return book_now;
	}
	
	

}
