 package com.sgtesting.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtilityDemo {

	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		handleFrames();
	}
	
	private static void launchBrowser()
	{
		try
		{
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	private static void navigate()
	{
		try
		{
			
			oBrowser.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void handleFrames()
	{
		try
		{
			boolean v1=Utility.isFramePresent(oBrowser);
			if(v1) {
				System.out.println("Frmaes have found !!!");
				System.out.println(Utility.getFramesCount(oBrowser));
			}
			else
			{
				System.out.println("Frmaes have not found !!!");
			}
			WebElement oEle=oBrowser.findElement(By.xpath("//iframe[@title='All Packages']"));
			boolean status=Utility.getFrameControl(oBrowser, oEle);
			if(status)
			{
				oBrowser.findElement(By.linkText("org.openqa.selenium")).click();
			}
			
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
