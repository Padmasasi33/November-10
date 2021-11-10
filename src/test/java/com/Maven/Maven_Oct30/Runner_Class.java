package com.Maven.Maven_Oct30;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Pom.Book_Hotel;
import com.Pom.Itineray_Page;
import com.Pom.Login_Page;
import com.Pom.Search_Hotels;

public class Runner_Class extends Base_Class {
	
	public static WebDriver driver=Base_Class.getBrowser("chrome");
	public static Search_Hotels sh=new Search_Hotels(driver);
	public static Login_Page lp=new Login_Page(driver);
	public static Book_Hotel bh=new Book_Hotel(driver);
	public static Itineray_Page ip=new Itineray_Page(driver);
	
	public static void main(String[] args) throws InterruptedException, IOException {		
		getUrl("https://adactinhotelapp.com/HotelAppBuild2/");		
		userName(lp.getUsername(), "Padmasasi");
		passWord(lp.getPassword(), "654321");
		click(lp.getLogin());
		thread_Sleep(4000);		
		dropDown("byValue", sh.getLocation(), "London");
		dropDown("byIndex", sh.getHotels(), "3");
		dropDown("byValue", sh.getRoom_Type(), "Double");
		dropDown("byValue", sh.getRoom_nos(), "3");
		passWord(sh.getDatepick_in(), "6/11/2021");
		passWord(sh.getDatepick_out(), "10/11/2021");	
		dropDown("byIndex", sh.getAdult_room(), "2");
		dropDown("byIndex", sh.getChild_room(), "2");
		click(sh.getSearch());
		thread_Sleep(3000);
		click(sh.getRadio());
		click(sh.getCon());
		thread_Sleep(3000);		
		userName(bh.getFirstname(), "Padmavathi");
		userName(bh.getLastname(), "chokkalingam");
		userName(bh.getAddress(), "Los Agenls" +  "USA");
		passWord(bh.getCc_num(),"1234567890123456" );
		dropDown("byIndex", bh.getCc_type(), "2");
		dropDown("byIndex",bh.getCc_exp_month() , "5");
		dropDown("byValue",bh.getCc_exp_year() , "2022");
		passWord(bh.getCc_cvv(), "369");
		click(bh.getBook_now());
		thread_Sleep(5000);			
		scroll(ip.getMy_itinerary());
		click(ip.getMy_itinerary());
		thread_Sleep(3000);
		takeScreenShot();

	}}


