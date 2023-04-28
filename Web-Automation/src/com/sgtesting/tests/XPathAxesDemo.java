package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxesDemo {

	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//	enterSalaryForPersonSachinTendulkar();
	//	enterSalaryForPersonWhoIsNextToRahulDravid();
	//	makeStatusActiveForIndianFreedomFighter();
	//	makeStatusActiveWhoIsPreviousToRahulDravid();
	//	basedOnSalryTextFieldGetTableAttribute();
		basedOnTableReferenceEnterSalaryFor5thRecord();
	}
	
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			oBrowser.get("file:///D:/HTML/WebTableHTML.html");
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * case 1: Enter salary for Person Sachin Tendulkar
	 * following-sibling
	 */
	private static void enterSalaryForPersonSachinTendulkar()
	{
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td[4]/input")).sendKeys("25000");
	}

	
	/**
	 * case 2: Enter salary for Person Who is next to Rahul Dravid
	 * following
	 */
	private static void enterSalaryForPersonWhoIsNextToRahulDravid()
	{
		oBrowser.findElement(By.xpath("//td[text()='Rahul Dravid']/following::tr[1]/td[6]/input")).sendKeys("25000");
	}
	
	/**
	 * case 3: Make status enable for Indian freedom Fighter
	 * preceding-sibling
	 */
	private static void makeStatusActiveForIndianFreedomFighter()
	{
		oBrowser.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/preceding-sibling::td[1]/preceding-sibling::td[1]/input")).click();
	}
	
	/**
	 * case 4: Make status enable for Indian freedom Fighter
	 * preceding
	 */
	private static void makeStatusActiveWhoIsPreviousToRahulDravid()
	{
		oBrowser.findElement(By.xpath("//td[text()='Rahul Dravid']/preceding::tr[1]/td[1]/input")).click();
	}
	
	/**
	 * case 5: GEt Table Attribute Value
	 * ancestor
	 */
	private static void basedOnSalryTextFieldGetTableAttribute()
	{
		WebElement oTable=oBrowser.findElement(By.xpath("//input[@id='edit3']/ancestor::td/ancestor::tr[1]/ancestor::table"));
		System.out.println(oTable.getAttribute("id"));
	}
	
	/**
	 * case 6: Enter Salary for Sachin Tendulakr based on table reference
	 * descendant
	 */
	private static void basedOnTableReferenceEnterSalaryFor5thRecord()
	{
		oBrowser.findElement(By.xpath("//table/descendant::tr[5]/td[6]/input")).sendKeys("24000");
	}
}
